package api.Restassured.Mg;

import api.Restassured.Mg.common.Endpoint;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

//Acceptance Test 5: Get Posts by calling them by Defaults Param Endpoint

public class ValidatePostsDefaults {

    @Test(groups = "test")
      public void ValidateWithDefaults()
      {
          given().get(Endpoint.GET_POSTS).then().statusCode(200).log().all();
      }
}
