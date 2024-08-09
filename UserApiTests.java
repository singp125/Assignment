package Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class UserApiTests {

    private static final String BASE_URL = "https://reqres.in/api/users";

    @Test
    public void validUserCreation() {
        String requestBody = "{\n" +
                "  \"name\": \"John\",\n" +
                "  \"job\": \"Developer\"\n" +
                "}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(BASE_URL);

        assertEquals(response.getStatusCode(), 201);
        assertEquals(response.jsonPath().getString("name"), "John");
        assertEquals(response.jsonPath().getString("job"), "Developer");
    }
    
    @Test
    public void missingRequiredFields() {
        String requestBody = "{\n" +
                "  \"name\": \"\"\n" + // Missing job field
                "}";

        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(BASE_URL);

        assertEquals(response.getStatusCode(), 400);
    }
    
    @Test
    public void retrieveAllUsers() {
        Response response = given()
                .when()
                .get(BASE_URL);

        assertEquals(response.getStatusCode(), 200);
        assertNotNull(response.jsonPath().getList("data"));
    }

    @Test
    public void retrieveSpecificUser() {
        int userId = 2; // Example User ID

        Response response = given()
                .when()
                .get(BASE_URL + "/" + userId);

        assertEquals(response.getStatusCode(), 200);
        assertEquals(response.jsonPath().getInt("data.id"), userId);
        // Further assertions on user details
    }


}

