package test.teststeps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class APITest {

    private static final String BASE_URL = "https://your-api-endpoint.com"; // Replace with actual API endpoint

    @Test
    public void validateCourseTitlesHaveMeaningfulData() {
        RestAssured.baseURI = BASE_URL;

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("/courses")
                .then()
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();

        List<String> apiCourses = jsonPath.getList("api.courseTitle");
        List<String> mobileCourses = jsonPath.getList("mobile.courseTitle");

        validateCourseTitles(apiCourses, "API");
        validateCourseTitles(mobileCourses, "Mobile");
    }

    private void validateCourseTitles(List<String> courseTitles, String courseType) {
        for (String title : courseTitles) {
            Assert.assertNotNull(title, courseType + " Course title should not be null");
            Assert.assertFalse(title.trim().isEmpty(), courseType + " Course title should contain meaningful data");
        }
    }
}
