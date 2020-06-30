package api.Restassured.Mg;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoggingResponse {

    //Acceptance Test 3: Verify Log Response

    @Test
    public void testLogResponse()
    {
        given().when().get("https://jsonplaceholder.typicode.com/posts").then().statusCode(200).log().all();
    }

}
