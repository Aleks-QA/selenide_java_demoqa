package pom;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.io.File;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;


public class PracticeFormPage {

    // локатор поля ввода имени пользователя
    private final SelenideElement inputFirstName = Selenide.$("#firstName");

    // локатор поля ввода фамилии пользователя
    private final SelenideElement inputLastName = Selenide.$("#lastName");

    // локатор поля ввода email пользователя
    private final SelenideElement inputEmail = Selenide.$("#userEmail");

    // локатор радиокнопки гендера, случайный выбор
    private final SelenideElement randomGenderRadioButton = Selenide.$x("//label[@for=\"gender-radio-" + (int) (Math.random() * 3 + 1) + "\"]");

    // локатор поля ввода номера телефона пользователя
    private final SelenideElement inputNumber = Selenide.$("#userNumber");

    // локатор поля даты рождения пользователя
    private final SelenideElement fieldDateOfBirth = Selenide.$("#dateOfBirthInput");

    // локатор поля ввода месяца рождения пользователя
    private final SelenideElement selectMonthDateOfBirth = Selenide.$(".react-datepicker__month-select");

    // локатор поля ввода года рождения пользователя
    private final SelenideElement selectYearDateOfBirth = Selenide.$(".react-datepicker__year-select");

    // локатор поля ввода дня рождения пользователя(захардкожено 20)
    private final SelenideElement selectDayDateOfBirth = Selenide.$(".react-datepicker__day--020:not(.react-datepicker__day--outside-month)");

    // локатор поля ввода предметов
    private final SelenideElement inputSubjects = Selenide.$("#subjectsInput");

    // локатор радиокнопки хобби, случайный выбор
    private final SelenideElement randomHobbiesRadioButton = Selenide.$x("//div[@id=\"hobbiesWrapper\"]/div[2]/div[" + (int) (Math.random() * 3 + 1) + "]");

    // локатор кнопки загрузки изображения
    private final SelenideElement buttonUploadPicture = Selenide.$("#uploadPicture");

    // локатор ввода адреса
    private final SelenideElement inputCurrentAddress = Selenide.$("#currentAddress");

    // локатор открытия выпадающего списка штатов
    private final SelenideElement dropDownState = Selenide.$("#state");

    // локатор выпадающего списка штатов
    private final SelenideElement selectState = Selenide.$("#stateCity-wrapper");

    // локатор открытия выпадающего списка городов в штате
    private final SelenideElement dropDownCity = Selenide.$("#city");

    // локатор выпадающего списка городов в штате
    private final SelenideElement selectCity = Selenide.$("#city");

    // локатор кнопки отправить форму
    private final SelenideElement buttonSubmit = Selenide.$("#submit");

    // локатор поля имени пользователя в отправленной форме
    private final SelenideElement fieldNamePracticeForm = Selenide.$x("//tbody/tr[1]/td[2]");

    // локатор поля почты в отправленной форме
    private final SelenideElement fieldEmailPracticeForm = Selenide.$x("//tbody/tr[2]/td[2]");

    // локатор поля номера телефона в отправленной форм
    private final SelenideElement fieldNumberPracticeForm = Selenide.$x("//tbody/tr[4]/td[2]");

    // локатор поля адреса в отправленной форме
    private final SelenideElement fieldCurrentAddressPracticeForm = Selenide.$x("//tbody/tr[9]/td[2]");

    //удалить footer
    public void removeFooter() {
        executeJavaScript("$('footer').hide();");
    }

    //заполнить firstName
    public void setFirstName(String firstName) {
        inputFirstName.setValue(firstName);
    }

    //заполнить lastName
    public void setLastName(String lastName) {
        inputLastName.setValue(lastName);
    }

    //заполнить email
    public void setEmail(String email) {
        inputEmail.setValue(email);
    }

    //выбрать случайный gender
    public void clickRandomGender() {
        randomGenderRadioButton.click();
    }

    //заполнить "Number"
    public void setNumber(String number) {
        inputNumber.setValue(number);
    }

    //выбрать "Date of Birth"
    public void setDateOfBirth(String month, String year) {
        fieldDateOfBirth.click();
        selectMonthDateOfBirth.selectOption(month);
        selectYearDateOfBirth.selectOption(year);
        selectDayDateOfBirth.click();
    }

    //заполнить поле Subjects
    public void setSubjects(String subjects) {
        inputSubjects.setValue(subjects).pressEnter();
    }

    //выбрать случайное хобби
    public void clickRandomHobbies() {
        randomHobbiesRadioButton.click();
    }

    //загрузить картинку
    public void uploadPicture(String path) {
        buttonUploadPicture.uploadFile(new File(path));
    }

    //заполнить "Current Address"
    public void setCurrentAddress(String address) {
        inputCurrentAddress.setValue(address).pressEnter();
    }

    //заполнить "State and City"
    public void setStateAndCity(String state, String city) {
        dropDownState.scrollIntoView(true).click();
        selectState.scrollIntoView(true).$(byText(state)).click();
        dropDownCity.scrollIntoView(true).click();
        selectCity.scrollIntoView(true).$(byText(city)).click();
    }

    //кликнуть кнопку "Submit"
    public void clickSubmitButton() {
        buttonSubmit.scrollIntoView(true).click(usingJavaScript().offset(12, 22));
    }

    /**
     * Вернуть значение поля имени и фамилии из таблицы формы
     *
     * @return String
     */
    public String getNamePracticeForm() {
        return fieldNamePracticeForm.getText();
    }

    /**
     * Вернуть значение поля номера телефона из таблицы формы
     *
     * @return String
     */
    public String getNumberPracticeForm() {
        return fieldNumberPracticeForm.getText();
    }

    /**
     * Вернуть значение поля email из таблицы формы
     *
     * @return String
     */
    public String getEmailPracticeForm() {
        return fieldEmailPracticeForm.getText();
    }

    /**
     * Вернуть значение поля адреса из таблицы формы
     *
     * @return String
     */
    public String getAddressPracticeForm() {
        return fieldCurrentAddressPracticeForm.getText();
    }

}
