package pom;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

/**
 * Страница "PracticeForm".
 */
public class PracticeFormPage {

    /**
     * Локатор поля ввода имени пользователя.
     */
    private final SelenideElement inputFirstName = Selenide.$("#firstName");

    /**
     * Локатор поля ввода фамилии пользователя.
     */
    private final SelenideElement inputLastName = Selenide.$("#lastName");

    /**
     * Локатор поля ввода email пользователя.
     */
    private final SelenideElement inputEmail = Selenide.$("#userEmail");

    /**
     * Локатор радиокнопки гендера, случайный выбор.
     */
    private final SelenideElement randomGenderRadioButton = Selenide.$x("//label[@for=\"gender-radio-" + (int) (Math.random() * 3 + 1) + "\"]");

    /**
     * Локатор поля ввода номера телефона пользователя.
     */
    private final SelenideElement inputNumber = Selenide.$("#userNumber");

    /**
     * Локатор поля даты рождения пользователя.
     */
    private final SelenideElement fieldDateOfBirth = Selenide.$("#dateOfBirthInput");

    /**
     * Локатор поля ввода месяца рождения пользователя.
     */
    private final SelenideElement selectMonthDateOfBirth = Selenide.$(".react-datepicker__month-select");

    /**
     * Локатор поля ввода года рождения пользователя.
     */
    private final SelenideElement selectYearDateOfBirth = Selenide.$(".react-datepicker__year-select");

    /**
     * Локатор поля ввода дня рождения пользователя(захардкожено 20).
     */
    private final SelenideElement selectDayDateOfBirth = Selenide.$(".react-datepicker__day--020:not(.react-datepicker__day--outside-month)");

    /**
     * Локатор поля ввода предметов.
     */
    private final SelenideElement inputSubjects = Selenide.$("#subjectsInput");

    /**
     * Локатор радиокнопки хобби, случайный выбор.
     */
    private final SelenideElement randomHobbiesRadioButton = Selenide.$x("//div[@id=\"hobbiesWrapper\"]/div[2]/div[" + (int) (Math.random() * 3 + 1) + "]");

    /**
     * Локатор кнопки загрузки изображения.
     */
    private final SelenideElement buttonUploadPicture = Selenide.$("#uploadPicture");

    /**
     * Локатор ввода адреса.
     */
    private final SelenideElement inputCurrentAddress = Selenide.$("#currentAddress");

    /**
     * Локатор открытия выпадающего списка штатов.
     */
    private final SelenideElement dropDownState = Selenide.$("#state");

    /**
     * Локатор выпадающего списка штатов.
     */
    private final SelenideElement selectState = Selenide.$("#stateCity-wrapper");

    /**
     * Локатор открытия выпадающего списка городов в штате.
     */
    private final SelenideElement dropDownCity = Selenide.$("#city");

    /**
     * Локатор выпадающего списка городов в штате.
     */
    private final SelenideElement selectCity = Selenide.$("#city");

    /**
     * Локатор кнопки отправить форму.
     */
    private final SelenideElement buttonSubmit = Selenide.$("#submit");

    /**
     * Локатор поля имени пользователя в отправленной форме.
     */
    private final SelenideElement fieldNamePracticeForm = Selenide.$x("//tbody/tr[1]/td[2]");

    /**
     * Локатор поля почты в отправленной форме.
     */
    private final SelenideElement fieldEmailPracticeForm = Selenide.$x("//tbody/tr[2]/td[2]");

    /**
     * Локатор поля номера телефона в отправленной форм.
     */
    private final SelenideElement fieldNumberPracticeForm = Selenide.$x("//tbody/tr[4]/td[2]");

    /**
     * Локатор поля адреса в отправленной форме.
     */
    private final SelenideElement fieldCurrentAddressPracticeForm = Selenide.$x("//tbody/tr[9]/td[2]");

    /**
     * Удаление footer.
     */
    @Step("Удаление footer")
    public void removeFooter() {
        executeJavaScript("$('footer').hide();");
    }

