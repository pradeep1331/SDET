//package base;
//
//import java.io.IOException;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import design.ApiClient;
//import io.restassured.RestAssured;
//import io.restassured.response.Response;
//
//public class ApiBase implements ApiClient{
//
//	private String baseURI;
//    private String authToken;
//    private ObjectMapper objectMapper;
//
//    private static ThreadLocal<Map<String, String>> headersThreadLocal = new ThreadLocal<>();
//
//
//    public ApiBase() {
//        this.objectMapper = new ObjectMapper();
//    }
//
//    public Response get(String endpoint) {
//        return RestAssured.given().headers(getCommonHeaders()).when().get(baseURI + endpoint);
//    }
//
//    public Response post(String endpoint, Object requestBody) {
//        return RestAssured.given().headers(getCommonHeaders()).body(requestBody).when().post(baseURI + endpoint);
//    }
//
//
//    public Response put(String endpoint, Object requestBody) {
//        return RestAssured.given().headers(getCommonHeaders()).body(requestBody).when().put(baseURI + endpoint);
//    }
//
//
//    public Response delete(String endpoint) {
//        return RestAssured.given().headers(getCommonHeaders()).when().delete(baseURI + endpoint);
//    }
//
//
//    public void setBaseURI(String baseURI) {
//        this.baseURI = baseURI;
//    }
//
//
//    public void setAuthToken(String authToken) {
//        this.authToken = authToken;
//    }
//
//
//    public void setCommonHeaders(Map<String, String> headers) {
//        RestAssured.given().headers(headers);
//    }
//
//
//    public String getResponseBodyAsString(Response response) {
//        return response.getBody().asString();
//    }
//
//
//    public <T> T getResponseBodyAsObject(Response response, Class<T> responseClass) throws IOException {
//        String responseBody = response.getBody().asString();
//        return objectMapper.readValue(responseBody, responseClass);
//    }
//
//
//    public String convertObjectToJson(Object object) throws IOException {
//        return objectMapper.writeValueAsString(object);
//    }
//
//
//    public <T> T convertJsonToObject(String jsonString, Class<T> objectClass) throws IOException {
//        return objectMapper.readValue(jsonString, objectClass);
//    }
//
//
//    public void validateResponseStatusCode(Response response, int expectedStatusCode) {
//        response.then().statusCode(expectedStatusCode);
//    }
//
//
//    public void validateResponseSchema(Response response, String schemaFilePath) {
//        // Implement JSON schema validation using your preferred library or method.
//    }
//
//
//    public ObjectMapper getObjectMapper() {
//        return objectMapper;
//    }
//
//    private Map<String, String> getCommonHeaders() {
//        // Implement logic to return common headers if needed.
//        // For example, you can set the authentication header here using "authToken".
//        Map<String, String> headers = new HashMap<String, String>();
//        // headers.put("Authorization", "Bearer " + authToken);
//        // return headers;
//        return headers;
//}
//
//}
//
//
//
//
