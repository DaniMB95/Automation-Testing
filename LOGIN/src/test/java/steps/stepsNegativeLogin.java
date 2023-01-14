package steps;

import entity.user;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class stepsNegativeLogin {
    Response response;

    @Given("The user introduce a wrong password")
    public void The_user_have_and_account_in_the_page() {
        RestAssured.baseURI = "https://test-api.k6.io";
    }
    @When("User enters the wrong {string} and {string}")
    public void sendRequest(String username, String password) {

        response = given().contentType(ContentType.JSON).when()
                .body(user.builder().username(username)
                        .password(password).build())
                .post("/auth/basic/login/");
    }
    @Then("The status code is BAD REQUEST")
    public void getResponse() {
        Assert.assertEquals(response.getStatusCode(),400);
    }
}