    /**
     * Ввод имени пользователя.
     *
     * @param firstName Имя.
     */
    @Step("Ввод имени пользователя")
    public void setFirstName(final String firstName) {
        inputFirstName.setValue(firstName);
    }

    /**
     * Ввод фамилии пользователя.
     *
     * @param lastName Фамилия.
     */
    @Step("Ввод фамилии пользователя")
    public void setLastName(final String lastName) {
        inputLastName.setValue(lastName);
    }

    /**
     * Ввод email.
     *
     * @param email - email пользователя.
     */
    @Step("Ввод email")
    public void setEmail(final String email) {
        inputEmail.setValue(email);
    }

    /**
     * Выбор случайной радио-кнопки gender.
     */
    @Step("Выбор случайной радио-кнопки gender")
    public void clickRandomGender() {
        randomGenderRadioButton.click();
    }

    /**
     * Ввод номера телефона.
     *
     * @param number - номер телефона.
     */
    @Step("Ввод номера телефона")
    public void setNumber(final String number) {
        inputNumber.setValue(number);
    }

    /**
     * Выбор "Date of Birth".
     *
     * @param year  - год
     * @param month - месяц
     */
    @Step("Выбор \"Date of Birth\"")
    public void setDateOfBirth(final String month, final String year) {
        fieldDateOfBirth.click();
        selectMonthDateOfBirth.selectOption(month);
        selectYearDateOfBirth.selectOption(year);
        selectDayDateOfBirth.click();
    }

    /**
     * Ввод Subjects.
     *
     * @param subjects String
     */
    @Step("Ввод Subjects")
    public void setSubjects(final String subjects) {
        inputSubjects.setValue(subjects).pressEnter();
    }

    /**
     * Выбор случайной радио-кнопки хобби.
     */
    @Step("Выбор случайной радио-кнопки хобби")
    public void clickRandomHobbies() {
        randomHobbiesRadioButton.click();
    }

    /**
     * Загрузка картинки.
     *
     * @param path String путь к картинке.
     */
    @Step("Загрузка картинки")
    public void uploadPicture(final String path) {
        buttonUploadPicture.uploadFile(new File(path));
    }

    /**
     * Ввод текущего адреса.
     *
     * @param address String адрес.
     */
    @Step("Ввод текущего адреса")
    public void setCurrentAddress(final String address) {
        inputCurrentAddress.setValue(address).pressEnter();
    }

    /**
     * Заполнение "State and City".
     *
     * @param state String штат.
     * @param city  String город.
     */
    @Step("Заполнение \"State and City\"")
    public void setStateAndCity(final String state, final String city) {
        dropDownState.scrollIntoView(true).click();
        selectState.scrollIntoView(true).$(byText(state)).click();
        dropDownCity.scrollIntoView(true).click();
        selectCity.scrollIntoView(true).$(byText(city)).click();
    }

    /**
     * Кликнуть кнопку "Submit".
     */
    @Step("Кликнуть кнопку \"Submit\"")
    public void clickSubmitButton() {
        buttonSubmit.scrollIntoView(true).click(usingJavaScript().offset(12, 22));
    }

    /**
     * Вернуть значение поля имени и фамилии из таблицы формы.
     *
     * @return String
     */
    @Step("Вернуть значение поля имени и фамилии из таблицы формы")
    public String getNamePracticeForm() {
        return fieldNamePracticeForm.getText();
    }

    /**
     * Вернуть значение поля номера телефона из таблицы формы.
     *
     * @return String
     */
    @Step("Вернуть значение поля номера телефона из таблицы формы")
    public String getNumberPracticeForm() {
        return fieldNumberPracticeForm.getText();
    }

    /**
     * Вернуть значение поля email из таблицы формы.
     *
     * @return String
     */
    @Step("Вернуть значение поля email из таблицы формы")
    public String getEmailPracticeForm() {
        return fieldEmailPracticeForm.getText();
    }

    /**
     * Вернуть значение поля адреса из таблицы формы.
     *
     * @return String
     */
    @Step("Вернуть значение поля адреса из таблицы формы")
    public String getAddressPracticeForm() {
        return fieldCurrentAddressPracticeForm.getText();
    }
}
