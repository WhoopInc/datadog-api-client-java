/*
 * (C) Datadog, Inc. 2019
 * All rights reserved
 * Licensed under a 3-clause BSD style license (see LICENSE)
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.datadog.api.v1.client.api;

import static com.github.tomakehurst.wiremock.client.WireMock.*;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.model.OrgBilling;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error415;
import com.datadog.api.v1.client.model.IdpResponse;
import com.datadog.api.v1.client.model.Org;
import com.datadog.api.v1.client.model.OrgCreateBody;
import com.datadog.api.v1.client.model.OrgCreateResponse;
import com.datadog.api.v1.client.model.OrgListResponse;
import com.datadog.api.v1.client.model.OrgResponse;
import com.datadog.api.v1.client.model.OrgSettings;
import com.datadog.api.v1.client.model.OrgSettingsSaml;
import com.datadog.api.v1.client.model.OrgSettingsSamlAutocreateUsersDomains;
import com.datadog.api.v1.client.model.OrgSubscription;
import com.github.tomakehurst.wiremock.client.MappingBuilder;

import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for OrgsApi
 */
public class OrgsApiTest extends V1ApiTest{

    private final OrgsApi api = new OrgsApi(generalApiUnitTestClient);
    private final String apiUri = "/api/v1/org";
    private final String fixturePrefix = "org_fixtures";

    /**
     * Create child-organization.
     *
     * ## Overview This endpoint requires the [multi-org account](https://docs.datadoghq.com/account_management/multi_organization/) feature and must be enabled by [contacting support](https://docs.datadoghq.com/help/). ### ARGUMENTS * **&#x60;name&#x60;** [*required*]: The name of the new child-organization, limited to 32 characters. * **&#x60;subscription&#x60;** [*required*]: A JSON array of subscription type. Types available are **trial**, **free**, and **pro**. * **&#x60;billing&#x60;** [*required*]: A JSON array of billing type. Note that only **parent_billing** is supported.  Once a new child-organization is created, you can interact with it by using the **org.public_id**, **api_key.key**, and **application_key.hash** provided in the response.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture data cannot be loaded
     */
    @Test
    public void createChildOrgTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(apiUri, fixturePrefix+"/create_child_org.json", "post");
        stubFor(stub);

        // CreateBody can contain anything since we're mocking the response
        // Just confirmation that the proper fields can be set
        OrgCreateBody orgCreateBody = new OrgCreateBody()
        .name("My Org")
        .billing(new OrgBilling().type("parent_billing"))
        .subscription(new OrgSubscription().type("pro"));
        OrgCreateResponse response = api.createChildOrg(orgCreateBody).execute();

