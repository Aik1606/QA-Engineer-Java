import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;


public class BaseTest {

  @BeforeClass
  public void someTest() {
    RestAssured.baseURI = "https://postman-echo.com";
  }


}




