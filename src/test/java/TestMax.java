import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.time.Duration.ofSeconds;
import static org.testng.AssertJUnit.assertTrue;

public class TestMax extends BaseTest {



    @Test
    public void test() {
        open("http://elmadev.gazprom-media.ru");
//Это блок авторизации
        $(byName("authLogin")).click();
        $(byName("authLogin")).setValue("m.magnichkin");
        $(byName("password")).click();
        $(byName("password")).setValue("uW2vHCxhnbwWKwL");
        $(By.cssSelector(".submit-button")).click();

//выполняем навигацию на меню НСИ
        $(byText("НСИ")).shouldBe(enabled,ofSeconds(5));
        $(byText("НСИ")).click();
//выполняем навигацию на меню Бренд
        $(byText("Бренд")).shouldBe(enabled,ofSeconds(5));
        $(byText("Бренд")).click();
//Нажимаем на кнопку + Бренд
        $(byText("+ Бренд")).shouldBe(enabled,ofSeconds(5));
        $(byText("+ Бренд")).click();



        //Вводим наименование Бренда
        $(byXpath("//elma-form-control/elma-type-string/div/input")).sendKeys("auto_test_1234561"); // воткнуть переменную на имя бренд
//Выбор из справочника рекламодателей
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Рекламодатель'])[1]/following::button[1]")).click();
// Выбираем из справочника  бренд
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Тест отмены бренда 3'])[1]/preceding::span[8]")).shouldBe(enabled,ofSeconds(5));
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Тест отмены бренда 3'])[1]/preceding::span[8]")).click();


        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Сегмент SMA'])[1]/following::button[1]")).shouldBe(enabled,ofSeconds(5));
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='Сегмент SMA'])[1]/following::button[1]")).click();


        $(byText("Жевательная конфета")).shouldBe(enabled,ofSeconds(5));
        $(byText("Жевательная конфета")).click();

        $(byXpath("//*/text()[normalize-space(.)='Сохранить']/parent::*")).shouldBe(enabled,ofSeconds(5)).click();

        $(byText("auto_test_1234561")).shouldBe(enabled,ofSeconds(5));
        $(byText("auto_test_1234561")).click();
        //$(byText(";ждаТь")).shouldBe(enabled,ofSeconds(15));

        /*
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[2]/following::button[1]")).click();
        $(byXpath("//table[@id='pr_id_15-table']/tbody/tr[2]/td/span")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='*'])[3]/following::button[1]")).click();
        $(byXpath("//table[@id='pr_id_17-table']/tbody/tr[4]/td/span")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='tool_zoom_all'])[9]/following::button[1]")).click();
        $(byXpath("(.//*[normalize-space(text()) and normalize-space(.)='settings'])[2]/following::span[1]")).click();
        */
    }

}

