import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OnlineReplenishmentPage {
    By serviceSelector = By.className("select");
    //рассрочка
    By scoreInstalment = By.id("score-instalment");
    By sumInstalment = By.id("instalment-sum");
    By emailInstalment = By.id("instalment-email");

    //услуги связи
    By connectionPhone = By.id("connection-phone");
    By connectionSum = By.id("connection-sum");
    By connectionEmail = By.id("connection-email");

    By continueButton = By.xpath("//*[@id=\"pay-connection\"]/button");
    By connectionForm = By.id("pay-connection");

    //домашний интернет
    By internetPhone = By.id("internet-phone");
    By internetSum = By.id("internet-sum");
    By internetEmail = By.id("internet-email");

    //задолженность
    By scoreArrears = By.id("score-arrears");
    By sumArrears = By.id("arrears-sum");
    By emailArrears = By.id("arrears-email");

    private final WebDriver driver;

    private WebElement root;

    public OnlineReplenishmentPage(WebDriver driver) {
        this.driver = driver;
        this.root = driver.findElement(By.id("pay-section"));

    }

    public OnlineReplenishmentPage selectServiceOption(String option) {
        root.findElement(serviceSelector).click();
        By locator = By.xpath("//*[@id=\"pay-section\"]//*[contains(text(), '" + option + "') and not(@value)]");

        WebElement element = driver.findElement(locator);

        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        element.click();

        return this;
    }

    private String getPlaceholderInInput(By locator) {
        return root.findElement(locator).getDomAttribute("placeholder");
    }

    public String getSumIInstalmentPlaceholder() {
        return getPlaceholderInInput(sumInstalment);
    }

    public String getEmailInstalmentPlaceholder() {
        return getPlaceholderInInput(emailInstalment);
    }

    public String getScoreInstalmentPlaceholder() {
        return getPlaceholderInInput(scoreInstalment);
    }

    // услуги связи
    public String getConnectionPhonePlaceholder() {
        return getPlaceholderInInput(connectionPhone);
    }

    public String getConnectionSumPlaceholder() {
        return getPlaceholderInInput(connectionSum);
    }

    public String getConnectionEmailPlaceholder() {
        return getPlaceholderInInput(connectionEmail);
    }

    //домашний интернет
    public String getInternetPhonePlaceholder() {
        return getPlaceholderInInput(internetPhone);
    }

    public String getInternetSumPlaceholder() {
        return getPlaceholderInInput(internetSum);
    }

    public String getInternetEmailPlaceholder() {
        return getPlaceholderInInput(internetEmail);
    }

    // задолженность
    public String getArrearsScorePlaceholder() {
        return getPlaceholderInInput(scoreArrears);
    }

    public String getArrearsSumPlaceholder() {
        return getPlaceholderInInput(sumArrears);
    }

    public String getArrearsEmailPlaceholder() {
        return getPlaceholderInInput(emailArrears);
    }

    // заполняем номер телефона
    public OnlineReplenishmentPage fillPhoneNumberField(String phoneNumber) {
        WebElement field = root.findElement(connectionPhone);
        field.sendKeys(phoneNumber);
        return this;
    }

    public OnlineReplenishmentPage fillSumField(String summa) {
        root.findElement(connectionSum).sendKeys(summa);
        return this;
    }

    public OnlineReplenishmentPage submitReplenishmentForm() {
        root.findElement(connectionForm).submit();
        return this;
    }

    public PaymentConformationPage getPaymentConformationPage() {
        By locator = By.xpath("//iframe[@src='https://checkout.bepaid.by/widget_v2/index.html']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        driver.switchTo().frame(driver.findElement(locator));

        return new PaymentConformationPage(driver);
    }
}

