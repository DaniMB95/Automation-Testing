import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class testLogin {
    private static String  REQUEST_BODY= "{\n" +
            "  \"username\": \"DaniMB95\",\n" +
            "  \"password\": \"Testing1234\" \n}";
    private final int CODE = 200;

    @Test
    public void submitForm() {
        RestAssured.baseURI = "https://test-api.k6.io";
        Response response = given().contentType(ContentType.JSON)
                .body(REQUEST_BODY)
                .post("/auth/basic/login/")
                .then()
                .statusCode(CODE)
                .extract()
                .response();
        Assert.assertEquals(CODE, response.statusCode());
        Assert.assertEquals("DaniMB95", response.jsonPath().getString("username"));
        Assert.assertEquals("Daniela", response.jsonPath().getString("first_name"));
        Assert.assertEquals("Martinez", response.jsonPath().getString("last_name"));
        Assert.assertEquals("Daniela.Martinez@Jala.University", response.jsonPath().getString("email"));
        Assert.assertEquals("2022-12-21T15:02:49.803745Z", response.jsonPath().getString("date_joined"));

    }
}
