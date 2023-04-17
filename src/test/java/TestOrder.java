import com.codeborne.selenide.Selenide;
import model.Customer;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestOrder extends BaseTest {

    //Создаем обект покупатель с тестовыми данными
    Customer customer1 = Customer.getFirstCustomer();
    Customer customer2 = Customer.getSecondCustomer();

    /*
    Тест на создание заказка  с использование кпопки создать  вверху преложения.
     */
    @Test
    public void сheckingOrderTest1() {
        boolean result = Selenide.open(OrderPage.URL, OrderPage.class)
                //Нажать на кнопка заказать на верху страницы
                .clickOrderButtonOnMainPageTop()
                //Заполнить первую форму заказа
                .fillFirstForm(customer1.getName(), customer1.getSurname(), customer1.getAddress(), customer1.getPhoneNumber())
                //Заполнить вторую форму заказа
                .fillSecondForm(customer1.getDateReceipt(), customer1.getComment())
                //Проверить закакз
                .orderCheck();

        //Проверить результат теста
        assertTrue(result);
    }


    /*
   Тест на создание заказка  с использование кпопки создать  по центру преложения.
    */
    @Test
    public void сheckingOrderTest2() {
        boolean result = Selenide.open(OrderPage.URL, OrderPage.class)
                //Нажать на кнопку заказать по центру страницы
                .clickOrderButtonOnMainPageCenter()
                //Заполнить первую форму заказа
                .fillFirstForm(customer2.getName(), customer2.getSurname(), customer2.getAddress(), customer2.getPhoneNumber())
                //Заполнить вторую форму заказа
                .fillSecondForm(customer2.getDateReceipt(), customer2.getComment())
                //Проверить закакз
                .orderCheck();

        //Проверить результат теста
        assertTrue(result);
    }
    /*
    Тест на отбражение не существующего заказа
    Ожидаемый результат:
    Заказ ненайден.
    */
    @Test
    public void сheckingOrderStatus() {
        //Перейти по адресу
        boolean isErrorMessageDisplayed = Selenide.open(MainPage.URL, MainPage.class)
                //Найти кнопку заказ и нажать на нее
                .clickShowInputField()
                //Нажать на поле  "ввести номер заказа"
                //Ввести номер не существующего закаа в поле "ввести номер заказа"
                .inputOrderNum("5")
                //Нажать кнопку GO для поиска заказа.
                .clickFindOrder()
                //Проверить сообщение
                .isErrorMessageDisplayed();
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(isErrorMessageDisplayed);
    }
}