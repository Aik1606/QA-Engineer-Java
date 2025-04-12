import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;


public class MainTest extends BaseTest {
  @Test
  public void testGet() {
    given()
        .param("foo1", "bar1")
        .param("foo2", "bar2")
        .when()
        .get("/get")
        .then()
        .statusCode(200)
        .body("args.foo1", equalTo("bar1"))
        .body("args.foo2", equalTo("bar2"))
        .body("headers.x-forwarded-proto", equalTo("https"))
        .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"));
  }

  // post
  @Test
  public void testPostRawText() {
    String textData = "This is a raw text payload for testing Postman Echo";

    given()
        .contentType(ContentType.TEXT)
        .body(textData)
        .when()
        .post("/post")
        .then()
        .statusCode(200)
        .body("data", equalTo(textData))
        .body("headers.content-type", containsString("text/plain"))
        .body("url", equalTo("https://postman-echo.com/post"));
  }

  @Test
  public void testPostFormData() {
    given()
        .contentType(ContentType.MULTIPART)
        .multiPart("foo1", "bar1")
        .multiPart("foo2", "bar2")
        .when()
        .post("/post")
        .then()
        .statusCode(200)
        .body("form.foo1", equalTo("bar1"))
        .body("form.foo2", equalTo("bar2"))
        .body("headers.x-forwarded-proto", equalTo("https"))
        .body("headers.content-type", containsString("multipart/form-data"))
        .body("url", equalTo("https://postman-echo.com/post"));
  }

  @Test
  public void testPut() {
    String textData = "This is a raw text payload for testing Postman Echo";

    given()
        .contentType(ContentType.TEXT)
        .body(textData)
        .when()
        .put("/put")
        .then()
        .statusCode(200)
        .body("data", equalTo(textData))
        .body("headers.content-type", containsString("text/plain"))
        .body("url", equalTo("https://postman-echo.com/put"));
  }

  @Test
  public void testPatch() {
    String textData = "This is a raw text payload for testing Postman Echo";

    given()
        .contentType(ContentType.TEXT)
        .body(textData)
        .when()
        .patch("/patch")
        .then()
        .statusCode(200)
        .body("data", equalTo(textData))
        .body("headers.content-type", containsString("text/plain"))
        .body("url", equalTo("https://postman-echo.com/patch"));
  }

  @Test
  public void testDelete() {
    String textData = "This is a raw text payload for testing Postman Echo";

    given()
        .contentType(ContentType.TEXT)
        .body(textData)
        .when()
        .delete("/delete")
        .then()
        .statusCode(200)
        .body("data", equalTo(textData))
        .body("headers.content-type", containsString("text/plain"))
        .body("url", equalTo("https://postman-echo.com/delete"));
  }
}


