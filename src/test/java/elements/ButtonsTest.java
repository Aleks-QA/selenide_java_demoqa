package elements;

import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class ButtonsTest {

    @Test
    public void buttonsTest() {
        open("https://demoqa.com/buttons");

        $("#doubleClickBtn").doubleClick();
        $("#rightClickBtn").contextClick();
        $x("//div/div[3]/button").click();

        // Проверяем
        $("#doubleClickMessage").shouldHave(text("You have done a double click"));
        $("#rightClickMessage").shouldHave(text("You have done a right click"));
        $("#dynamicClickMessage").shouldHave(text("You have done a dynamic click"));
        sleep(1000);

    }
}
