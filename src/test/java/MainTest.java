import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Nested;


public class MainTest extends BaseTest{

    private static final Logger log = LoggerFactory.getLogger(MainTest.class);

    //рассрочка
    @Test
    public void checkPlaceholdersForInstalment() {
      OnlineReplenishmentPage page = new OnlineReplenishmentPage(driver);
      page.selectServiceOption("Рассрочка");

      Assertions.assertEquals("E-mail для отправки чека", page.getEmailInstalmentPlaceholder());
      Assertions.assertEquals("Сумма", page.getSumIInstalmentPlaceholder());
      Assertions.assertEquals("Номер счета на 44", page.getScoreInstalmentPlaceholder());
    }

  //услуги связи

  @Test
  public void checkCommunicationServices() {
    OnlineReplenishmentPage page = new OnlineReplenishmentPage(driver);
    page.selectServiceOption("Услуги связи");

    Assertions.assertEquals("E-mail для отправки чека", page.getConnectionEmailPlaceholder());
    Assertions.assertEquals("Сумма", page.getConnectionSumPlaceholder());
    Assertions.assertEquals("Номер телефона", page.getConnectionPhonePlaceholder());
  }

  //дом интернет
  @Test
  public void checkHomeInternet() {
    OnlineReplenishmentPage page = new OnlineReplenishmentPage(driver);
    page.selectServiceOption("Домашний интернет");

    Assertions.assertEquals("E-mail для отправки чека", page.getInternetEmailPlaceholder());
    Assertions.assertEquals("Сумма", page.getInternetSumPlaceholder());
    Assertions.assertEquals("Номер абонента", page.getInternetPhonePlaceholder());
  }

  //задолженность

  @Test
  public void checkArrears() {
    OnlineReplenishmentPage page = new OnlineReplenishmentPage(driver);
    page.selectServiceOption("Задолженность");

    Assertions.assertEquals("E-mail для отправки чека", page.getArrearsEmailPlaceholder());
    Assertions.assertEquals("Сумма", page.getArrearsSumPlaceholder());
    Assertions.assertEquals("Номер счета на 2073", page.getArrearsScorePlaceholder());
  }


  //услуги связи заполнение формы

  @Test
  public void checkCommunicationServices1() {
    OnlineReplenishmentPage page = new OnlineReplenishmentPage(driver);
    PaymentConformationPage conformationPage = page
        .selectServiceOption("Услуги связи")
        .fillPhoneNumberField("297777777")
        .fillSumField("10")
        .submitReplenishmentForm().getPaymentConformationPage();

   Assertions.assertTrue(conformationPage.getPayDescriptionCost().contains("10"));
   Assertions.assertTrue(conformationPage.getSubmitButtonText().contains("10"));
   Assertions.assertTrue(conformationPage.getPayDescriptionText().contains("375297777777"));
   Assertions.assertNotNull(conformationPage.getVisaIcon());
   Assertions.assertNotNull(conformationPage.getMaestroIcon());
   Assertions.assertNotNull(conformationPage.getMaterCardIcon());
   Assertions.assertNotNull(conformationPage.getBelkartIcon());
   Assertions.assertNotNull(conformationPage.getMirIcon());
   Assertions.assertEquals("Номер карты", conformationPage.getCardNumberPlaceholderText());
   Assertions.assertEquals("Срок действия", conformationPage.getDatePlaceholderText());
   Assertions.assertEquals("CVC", conformationPage.getCvcPlaceholderText());
   Assertions.assertEquals("Имя держателя (как на карте)", conformationPage.getHolderNamePlaceholderText());

  }

}


