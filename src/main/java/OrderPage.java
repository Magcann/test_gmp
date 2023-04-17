import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Condition.text;

public class OrderPage {
    final static String URL = "https://qa-scooter.praktikum-services.ru/";
    ///Найти кнопку заказ на верху страницы
    @FindBy(how = How.CLASS_NAME, using = "Button_Button__ra12g")
    private SelenideElement orderButtonOnMainPageTop;
    //Найти кнопку заказать по центру страницы
    @FindBy(how = How.CLASS_NAME, using = "Button_UltraBig__UU3Lp")
    private SelenideElement orderButtonOnMainPageCenter;
    //Имя
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Имя']")
    private SelenideElement nameField;
    //Фамилия
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Фамилия']")
    private SelenideElement surnameField;
    //ввести адрес
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Адрес: куда привезти заказ']")
    private SelenideElement deliveryAddressField;
    //* Станция метро
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Станция метро']")
    private SelenideElement мetroStationField;
    //
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Телефон: на него позвонит курьер']")
    private SelenideElement phoneNumberField;
    //Кнопка Далее
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement nextButton;
    // Заполнение  поля дата
    //Дата получения самоката
    @FindBy(how = How.XPATH, using = "//input[@placeholder='* Когда привезти самокат']")
    private SelenideElement dateReceiptScooter;
    //Заполнить данные в выпадающем списке
    @FindBy(how = How.XPATH, using = "//*/text()[normalize-space(.)='* Срок аренды']/parent::*")
    private SelenideElement scooterRentalPeriod;
    //Спрок аренды Двое суток
    @FindBy(how = How.XPATH, using = "//*/text()[normalize-space(.)='двое суток']/parent::*")
    private SelenideElement number2DaysScooterRental;
    // Установить  значение чет бокса
    @FindBy(how = How.XPATH, using = "//input[@id='black']")
    private SelenideElement checkboxBoxBlack;
    //Комментарий для курьера
    @FindBy(how = How.XPATH, using = "//input[@placeholder='Комментарий для курьера']")
    private SelenideElement commentField;
    //Нажать на кнопку заказать
    @FindBy(how = How.XPATH, using = "//button[@class='Button_Button__ra12g Button_Middle__1CSJM']")
    private SelenideElement orderButton;
    //Нажать "Да" на кнопку в окне оформить заказ
    @FindBy(how = How.XPATH, using = "//*/text()[normalize-space(.)='Да']/parent::*")
    private SelenideElement yesButton;
    //Заказ оформлен , Проверяем что заказ оформлен ищем в окне текст
    @FindBy(how = How.XPATH, using = "//*[normalize-space(text()) = 'Заказ оформлен']")
    private SelenideElement findTextTheOrderHasBeenIssued;

    public OrderPage clickOrderButtonOnMainPageTop() {
        //Кнопка заказать на верху страницы
        orderButtonOnMainPageTop.click();
        return this;
    }

    public OrderPage clickOrderButtonOnMainPageCenter() {
        //Найти кнопку заказать по центру страницы
        orderButtonOnMainPageCenter.scrollTo();
        orderButtonOnMainPageCenter.click();
        return this;

    }

    public OrderPage fillFirstForm(String getName, String getSurname, String getAddress, String getPhoneNumber) {
        //Имя
        nameField.sendKeys(getName);
        //Фамилия
        surnameField.sendKeys(getSurname);
        //ввести адрес
        deliveryAddressField.sendKeys(getAddress);
        //Выбрать станцию метро
        мetroStationField.sendKeys(Keys.DOWN);
        мetroStationField.pressEnter();
        //
        phoneNumberField.sendKeys(getPhoneNumber);
        // Нажать на кнопку Далее
        nextButton.click();
        return this;
    }

    public OrderPage fillSecondForm(String getDateReceipt, String getComment) {
        // Заполнение  поля дата
        dateReceiptScooter.sendKeys(getDateReceipt);
        dateReceiptScooter.pressEnter();
        //Заполнить данные в выпадающем списке
        scooterRentalPeriod.click();
        number2DaysScooterRental.click();
        // Установить  значение чет бокса
        checkboxBoxBlack.click();
        commentField.sendKeys(getComment);
        //Нажать на кнопку заказать
        orderButton.click();
        //Нажать "Да" на кнопку в окне оформить заказ
        yesButton.click();
        return this;
    }

    public boolean  orderCheck() {
        //Заказ оформлен , Проверяем что заказ оформлен ищем в окне текст
      return   findTextTheOrderHasBeenIssued.shouldHave(text("Заказ оформлен")).isDisplayed();

    }

}



