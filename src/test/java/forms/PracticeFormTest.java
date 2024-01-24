package forms;

import org.junit.Test;

import java.io.File;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

public class PracticeFormTest {

    @Test
    public void practiceFormTest() {
        open("https://demoqa.com/automation-practice-form");

        //удалить footer
        executeJavaScript("$('footer').hide();");

        //заполнить firstName и lastName поля
        $("#firstName").sendKeys("John");
        $("#lastName").sendKeys("Smith");

        //заполнить email
        $("#userEmail").sendKeys("username@example.com");

        //заполнить gender поле
        $x("//label[@for=\"gender-radio-" + (int) (Math.random() * 3 + 1) + "\"]").click(); //random gender

        //заполнить "Number"
        $("#userNumber").sendKeys("8888888888");
        sleep(1000);

        //выбрать "Date of Birth"
        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1999");
        $(".react-datepicker__day--020:not(.react-datepicker__day--outside-month)").click();

        //заполнить поле Subjects
        $("#subjectsInput").setValue("Maths").pressEnter();

        //заполнить поле Hobbies
        $x("//div[@id=\"hobbiesWrapper\"]/div[2]/div[" + (int) (Math.random() * 3 + 1) + "]").click();

        //загрузить картинку в разделе Picture
        $("[id=uploadPicture]").uploadFile(new File("./src/main/java/test_data/picture.jpg"));

        //заполнить "Current Address"
        $("#currentAddress").setValue("programmers street 42").pressEnter();

        //заполнить "State and City"
        $("#state").scrollIntoView(true).click();
        $("#stateCity-wrapper").scrollIntoView(true).$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Delhi")).click();

        //кликнуть кнопку "Submit"
        $("#submit").scrollIntoView(true).click(usingJavaScript().offset(12, 22));

        sleep(1000);

        //проверить, что форма заполнена
        $x("//tbody/tr[1]/td[2]").shouldBe(visible);
        $x("//tbody/tr[1]/td[2]").shouldHave(text("John Smith"));
        $x("//tbody/tr[2]/td[2]").shouldHave(text("username@example.com"));
        $x("//tbody/tr[5]/td[2]").shouldHave(text("20 May,1999"));
        $x("//tbody/tr[9]/td[2]").shouldHave(text("programmers street 42"));

    }
}
