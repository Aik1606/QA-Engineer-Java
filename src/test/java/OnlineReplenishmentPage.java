import com.sun.jdi.ByteValue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;

public class OnlineReplenishmentPage {
  By serviceSelector = By.className("select");


  private final WebDriver driver;

  private WebElement root;
  public OnlineReplenishmentPage(WebDriver driver) {
    this.driver = driver;
    this.root = driver.findElement(By.id("pay-section"));

  }

  public OnlineReplenishmentPage selectServiceOption(String option){
    Actions action = new Actions(driver);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    root.findElement(serviceSelector).click();

    WebElement element = root.findElement(By.xpath("//*[contains(text(), '"+ option +"') and not(@value)]"  ));
    wait.until(ExpectedConditions.elementToBeClickable(element));
    action.scrollByAmount(0, 200);
    //action.build();
    action.perform();
    element.click();
    return this;
  }
}
