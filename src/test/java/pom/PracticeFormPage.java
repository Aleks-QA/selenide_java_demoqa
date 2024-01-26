package pom;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class PracticeFormPage {

    SelenideElement inputFirstName = $("#firstName");
    SelenideElement inputLastName = $("#lastName");
    SelenideElement inputEmail = $("#userEmail");
    SelenideElement randomGenderRadioButton = $x("//label[@for=\"gender-radio-" + (int) (Math.random() * 3 + 1) + "\"]");
    SelenideElement inputNumber = $("#userNumber");
    SelenideElement fieldDateOfBirth = $("#dateOfBirthInput");
    SelenideElement selectMonthDateOfBirth = $(".react-datepicker__month-select");
    SelenideElement selectYearDateOfBirth = $(".react-datepicker__year-select");
    SelenideElement selectDayDateOfBirth = $(".react-datepicker__day--020:not(.react-datepicker__day--outside-month)");
    SelenideElement inputSubjects = $("#subjectsInput");
    SelenideElement randomHobbiesRadioButton = $x("//div[@id=\"hobbiesWrapper\"]/div[2]/div[" + (int) (Math.random() * 3 + 1) + "]");
    SelenideElement uploadPicture = $("#uploadPicture");
    SelenideElement inputCurrentAddress = $("#currentAddress");


    SelenideElement dropDownState = $("#state");
    SelenideElement selectState = $("#stateCity-wrapper");
    SelenideElement dropDownCity = $("#city");
    SelenideElement selectCity = $("#city");
    SelenideElement buttonSubmit = $("#submit");



//        //проверить, что форма заполнена
//        $x("//tbody/tr[1]/td[2]").shouldBe(visible);
//        $x("//tbody/tr[1]/td[2]").shouldHave(text("John Smith"));
//        $x("//tbody/tr[2]/td[2]").shouldHave(text("username@example.com"));
//        $x("//tbody/tr[5]/td[2]").shouldHave(text("20 May,1999"));
//        $x("//tbody/tr[9]/td[2]").shouldHave(text("programmers street 42"));
}
