import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.time.Duration;
import java.util.List;

import static org.testng.Assert.*;

public class MainTest extends MainTest1 {

  private static final Logger log = LoggerFactory.getLogger(MainTest.class);

  @Test
  public void nameOfBlock(){
    WebElement element = driver.findElement(By.id("pay-section"));
    WebElement h2 = element.findElement(By.tagName("h2"));
    Assertions.assertEquals("Онлайн пополнение\nбез комиссии", h2.getText());
  }

  @Test
  public void paySystemLogoExisting(){
    WebElement element = driver.findElement(By.id("pay-section"));
    WebElement visa = element.findElement(By.xpath("//img[contains(@src,'visa.svg')]"));
    Assertions.assertNotNull(visa);
    WebElement visaVerified = element.findElement(By.xpath("//img[contains(@src,'visa-verified.svg')]"));
    Assertions.assertNotNull(visaVerified);
    WebElement mastercard = element.findElement(By.xpath("//img[contains(@src,'mastercard.svg')]"));
    Assertions.assertNotNull(mastercard);
    WebElement mastercardSecure = element.findElement(By.xpath("//img[contains(@src,'mastercard-secure.svg')]"));
    Assertions.assertNotNull(mastercardSecure);
    WebElement belkart = element.findElement(By.xpath("//img[contains(@src,'belkart.svg')]"));
    Assertions.assertNotNull(belkart);
  }

  @Test
  public void moreAboutService(){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    String url = driver.getCurrentUrl();
    WebElement element = driver.findElement(By.id("pay-section"));
    WebElement link = element.findElement(By.partialLinkText("Подробнее о сервисе"));
    link.click();
    wait.until(ExpectedConditions.not(ExpectedConditions.urlToBe(url)));
    Assertions.assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());
  }
}