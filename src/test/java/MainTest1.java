import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest1 {
  WebDriver driver = new ChromeDriver();

  @BeforeEach
  void setUp() {
    driver.manage().window().maximize();
    driver.get("https://www.mts.by/");
    List<WebElement> cookie = driver.findElements(By.id("cookie-agree"));
    if (!cookie.isEmpty()) {
      cookie.get(0).click();
    }
  }

  @AfterEach
  void tearDown() {
    //driver.quit();
  }
}