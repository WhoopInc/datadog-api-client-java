# datadog-api-v1-client

Datadog API Collection

- API version: 1.0

Collection of all Datadog Public endpoints.


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.datadoghq</groupId>
  <artifactId>datadog-api-v1-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.datadoghq:datadog-api-v1-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/datadog-api-v1-client-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.datadog.api.client.v1.*;
import com.datadog.api.client.v1.auth.*;
import com.datadog.api.client.v1.model.*;
import com.datadog.api.client.v1.api.AwsIntegrationApi;

public class AwsIntegrationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount awSAccount = new AWSAccount(); // AWSAccount | AWS request object
        try {
            Map<String, String> result = apiInstance.createAWSAccount(awSAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#createAWSAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.datadoghq.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AwsIntegrationApi* | [**createAWSAccount**](docs/AwsIntegrationApi.md#createAWSAccount) | **POST** /api/v1/integration/aws | Create an AWS Account
*AwsIntegrationApi* | [**deleteAWSAccount**](docs/AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /api/v1/integration/aws | Delete an AWS Account
*AwsIntegrationApi* | [**getAllAWSAccounts**](docs/AwsIntegrationApi.md#getAllAWSAccounts) | **GET** /api/v1/integration/aws | Get Installed AWS Accounts
*AwsIntegrationApi* | [**updateAWSAccount**](docs/AwsIntegrationApi.md#updateAWSAccount) | **PUT** /api/v1/integration/aws | Update an AWS Account
*DowntimesApi* | [**cancelDowntime**](docs/DowntimesApi.md#cancelDowntime) | **DELETE** /api/v1/downtime/{downtime_id} | Cancel a downtime
*DowntimesApi* | [**cancelDowntimesByScope**](docs/DowntimesApi.md#cancelDowntimesByScope) | **POST** /api/v1/downtime/cancel/by_scope | Cancel downtimes by scope
*DowntimesApi* | [**createDowntime**](docs/DowntimesApi.md#createDowntime) | **POST** /api/v1/downtime | Schedule a downtime
*DowntimesApi* | [**getAllDowntimes**](docs/DowntimesApi.md#getAllDowntimes) | **GET** /api/v1/downtime | Get all downtimes
*DowntimesApi* | [**getDowntime**](docs/DowntimesApi.md#getDowntime) | **GET** /api/v1/downtime/{downtime_id} | Get a downtime
*DowntimesApi* | [**updateDowntime**](docs/DowntimesApi.md#updateDowntime) | **PUT** /api/v1/downtime/{downtime_id} | Update a downtime
*MonitorsApi* | [**createMonitor**](docs/MonitorsApi.md#createMonitor) | **POST** /api/v1/monitor | Create a new Monitor
*MonitorsApi* | [**deleteMonitor**](docs/MonitorsApi.md#deleteMonitor) | **DELETE** /api/v1/monitor/{monitor_id} | Delete the specified monitor.
*MonitorsApi* | [**editMonitor**](docs/MonitorsApi.md#editMonitor) | **PUT** /api/v1/monitor/{monitor_id} | Edit the specified monitor
*MonitorsApi* | [**getAllMonitors**](docs/MonitorsApi.md#getAllMonitors) | **GET** /api/v1/monitor | Get details about the specified monitor.
*MonitorsApi* | [**getMonitor**](docs/MonitorsApi.md#getMonitor) | **GET** /api/v1/monitor/{monitor_id} | Get details about the specified monitor.
*MonitorsApi* | [**validateMonitor**](docs/MonitorsApi.md#validateMonitor) | **POST** /api/v1/monitor/validate | 
*SloApi* | [**bulkPartialDeleteSlo**](docs/SloApi.md#bulkPartialDeleteSlo) | **POST** /api/v1/slo/bulk_delete | Delete (or partially delete) multiple service level objective objects.
*SloApi* | [**createSlo**](docs/SloApi.md#createSlo) | **POST** /api/v1/slo | Create a service level objective object.
*SloApi* | [**deleteSlo**](docs/SloApi.md#deleteSlo) | **DELETE** /api/v1/slo/{slo_id} | Delete the specified service level objective object.
*SloApi* | [**editSlo**](docs/SloApi.md#editSlo) | **PUT** /api/v1/slo/{slo_id} | Edit the specified service level objective
*SloApi* | [**getSlo**](docs/SloApi.md#getSlo) | **GET** /api/v1/slo/{slo_id} | Get a service level objective object
*SloApi* | [**getSlos**](docs/SloApi.md#getSlos) | **GET** /api/v1/slo | Get multiple service level objective objects by their IDs.
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /api/v1/user | Create user
*UsersApi* | [**disableUser**](docs/UsersApi.md#disableUser) | **DELETE** /api/v1/user/{user_handle} | Disable user
*UsersApi* | [**getAllUsers**](docs/UsersApi.md#getAllUsers) | **GET** /api/v1/user | Get all users
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /api/v1/user/{user_handle} | Get user
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /api/v1/user/{user_handle} | Update user


## Documentation for Models

 - [AWSAccount](docs/AWSAccount.md)
 - [CancelDowntimesByScopeRequest](docs/CancelDowntimesByScopeRequest.md)
 - [CanceledDowntimesIds](docs/CanceledDowntimesIds.md)
 - [Creator](docs/Creator.md)
 - [Downtime](docs/Downtime.md)
 - [DowntimeRecurrence](docs/DowntimeRecurrence.md)
 - [Error400](docs/Error400.md)
 - [Error401](docs/Error401.md)
 - [Error402](docs/Error402.md)
 - [Error403](docs/Error403.md)
 - [Error404](docs/Error404.md)
 - [Error405](docs/Error405.md)
 - [Error409](docs/Error409.md)
 - [Error415](docs/Error415.md)
 - [Error429](docs/Error429.md)
 - [Error500](docs/Error500.md)
 - [Error503](docs/Error503.md)
 - [Monitor](docs/Monitor.md)
 - [MonitorOptions](docs/MonitorOptions.md)
 - [MonitorOverallStates](docs/MonitorOverallStates.md)
 - [MonitorState](docs/MonitorState.md)
 - [MonitorStateGroup](docs/MonitorStateGroup.md)
 - [MonitorStateGroupValue](docs/MonitorStateGroupValue.md)
 - [MonitorThresholdWindowOptions](docs/MonitorThresholdWindowOptions.md)
 - [MonitorThresholds](docs/MonitorThresholds.md)
 - [ServiceLevelObjective](docs/ServiceLevelObjective.md)
 - [ServiceLevelObjectiveDeleted](docs/ServiceLevelObjectiveDeleted.md)
 - [ServiceLevelObjectiveQuery](docs/ServiceLevelObjectiveQuery.md)
 - [ServiceLevelObjectiveResponse](docs/ServiceLevelObjectiveResponse.md)
 - [ServiceLevelObjectivesBulkDeleted](docs/ServiceLevelObjectivesBulkDeleted.md)
 - [ServiceLevelObjectivesBulkDeletedData](docs/ServiceLevelObjectivesBulkDeletedData.md)
 - [ServiceLevelObjectivesBulkDeletedErrors](docs/ServiceLevelObjectivesBulkDeletedErrors.md)
 - [SloThreshold](docs/SloThreshold.md)
 - [SloTimeframe](docs/SloTimeframe.md)
 - [User](docs/User.md)
 - [UserCreatePayload](docs/UserCreatePayload.md)
 - [UserCreateResponse](docs/UserCreateResponse.md)
 - [UserDisableResponse](docs/UserDisableResponse.md)
 - [UserGetAllResponse](docs/UserGetAllResponse.md)
 - [UserGetResponse](docs/UserGetResponse.md)
 - [UserUpdatePayload](docs/UserUpdatePayload.md)
 - [UserUpdateResponse](docs/UserUpdateResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyAuth


- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string

### appKeyAuth


- **Type**: API key
- **API key parameter name**: application_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author


