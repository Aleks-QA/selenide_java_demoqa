package pom;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormPage {

    // локатор поля ввода имени пользователя
    SelenideElement inputFirstName = Selenide.$("#firstName");

    // локатор поля ввода фамилии пользователя
    SelenideElement inputLastName = Selenide.$("#lastName");

    // локатор поля ввода email пользователя
    SelenideElement inputEmail = Selenide.$("#userEmail");

    // локатор радиокнопки гендера, случайный выбор
    SelenideElement randomGenderRadioButton = Selenide.$x("//label[@for=\"gender-radio-" + (int) (Math.random() * 3 + 1) + "\"]");

    // локатор поля ввода номера телефона пользователя
    SelenideElement inputNumber = Selenide.$("#userNumber");

    // локатор поля даты рождения пользователя
    SelenideElement fieldDateOfBirth = Selenide.$("#dateOfBirthInput");

    // локатор поля ввода месяца рождения пользователя
    SelenideElement selectMonthDateOfBirth = Selenide.$(".react-datepicker__month-select");

    // локатор поля ввода года рождения пользователя
    SelenideElement selectYearDateOfBirth = Selenide.$(".react-datepicker__year-select");

    // локатор поля ввода дня рождения пользователя(захардкожено 20)
    SelenideElement selectDayDateOfBirth = Selenide.$(".react-datepicker__day--020:not(.react-datepicker__day--outside-month)");

    // локатор поля ввода предметов
    SelenideElement inputSubjects = Selenide.$("#subjectsInput");

    // локатор радиокнопки хобби, случайный выбор
    SelenideElement randomHobbiesRadioButton = Selenide.$x("//div[@id=\"hobbiesWrapper\"]/div[2]/div[" + (int) (Math.random() * 3 + 1) + "]");

    // локатор кнопки загрузки изображения
    SelenideElement buttonUploadPicture = Selenide.$("#uploadPicture");

    // локатор ввода адреса
    SelenideElement inputCurrentAddress = Selenide.$("#currentAddress");

    // локатор открытия выпадающего списка штатов
    SelenideElement dropDownState = Selenide.$("#state");

    // локатор выпадающего списка штатов
    SelenideElement selectState = Selenide.$("#stateCity-wrapper");

    // локатор открытия выпадающего списка городов в штате
    SelenideElement dropDownCity = Selenide.$("#city");

    // локатор выпадающего списка городов в штате
    SelenideElement selectCity = Selenide.$("#city");

    // локатор кнопки отправить форму
    SelenideElement buttonSubmit = Selenide.$("#submit");

    // локатор поля имени пользователя в отправленной форме
    SelenideElement fieldNamePracticeForm = Selenide.$x("//tbody/tr[1]/td[2]");

    // локатор поля почты в отправленной форме
    SelenideElement fieldEmailPracticeForm = Selenide.$x("//tbody/tr[2]/td[2]");

    // локатор поля номера телефона в отправленной форм
    SelenideElement fieldNumberPracticeForm = Selenide.$x("//tbody/tr[4]/td[2]");

    // локатор поля адреса в отправленной форме
    SelenideElement fieldCurrentAddressPracticeForm = Selenide.$x("//tbody/tr[9]/td[2]");


    //удалить footer
    public void removeFooter(){
        executeJavaScript("$('footer').hide();");
    }

    //заполнить firstName
    public void setFirstName(String NAME) {
        inputFirstName.setValue(NAME);
    }

    //заполнить lastName
    public void setLastName(String LAST_NAME) {
        inputLastName.setValue(LAST_NAME);
    }

    //заполнить email
    public void setEmail(String EMAIL) {
        inputEmail.setValue(EMAIL);
    }

    //выбрать случайный gender
    public void clickRandomGender() {
        randomGenderRadioButton.click();
    }

    //заполнить "Number"
    public void setNumber(String NUMBER) {
        inputNumber.setValue(NUMBER);
    }

    //выбрать "Date of Birth"
    public void setDateOfBirth(String MONTH, String YEAR) {
        fieldDateOfBirth.click();
        selectMonthDateOfBirth.selectOption(MONTH);
        selectYearDateOfBirth.selectOption(YEAR);
        selectDayDateOfBirth.click();
    }

    //заполнить поле Subjects
    public void setSubjects(String SUBJECTS) {
        inputSubjects.setValue(SUBJECTS).pressEnter();
    }

    //выбрать случайное хобби
    public void clickRandomHobbies() {
        randomHobbiesRadioButton.click();
    }

    //загрузить картинку
    public void uploadPicture(String PATH) {
        buttonUploadPicture.uploadFile(new File(PATH));
    }

    //заполнить "Current Address"
    public void setCurrentAddress(String ADDRESS) {
        inputCurrentAddress.setValue(ADDRESS).pressEnter();
    }

    //заполнить "State and City"
    public void setStateAndCity(String STATE, String CITY) {
        dropDownState.scrollIntoView(true).click();
        selectState.scrollIntoView(true).$(byText(STATE)).click();
        dropDownCity.scrollIntoView(true).click();
        selectCity.scrollIntoView(true).$(byText(CITY)).click();
    }

    //кликнуть кнопку "Submit"
    public void clickSubmitButton() {
        buttonSubmit.scrollIntoView(true).click(usingJavaScript().offset(12, 22));
    }

    //проверить, что форма заполнена
    public void assertFormFilled(String NAME, String LAST_NAME, String NUMBER, String EMAIL, String ADDRESS) {
        fieldNamePracticeForm.shouldBe(visible);
        fieldNamePracticeForm.shouldHave(text(NAME + " " + LAST_NAME));
        fieldNumberPracticeForm.shouldHave(text(NUMBER));
        fieldEmailPracticeForm.shouldHave(text(EMAIL));
        fieldCurrentAddressPracticeForm.shouldHave(text(ADDRESS));
    }

}
