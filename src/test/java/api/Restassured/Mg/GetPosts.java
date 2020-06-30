package api.Restassured.Mg;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetPosts {

    //Acceptance Test 2: GetPosts using StatusCode and StatusLine to Validate

    @Test
    public void getDetails()
    {
        given().when()
                .get("https://jsonplaceholder.typicode.com/posts")
                    .then().statusCode(200).statusLine("HTTP/1.1 200 OK");

    }



}
