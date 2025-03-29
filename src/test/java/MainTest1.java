import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

class MainTest1 {
  WebDriver driver = new ChromeDriver();

  @BeforeEach
  void setUp() {
    driver.get("https://www.mts.by/");
    driver.findElement(By.id("cookie-agree")).click();

  }

  @AfterEach
  void tearDown() {
    driver.quit();
  }
}