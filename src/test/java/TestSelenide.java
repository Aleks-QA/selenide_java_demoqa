import com.codeborne.selenide.Configuration;
import org.junit.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class TestSelenide {
    @Test
    public void testDemoqa(){

//        open("https://demoqa.com/elements");
//        $x("//div[@class=\"category-cards\"]/div[1]/div/div[2]").click();
//        $x("//div[1]/div[@class=\"card-body\"]").scrollIntoView(true).click();
//        $x("//span[text()=\"Text Box\"]").scrollIntoView(true).click();
//        $x("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[2]/div[2]/svg").scrollIntoView(true).click();
//        $x("//*[@id=\"userName\"]").scrollIntoView(true).setValue("tdfghdfgdfg");

        open("https://demoqa.com/automation-practice-form");
        $x("//*[@id=\"firstName\"]").setValue("test").click();
        sleep(1000);

    }
}
