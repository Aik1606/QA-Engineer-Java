import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentConformationPage {
    static By rootLocator = By.className("payment-page_pays");
    //услуги связи
    By connectionPhoneLocator = By.className("pay-description__text");
    By connectionSumLocator = By.className("pay-description__cost");
    By continueButton = By.xpath("//app-payment-container//button[@type='submit']");
    By numberCard = By.xpath("//input[@id='cc-number']/following-sibling::label");
    By date = By.xpath("//input[@formcontrolname ='expirationDate']/following-sibling::label");
    By cvc = By.xpath("//input[@formcontrolname ='cvc']/following-sibling::label");
    By nameOfOwner = By.xpath("//input[@formcontrolname ='holder']/following-sibling::label");
    By visa = By.xpath("//app-card-input//img[contains(@src,'visa-system')]");
    By masterCard = By.xpath("//app-card-input//img[contains(@src,'mastercard-system')]");
    By belkart = By.xpath("//app-card-input//img[contains(@src,'belkart-system')]");
    By maestro = By.xpath("//app-card-input//img[contains(@src,'maestro-system')]");
    By mir = By.xpath("//app-card-input//img[contains(@src,'mir-system')]");


    private final WebDriver driver;
    private WebElement root;

    public PaymentConformationPage(WebDriver driver) {
        this.driver = driver;
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.presenceOfElementLocated(rootLocator));
        By footerLocator = By.tagName("footer");
        wait.until(ExpectedConditions.presenceOfElementLocated(footerLocator));
        WebElement footer = driver.findElement(footerLocator);
        wait.until(ExpectedConditions.textToBePresentInElement(footer, "Безопасная оплата обеспечивается"));
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
        return root.findElement(numberCard).getText();
    }

    public String getDatePlaceholderText() {
        return root.findElement(date).getText();
    }

    public String getCvcPlaceholderText() {
        return root.findElement(cvc).getText();
    }

    public String getHolderNamePlaceholderText() {
        return root.findElement(nameOfOwner).getText();
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
