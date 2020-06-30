package api.Restassured.Mg;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

// Acceptance Test 4: Post information into Posts via, Postman


public class PostRequest {

    public static HashMap map=new HashMap();

    @BeforeClass
    public void postData()
    {
      map.put("UserId", RestUtils.getUserId());
      map.put("Id", RestUtils.getId());
      map.put("Title", RestUtils.getTitle());
      map.put("Body", RestUtils.getBody());

        RestAssured.baseURI="https://jsonplaceholder.typicode.com/posts/1";

    }

    @Test
    public void testPost()
    {
        given()
                .contentType("application/json")
                .body(map).when().post()
                        .then().statusCode(201);










    }
}
