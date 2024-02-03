package elements;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

abstract public class BaseTest {
    public void setUp() {
//        System.setProperty( "webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
//        WebDriverManager.chromedriver().setup();
//        Configuration.browser = "chrome";
//        Configuration.browserSize = "1920x1080";
//        Configuration.headless = true; //Jenkins runs headless
    }

    @BeforeEach
    public void init() {
        setUp();
    }

    @AfterEach()
    public void tearDown() {
        Selenide.closeWindow();
    }

}
