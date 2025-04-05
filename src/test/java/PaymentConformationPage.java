import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PaymentConformationPage {
  static By rootLocator = By.xpath("//app-payment-container");
  //услуги связи
  By connectionPhoneLocator = By.className("pay-description__text");
  By connectionSumLocator = By.className("pay-description__cost");
  By continueButton = By.xpath("//app-payment-container//button[@type='submit']");
  By numberCard = By.id("cc-number");
  By date = By.xpath("//input[@formcontrolname ='expirationDate]");
  By cvc = By.xpath("//input[@formcontrolname ='cvc']");
  By nameOfOwner = By.xpath("//input[@formcontrolname ='holder']");
  By visa = By.xpath("//app-card-input//img[contains(@src,'visa-system']");
  By masterCard = By.xpath("//app-card-input//img[contains(@src,'mastercard-system']");
  By belkart = By.xpath("//app-card-input//img[contains(@src,'belkart-system']");
  By maestro = By.xpath("//app-card-input//img[contains(@src,'maestro-system']");
  By mir = By.xpath("//app-card-input//img[contains(@src,'mir-system']");


  private final WebDriver driver;
  private WebElement root;
  public PaymentConformationPage(WebDriver driver) {
    this.driver = driver;
    this.root = driver.findElement(rootLocator);
  }
  public String getPayDescriptionCost() {
    return root.findElement(connectionSumLocator).getText();
  }

  public String getPayDescriptionText() {
    return root.findElement(connectionPhoneLocator).getText();
  }

  public String getSubmitButtonText() {
    return root.findElement(continueButton).getText();
  }

  public String getCardNumberPlaceholderText() {
    return root.findElement(numberCard).getDomAttribute("placeholder");
  }
  public String getDatePlaceholderText() {
    return root.findElement(date).getDomAttribute("placeholder");
  }
    public String getCvcPlaceholderText() {
      return root.findElement(cvc).getDomAttribute("placeholder");
    }
    public String getHolderNamePlaceholderText() {
      return root.findElement(nameOfOwner).getDomAttribute("placeholder");
    }

    public WebElement getVisaIcon() {
    return root.findElement(visa);
    }

  public WebElement getMaterCardIcon() {
    return root.findElement(masterCard);
  }

  public WebElement getBelkartIcon() {
    return root.findElement(belkart);
  }
  public WebElement getMaestroIcon() {
    return root.findElement(maestro);
  }
  public WebElement getMirIcon() {
    return root.findElement(mir);
  }
}
