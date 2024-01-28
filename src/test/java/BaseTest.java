import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.page;

public class BaseTest {
    public void setUp() {
//        System.setProperty( "webdriver.chrome.driver", "src/test/resources/chromedriver.exe" );
//        WebDriverRunner.getWebDriver().manage().window().maximize();
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
