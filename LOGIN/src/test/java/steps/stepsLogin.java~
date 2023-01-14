package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class stepsLogin {
    Response response;

    String request_body;

    String REQUEST_BODY= "{\n" +
            "  \"username\": \"DaniMB95\",\n" +
            "  \"password\": \"Testing785\" \n}";
    @Given("The user have and account in the page")
    public void The_user_have_and_account_in_the_page() {
        RestAssured.baseURI = "https://test-api.k6.io";
    }
    @When("User enters username as username and password")
    public void sendRequest() {
        response = given().contentType(ContentType.JSON)
                .body(REQUEST_BODY)
                .post("/auth/basic/login/");
    }
    @Then("The status code is OK")
    public void getResponse() {
        Assert.assertEquals(response.getStatusCode(),200);
    }
}
