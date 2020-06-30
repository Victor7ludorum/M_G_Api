package api.framework;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class RestAssuredConfigDefaults {

    @BeforeSuite(alwaysRun = true)

    public void configure()
    {

        RestAssured.baseURI = "https://jsonplaceholder";
        //RestAssured.port = 8080;
        RestAssured.basePath = "posts?userId=1";

    }
}
