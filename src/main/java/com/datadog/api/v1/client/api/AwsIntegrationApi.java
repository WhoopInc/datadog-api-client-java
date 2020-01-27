package com.datadog.api.v1.client.api;

import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiResponse;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.Pair;

import javax.ws.rs.core.GenericType;

import com.datadog.api.v1.client.model.AWSAccount;
import com.datadog.api.v1.client.model.AWSAccountCreateResponse;
import com.datadog.api.v1.client.model.AWSAccountListResponse;
import com.datadog.api.v1.client.model.Error400;
import com.datadog.api.v1.client.model.Error403;
import com.datadog.api.v1.client.model.Error404;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AwsIntegrationApi {
  private ApiClient apiClient;

  public AwsIntegrationApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AwsIntegrationApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

private ApiResponse<AWSAccountCreateResponse> createAWSAccountWithHttpInfo(AWSAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createAWSAccount");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSAccountCreateResponse> localVarReturnType = new GenericType<AWSAccountCreateResponse>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.createAWSAccount", localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIcreateAWSAccountRequest {
    private AWSAccount body;

    private APIcreateAWSAccountRequest() {
    }
    

    /**
     * Set body
     * @param body AWS request object (required)
     * @return APIcreateAWSAccountRequest
     */
    public APIcreateAWSAccountRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute createAWSAccount request
     * @return AWSAccountCreateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSAccountCreateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute createAWSAccount request with HTTP info returned
     * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSAccountCreateResponse> executeWithHttpInfo() throws ApiException {
      return createAWSAccountWithHttpInfo(body);
    }
  }

  /**
   * Create an AWS Account
   * ### Overview Create the AWS Account with the provided values ### Arguments * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID.  * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info.  * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID.  * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.x. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation  * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration.  * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
   * @return createAWSAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIcreateAWSAccountRequest createAWSAccount() throws ApiException {
    return new APIcreateAWSAccountRequest();
  }

private ApiResponse<Object> deleteAWSAccountWithHttpInfo(AWSAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling deleteAWSAccount");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.deleteAWSAccount", localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIdeleteAWSAccountRequest {
    private AWSAccount body;

    private APIdeleteAWSAccountRequest() {
    }
    

    /**
     * Set body
     * @param body AWS request object (required)
     * @return APIdeleteAWSAccountRequest
     */
    public APIdeleteAWSAccountRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute deleteAWSAccount request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute deleteAWSAccount request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return deleteAWSAccountWithHttpInfo(body);
    }
  }

  /**
   * Delete an AWS Account
   * ### Overview Delete the AWS Account matching the specified account_id and role_name parameters ### Arguments * **&#x60;account_id&#x60;** [*required*, *default* &#x3D; **None**]: Delete the AWS account that   matches this account_id.  * **&#x60;role_name&#x60;** [*required*, *default* &#x3D; **None**]: Delete the AWS account that   matches this role_name.
   * @return deleteAWSAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIdeleteAWSAccountRequest deleteAWSAccount() throws ApiException {
    return new APIdeleteAWSAccountRequest();
  }

private ApiResponse<AWSAccountCreateResponse> generateNewAWSExternalIDWithHttpInfo(AWSAccount body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling generateNewAWSExternalID");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/generate_new_external_id";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSAccountCreateResponse> localVarReturnType = new GenericType<AWSAccountCreateResponse>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.generateNewAWSExternalID", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgenerateNewAWSExternalIDRequest {
    private AWSAccount body;

    private APIgenerateNewAWSExternalIDRequest() {
    }
    

    /**
     * Set body
     * @param body Generate New AWS External ID request object (required)
     * @return APIgenerateNewAWSExternalIDRequest
     */
    public APIgenerateNewAWSExternalIDRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Execute generateNewAWSExternalID request
     * @return AWSAccountCreateResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSAccountCreateResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute generateNewAWSExternalID request with HTTP info returned
     * @return ApiResponse&lt;AWSAccountCreateResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSAccountCreateResponse> executeWithHttpInfo() throws ApiException {
      return generateNewAWSExternalIDWithHttpInfo(body);
    }
  }

  /**
   * Generate New External ID
   * ###Overview Generate new AWS external ID for a specific integrated account ### Arguments * **&#x60;account_id&#x60;** [*required*]: Generate new external ID for the AWS account that   matches this account_id.  * **&#x60;role_name&#x60;** [*required*]: Generate new external ID for the AWS account that   matches this role_name.
   * @return generateNewAWSExternalIDRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgenerateNewAWSExternalIDRequest generateNewAWSExternalID() throws ApiException {
    return new APIgenerateNewAWSExternalIDRequest();
  }

private ApiResponse<AWSAccountListResponse> getAllAWSAccountsWithHttpInfo(String accountId, String roleName, String accessKeyId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<AWSAccountListResponse> localVarReturnType = new GenericType<AWSAccountListResponse>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.getAllAWSAccounts", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIgetAllAWSAccountsRequest {
    private String accountId;
    private String roleName;
    private String accessKeyId;

    private APIgetAllAWSAccountsRequest() {
    }
    

    /**
     * Set accountId
     * @param accountId Only return AWS accounts that matches this account_id. (optional)
     * @return APIgetAllAWSAccountsRequest
     */
    public APIgetAllAWSAccountsRequest accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
    

    /**
     * Set roleName
     * @param roleName Only return AWS accounts that matches this role_name. (optional)
     * @return APIgetAllAWSAccountsRequest
     */
    public APIgetAllAWSAccountsRequest roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }
    

    /**
     * Set accessKeyId
     * @param accessKeyId Only return AWS accounts that matches this access_key_id. (optional)
     * @return APIgetAllAWSAccountsRequest
     */
    public APIgetAllAWSAccountsRequest accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
    

    /**
     * Execute getAllAWSAccounts request
     * @return AWSAccountListResponse
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public AWSAccountListResponse execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute getAllAWSAccounts request with HTTP info returned
     * @return ApiResponse&lt;AWSAccountListResponse&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
         <tr><td> 404 </td><td> Item Not Found </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<AWSAccountListResponse> executeWithHttpInfo() throws ApiException {
      return getAllAWSAccountsWithHttpInfo(accountId, roleName, accessKeyId);
    }
  }

  /**
   * Get Installed AWS Accounts
   * ### Overview Get All Installed AWS Accounts ### Arguments * **&#x60;account_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.  * **&#x60;role_name&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.  * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.
   * @return getAllAWSAccountsRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIgetAllAWSAccountsRequest getAllAWSAccounts() throws ApiException {
    return new APIgetAllAWSAccountsRequest();
  }

private ApiResponse<List<String>> listAvailableAWSNamespacesWithHttpInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws/available_namespace_rules";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.listAvailableAWSNamespaces", localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIlistAvailableAWSNamespacesRequest {

    private APIlistAvailableAWSNamespacesRequest() {
    }
    

    /**
     * Execute listAvailableAWSNamespaces request
     * @return List&lt;String&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public List<String> execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute listAvailableAWSNamespaces request with HTTP info returned
     * @return ApiResponse&lt;List&lt;String&gt;&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<List<String>> executeWithHttpInfo() throws ApiException {
      return listAvailableAWSNamespacesWithHttpInfo();
    }
  }

  /**
   * List available namespaces.
   * ### Overview List all namespace rules for a given Datadog-AWS integration.
   * @return listAvailableAWSNamespacesRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIlistAvailableAWSNamespacesRequest listAvailableAWSNamespaces() throws ApiException {
    return new APIlistAvailableAWSNamespacesRequest();
  }

private ApiResponse<Object> updateAWSAccountWithHttpInfo(AWSAccount body, String accountId, String roleName, String accessKeyId) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateAWSAccount");
    }
    
    // create path and map variables
    String localVarPath = "/api/v1/integration/aws";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "account_id", accountId));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "role_name", roleName));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "access_key_id", accessKeyId));

    
    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiKeyAuth", "appKeyAuth" };

    GenericType<Object> localVarReturnType = new GenericType<Object>() {};
    return apiClient.invokeAPI("AwsIntegrationApi.updateAWSAccount", localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
  }

  public class APIupdateAWSAccountRequest {
    private AWSAccount body;
    private String accountId;
    private String roleName;
    private String accessKeyId;

    private APIupdateAWSAccountRequest() {
    }
    

    /**
     * Set body
     * @param body AWS request object (required)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest body(AWSAccount body) {
      this.body = body;
      return this;
    }
    

    /**
     * Set accountId
     * @param accountId Only return AWS accounts that matches this account_id. (optional)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest accountId(String accountId) {
      this.accountId = accountId;
      return this;
    }
    

    /**
     * Set roleName
     * @param roleName Only return AWS accounts that matches this role_name. *It is required if account_id is specified.* (optional)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest roleName(String roleName) {
      this.roleName = roleName;
      return this;
    }
    

    /**
     * Set accessKeyId
     * @param accessKeyId Only return AWS accounts that matches this access_key_id. *It required if none of the other two options are specified.* (optional)
     * @return APIupdateAWSAccountRequest
     */
    public APIupdateAWSAccountRequest accessKeyId(String accessKeyId) {
      this.accessKeyId = accessKeyId;
      return this;
    }
    

    /**
     * Execute updateAWSAccount request
     * @return Object
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public Object execute() throws ApiException {
      return this.executeWithHttpInfo().getData();
    }

    /**
     * Execute updateAWSAccount request with HTTP info returned
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException if fails to make API call
     * @http.response.details
       <table summary="Response Details" border="1">
         <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
         <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
         <tr><td> 400 </td><td> Bad Request </td><td>  -  </td></tr>
         <tr><td> 403 </td><td> Authentication error </td><td>  -  </td></tr>
       </table>
     
     */
    
    public ApiResponse<Object> executeWithHttpInfo() throws ApiException {
      return updateAWSAccountWithHttpInfo(body, accountId, roleName, accessKeyId);
    }
  }

  /**
   * Update an AWS Account
   * ### Overview Update the AWS Account based on the provided values ### Arguments * **&#x60;account_id&#x60;** [*required if role_name is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this account_id.  * **&#x60;role_name&#x60;** [*required if account_id is specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this role_name.  * **&#x60;access_key_id&#x60;** [*required if none of the other two options are specified*, *default* &#x3D; **None**]: Only return AWS accounts that   matches this access_key_id.  ### Payload * **&#x60;account_id&#x60;** [*required*]: Your AWS Account ID without dashes. Consult the Datadog AWS   integration to learn more about your AWS account ID.  * **&#x60;role_name&#x60;** [*required*]: Your Datadog role delegation name. For more information about you   AWS account Role name, see the Datadog AWS integration configuration info.  * **&#x60;access_key_id&#x60;** [*optional*, *default* &#x3D; **None**]: If your AWS account is a GovCloud or   China account, enter the corresponding Access Key ID.  * **&#x60;filter_tags&#x60;** [*optional*, *default* &#x3D; **None**]: The array of EC2 tags (in the form key:value)   defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ?   (for single characters) and * (for multiple characters) can also be used. Only hosts that match one   of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given   tag can also be excluded by adding ! before the tag.   e.g. env:production,instance-type:c1.*,!region:us-east-1 For more information on EC2 tagging,   see the AWS tagging documentation.  * **&#x60;host_tags&#x60;** [*optional*, *default* &#x3D; **None**]: Array of tags (in the form key:value) to add   to all hosts and metrics reporting through this integration.  * **&#x60;account_specific_namespace_rules&#x60;** [*optional*, *default* &#x3D; **None**]: An object (in the form   {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for   specific AWS namespaces for this AWS account only. A list of namespaces can be found at the   /v1/integration/aws/available_namespace_rules endpoint.
   * @return updateAWSAccountRequest
   * @throws ApiException if fails to make API call
   
   
   */
  
  public APIupdateAWSAccountRequest updateAWSAccount() throws ApiException {
    return new APIupdateAWSAccountRequest();
  }
}
