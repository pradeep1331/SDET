package rest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class restassured {

    public static void main(String[] args) {

        RequestSpecification reqspec = RestAssured.given()
                .baseUri("https://reqres.in/")
                .param("")
                .queryParam("")
                .contentType("")
                .header("","");

        Response respo = reqspec.get("/api/users/2");
        respo.getBody().asString();
        respo.getStatusCode();
        JsonPath jpath = new JsonPath(respo.getBody().asString());
        System.out.println(jpath.getString("data.id"));

    }
}
