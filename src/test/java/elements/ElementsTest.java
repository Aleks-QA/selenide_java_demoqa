package elements;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class ElementsTest {

    @Test
    public void testTextBox() {
        open("https://demoqa.com/elements");
        $x("//span[text()=\"Text Box\"]").scrollIntoView(true).click();
        $(By.id("userName")).scrollIntoView(true).setValue("qwerty");
        $(By.id("userEmail")).scrollIntoView(true).setValue("qwerty@gmail.com");
        $(By.id("currentAddress")).scrollIntoView(true).setValue("qwerty 142");
        $(By.id("permanentAddress")).scrollIntoView(true).setValue("Berlin n/a");
        $x("//button[text()=\"Submit\"]").scrollIntoView(true).click();
        sleep(3000);

        $(By.id("output")).shouldBe(visible);
        $x("//div[@id=\"output\"]/div/p[1]").shouldHave(text("qwerty"));
        $x("//div[@id=\"output\"]/div/p[2]").shouldHave(text("qwerty@gmail.com"));
        $x("//div[@id=\"output\"]/div/p[3]").shouldHave(text("qwerty 142"));
        $x("//div[@id=\"output\"]/div/p[4]").shouldHave(text("Berlin n/a"));
    }

}