        // Assert values match whats in create_child_org.json
        assertEquals(response.getOrg().getName(), "My Org");
        assertEquals(response.getOrg().getPublicId(), "axd2s");
        assertEquals(response.getOrg().getSubscription().getType(), "pro");
        assertEquals(response.getOrg().getBilling().getType(), "parent_billing");
        assertEquals(response.getUser().getName(), "Organization admin");
        assertEquals(response.getUser().getHandle(), "test@datadoghq.com");
        assertEquals(response.getApiKey().getCreatedBy(), "user");
        assertEquals(response.getApiKey().getKey(), "6ccdfb88ff1aa63192c326");
        assertEquals(response.getApplicationKey().getOwner(), "Organization admin");
        assertEquals(response.getApplicationKey().getHash(), "88e5ae6a71f51d1d5a0071a24f");
    }

  
    /**
     * Get the organization
     *
     * ## Overview Gets information about your organization
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the fixture file cannot be loaded
     */
    @Test
    public void getOrgTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(apiUri, fixturePrefix+"/get_orgs.json", "get");
        stubFor(stub);

        OrgListResponse response = api.getOrg().execute();

        // Assert values match whats in get_orgs.json fixture
        assertEquals(response.getOrgs().size(), 1);
        assertEquals(response.getOrgs().get(0).getName(), "My Org");
        assertEquals(response.getOrgs().get(0).getPublicId(), "axd2s");
        assertEquals(response.getOrgs().get(0).getBilling().getType(), "bill-parent");
        assertEquals(response.getOrgs().get(0).getSubscription().getType(), "pro");
    }


    /**
     * Update the organization
     *
     * ## Overview Updates the organization ### ARGUMENTS * **&#x60;name&#x60;** [*optional*]: The organization name.  * **&#x60;settings&#x60;** [*optional*]: A JSON array of settings. Settings include:    * **&#x60;saml&#x60;**: Set the boolean property **enabled** to enable or disable single sign on with SAML. See the [SAML documentation](https://docs.datadoghq.com/account_management/saml) for more information about all SAML settings.    * **&#x60;saml_idp_initiated_login&#x60;**: has one property **enabled** (boolean).    * **&#x60;saml_strict_mode&#x60;**: has one property **enabled** (boolean).    * **&#x60;saml_autocreate_users_domains&#x60;**: has two properties: **enabled** (boolean) and **domains** which is a list of domains without the @ symbol.
     *
     * @throws ApiException
     *          if the Api call fail
     * @throws IOException
     *          if the fixture file cannot be loaded
     */
    @Test
    public void updateOrgTest() throws ApiException, IOException {
        String publicId = "12345";
        MappingBuilder stub = setupStub(apiUri + "/" + publicId, fixturePrefix+"/update_org.json", "put");
        stubFor(stub);

        // Update Body can contain anything since we're mocking the response
        // Just confirmation that the proper fields can be set
        Org org = new Org().name("My Org").settings(
            new OrgSettings().saml(
                new OrgSettingsSaml().enabled(true)
            )
            .samlIdpInitiatedLogin(
                new OrgSettingsSaml().enabled(true)
            )
            .samlStrictMode(
                new OrgSettingsSaml().enabled(true)
            )
            .samlAutocreateUsersDomains(
                new OrgSettingsSamlAutocreateUsersDomains().enabled(true).addDomainsItem("my-org.com").addDomainsItem("example.com")
            )
        );
        OrgResponse response = api.updateOrg(publicId, org).execute();

        // Assert values match whats in update_orgs.json fixture
        assertEquals(response.getOrg().getPublicId(), "axd2s");
        assertEquals(response.getOrg().getName(), "My Org");
        assertEquals(response.getOrg().getBilling(), new OrgBilling());
        assertEquals(response.getOrg().getCreated(), "2016-10-06 21:41:12");
        assertEquals(response.getOrg().getSettings().getSamlCanBeEnabled(), true);
        assertEquals(response.getOrg().getSettings().getSamlIdpInitiatedLogin().getEnabled(), true);
        assertEquals(response.getOrg().getSettings().getSaml().getEnabled(), true);
        assertEquals(response.getOrg().getSettings().getSamlIdpEndpoint(), "https://idp.datadoghq.com/idp/profile/SAML2/POST/SSO");
        List<String> expectedDomains = new ArrayList<String>();
        expectedDomains.add("my-org.com");
        expectedDomains.add("example.com");
        assertEquals(response.getOrg().getSettings().getSamlAutocreateUsersDomains().getDomains(), expectedDomains);
        assertEquals(response.getOrg().getSettings().getSamlAutocreateUsersDomains().getEnabled(), true);
        assertEquals(response.getOrg().getSettings().getSamlLoginUrl(), "https://app.datadoghq.com/account/login/id/c81e728d9");
        assertEquals(response.getOrg().getSettings().getSamlIdpMetadataUploaded(), true);
        assertEquals(response.getOrg().getSettings().getSamlStrictMode().getEnabled(), true);
        assertEquals(response.getOrg().getSubscription().getType(), "pro");
    }


    /**
     * Upload IdP metadata
     *
     * ## Overview There are a couple of options for updating the Identity Provider (IdP) metadata from your SAML IdP. * **Multipart Form-Data**: Post the IdP metadata file using a form post. ### Multipart Form-Data #### Headers * **&#x60;Content-Type: multipart/form-data&#x60;** #### Arguments * **&#x60;public_id&#x60;** [*required*]: The public id of the org you want to update metadata for. ### MultiPart Form Data Body * The encoded data for the IDP settings to upload #### Headers * **&#x60;Content-Type: multipart/form-data&#x60;** #### Arguments * The body must contain the contents of your IdP metadata XML file.
     *
     * @throws ApiException
     *          if the Api call fails
     * @throws IOException
     *          if the test fixture can't be accessed
     */
    @Test
    public void uploadIdPForOrgTest() throws ApiException, IOException {
        MappingBuilder stub = setupStub(apiUri+"/123456/idp_metadata", fixturePrefix+"/update_idp_meta.json", "post");
        beginStub(stub);

        String publicId = "123456";
        File idpFile = new File("meta_file");
        IdpResponse response = api.uploadIdPForOrg(publicId).idpFile(idpFile).execute(); //.uploadIdPForOrg(publicId);

        assertEquals(response.getMessage(), "IdP metadata successfully uploaded for org Datadog HQ");
    }

}