import com.codeborne.selenide.Selenide;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class TestQuestion  extends BaseTest {


    @Test
    public void TestQuestion1() {

      boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №1");
                //Запускаем проверку  если переменная true то тест пройден
                 assertTrue(result);
    }

    @Test
    public void TestQuestion2() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №2");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

    @Test
    public void TestQuestion3() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №3");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

    @Test
    public void TestQuestion4() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №4");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

    @Test
    public void TestQuestion5() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №5");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

    @Test
    public void TestQuestion6() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №6");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

    @Test
    public void TestQuestion7() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №7");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

    @Test
    public void TestQuestion8() {

        boolean result = Selenide.open(MainPage.URL, MainPage.class)
                //Проверяем соответствует ли текст  вопроса
                .selectSet("Вопрос №8");
        //Запускаем проверку  если переменная true то тест пройден
        assertTrue(result);
    }

}
