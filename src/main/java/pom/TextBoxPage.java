package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

/**
 * Страница "TextBox"
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
     * Ввести имя.
     *
     * @param name имя
     */
    public void setFullName(final String name) {
        fieldFullName.scrollIntoView(true).setValue(name);
    }

    /**
     * Ввести почту.
     *
     * @param email почта
     */
    public void setEmail(final String email) {
        fieldEmail.scrollIntoView(true).setValue(email);
    }

    /**
     * Ввести текущий адрес.
     *
     * @param currentAddress текущий адрес
     */
    public void setCurrentAddress(final String currentAddress) {
        fieldCurrentAddress.scrollIntoView(true).setValue(currentAddress);
    }

    /**
     * Ввести постоянный адрес.
     *
     * @param permanentAddress постоянный адрес
     */
    public void setPermanentAddress(final String permanentAddress) {
        fieldPermanentAddress.scrollIntoView(true).setValue(permanentAddress);
    }

    /**
     * Отправить форму.
     */
    public void clickSubmit() {
        submitButton.scrollIntoView(true).click();
    }

    /**
     * Проверить видимость поля вывода введенных значений.
     */
    public void visibilityFieldOutput() {
        fieldOutput.shouldBe(visible);
    }

    /**
     * Получить имя из поля вывода
     *
     * @return String - имя
     */
    public String getOutputFullName() {
        return fieldOutputFullName.getText();
    }

    /**
     * Получить почту из поля вывода
     *
     * @return String - почта
     */
    public String getOutputEmail() {
        return fieldOutputEmail.getText();
    }

    /**
     * Получить текущий адрес из поля вывода
     *
     * @return String - текущий адрес
     */
    public String getOutputCurrentAddress() {
        return fieldOutputCurrentAddress.getText();
    }

    /**
     * Получить постоянный адрес из поля вывода
     *
     * @return String - постоянный адрес
     */
    public String getOutputPermanentAddress() {
        return fieldOutputPermanentAddress.getText();
    }
}
