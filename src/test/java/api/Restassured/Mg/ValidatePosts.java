package api.Restassured.Mg;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/*
Acceptance Test 1:  ValidatePosts by UserId 1-100
 */

public class ValidatePosts {

    @Test(priority = 1)
    public void validatePosts1() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=1").then().statusCode(200).log().all();
    }

    @Test(priority = 2)
    public void validatePosts2() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=2").then().statusCode(200).log().all();
    }

    @Test(priority = 3)
    public void validatePosts3() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=3").then().statusCode(200).log().all();
    }

    @Test(priority = 4)
    public void validatePosts4() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=4").then().statusCode(200).log().all();
    }

    @Test(priority = 5)
    public void validatePosts5() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=5").then().statusCode(200).log().all();
    }

    @Test(priority = 6)
    public void validatePosts6() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=6").then().statusCode(200).log().all();
    }

    @Test(priority = 7)
    public void validatePosts7() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=7").then().statusCode(200).log().all();
    }

    @Test(priority = 8)
    public void validatePosts8() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=8").then().statusCode(200).log().all();
    }

    @Test(priority = 9)
    public void validatePosts9() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=9").then().statusCode(200).log().all();
    }

    @Test(priority = 10)
    public void validatePosts10() {
        given().get("https://jsonplaceholder.typicode.com/posts?userId=10").then().statusCode(200).log().all();
    }
}
