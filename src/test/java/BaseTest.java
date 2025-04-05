import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class BaseTest {
  WebDriver driver = new ChromeDriver();

  @BeforeEach
  void setUp() {
    driver.manage().window().maximize();
    driver.get("https://www.mts.by/");

    WebElement cookie = driver.findElement(By.id("cookie-agree"));

    if (cookie.isDisplayed()) {
      cookie.click();
    }

  }

  @AfterEach
  void tearDown() {
    driver.quit();
  }
}
