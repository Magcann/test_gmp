import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.FileDownloadMode;
import com.codeborne.selenide.Selenide;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import static com.codeborne.selenide.Selenide.executeJavaScript;




public class BaseTest {
    @BeforeTest
    public void setBrowser()
    {
        //Загружаем веб драйвер из GIT
        WebDriverManager.firefoxdriver().setup();


        //Запускаем тест в браузере FIREFOX
        Configuration.browser ="firefox" ;
        Configuration.browserSize = "1920x1080";
        //Для быстрого ввода текста в поля
        Configuration.fastSetValue = true;
        //Запускать скрытый браузер
        //Configuration.headless=true;


    }

}