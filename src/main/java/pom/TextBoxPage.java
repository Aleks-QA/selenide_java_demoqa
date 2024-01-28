package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxPage {
    // локатор поля ввода имени
    private final SelenideElement fieldFullName = $("#userName");

    // локатор поля ввода почты
    private final SelenideElement fieldEmail = $("#userEmail");

    // локатор поля ввода текущего адреса
    private final SelenideElement fieldCurrentAddress = $("#currentAddress");

    // локатор поля ввода постоянного адреса
    private final SelenideElement fieldPermanentAddress = $("#permanentAddress");

    // локатор кнопки отправить
    private final SelenideElement submitButton = $x("//button[text()=\"Submit\"]");

    // локатор поля вывода заполненных полей
    private final SelenideElement fieldOutput = $("#output");

    // локатор поля вывода введенного имени
    private final SelenideElement fieldOutputFullName = $x("//div[@id=\"output\"]/div/p[1]");

    // локатор поля вывода введенной почты
    private final SelenideElement fieldOutputEmail = $x("//div[@id=\"output\"]/div/p[2]");

    // локатор поля вывода введенного текущего адреса
    private final SelenideElement fieldOutputCurrentAddress = $x("//div[@id=\"output\"]/div/p[3]");

    // локатор поля вывода введенного постоянного адреса
    private final SelenideElement fieldOutputPermanentAddress = $x("//div[@id=\"output\"]/div/p[4]");

    // ввести имя
    public void setFullName(String name) {
        fieldFullName.scrollIntoView(true).setValue(name);
    }

    // ввести почту
    public void setEmail(String email) {
        fieldEmail.scrollIntoView(true).setValue(email);
    }

    // ввести текущий адрес
    public void setCurrentAddress(String currentAddress) {
        fieldCurrentAddress.scrollIntoView(true).setValue(currentAddress);
    }

    // ввести постоянный адрес
    public void setPermanentAddress(String permanentAddress) {
        fieldPermanentAddress.scrollIntoView(true).setValue(permanentAddress);
    }

    // отправить форму
    public void clickSubmit() {
        submitButton.scrollIntoView(true).click();
    }

    //проверить видимость поля вывода введенных значений
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
