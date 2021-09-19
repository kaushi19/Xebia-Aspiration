package stepDefinitions;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class aspirationAPI {

	//Response Code
public void responseCode() {
    given().when().get("https://swapi.dev/api/people/").
    then().assertThat().statusCode(200);
}

//Total Count
public void totalCount() {
given().when().get("https://swapi.dev/api/people/").
then().assertThat().
body("count", hasSize(82));
}
}