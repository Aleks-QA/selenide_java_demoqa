package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Страница "TextBox".
 */
public class TextBoxPage {
    /**
     * Локатор поля ввода имени.
     */
    private final SelenideElement fieldFullName = $("#userName");

    /**
     * Локатор поля ввода почты.
     */
    private final SelenideElement fieldEmail = $("#userEmail");

    /**
     * Локатор поля ввода текущего адреса.
     */
    private final SelenideElement fieldCurrentAddress = $("#currentAddress");

    /**
     * Локатор поля ввода постоянного адреса.
     */
    private final SelenideElement fieldPermanentAddress = $("#permanentAddress");

    /**
     * Локатор кнопки отправить.
     */
    private final SelenideElement submitButton = $x("//button[text()=\"Submit\"]");

    /**
     * Локатор поля вывода заполненных полей.
     */
    private final SelenideElement fieldOutput = $("#output");

    /**
     * Локатор поля вывода введенного имени.
     */
    private final SelenideElement fieldOutputFullName = $x("//div[@id=\"output\"]/div/p[1]");

    /**
     * Локатор поля вывода введенной почты.
     */
    private final SelenideElement fieldOutputEmail = $x("//div[@id=\"output\"]/div/p[2]");

    /**
     * Локатор поля вывода введенного текущего адреса.
     */
    private final SelenideElement fieldOutputCurrentAddress = $x("//div[@id=\"output\"]/div/p[3]");

    /**
     * Локатор поля вывода введенного постоянного адреса.
     */
    private final SelenideElement fieldOutputPermanentAddress = $x("//div[@id=\"output\"]/div/p[4]");

    /**
     * Ввод имени.
     *
     * @param name имя
     */
    @Step("Ввод имени")
    public void setFullName(final String name) {
        fieldFullName.scrollIntoView(true).setValue(name);
    }

    /**
     * Ввод почты.
     *
     * @param email почта
     */
    @Step("Ввод почты")
    public void setEmail(final String email) {
        fieldEmail.scrollIntoView(true).setValue(email);
    }

    /**
     * Ввод текущего адреса.
     *
     * @param currentAddress текущий адрес
     */
    @Step("Ввод текущего адреса")
    public void setCurrentAddress(final String currentAddress) {
        fieldCurrentAddress.scrollIntoView(true).setValue(currentAddress);
    }

    /**
     * Ввод постоянного адреса.
     *
     * @param permanentAddress постоянный адрес
     */
    @Step("Ввод постоянного адреса")
    public void setPermanentAddress(final String permanentAddress) {
        fieldPermanentAddress.scrollIntoView(true).setValue(permanentAddress);
    }

    /**
     * Отправка формы.
     */
    @Step("Отправка формы")
    public void clickSubmit() {
        submitButton.scrollIntoView(true).click();
    }

    /**
     * Проверка видимости поля вывода введенных значений.
     */
    @Step("Проверка видимости поля вывода введенных значений")
    public void visibilityFieldOutput() {
        fieldOutput.shouldBe(visible);
    }

    /**
     * Получение имени из поля вывода.
     *
     * @return String - имя
     */
    @Step("Получение имени из поля вывода")
    public String getOutputFullName() {
        return fieldOutputFullName.getText();
    }

    /**
     * Получение почты из поля вывода.
     *
     * @return String - почта
     */
    @Step("Получение почты из поля вывода")
    public String getOutputEmail() {
        return fieldOutputEmail.getText();
    }

    /**
     * Получение текущего адреса из поля вывода.
     *
     * @return String - текущий адрес
     */
    @Step("Получение текущего адреса из поля вывода")
    public String getOutputCurrentAddress() {
        return fieldOutputCurrentAddress.getText();
    }

    /**
     * Получение постоянного адреса из поля вывода.
     *
     * @return String - постоянный адрес
     */
    @Step("Получение постоянного адреса из поля вывода")
    public String getOutputPermanentAddress() {
        return fieldOutputPermanentAddress.getText();
    }
}
