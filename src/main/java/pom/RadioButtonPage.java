package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

/**
 * Страница "RadioButton".
 */
public class RadioButtonPage {
    /**
     * Локатор поля вывода сообщения о выбранном радио-кнопке.
     */
    private final SelenideElement fieldMessage = $(".text-success");

    /**
     * Локатор радиокнопки Impressive.
     */
    private final SelenideElement impressiveRadioButton = $("label[class*=\"custom-control\"][for=\"impressiveRadio\"]");

    /**
     * Локатор радиокнопки Yes.
     */
    private final SelenideElement yesRadioButton = $("label[class*=\"custom-control\"][for=\"yesRadio\"]");

    /**
     * Выбор радиокнопки Impressive.
     */
    @Step("Выбор радиокнопки Impressive")
    public void clickImpressiveRadioButton() {
        impressiveRadioButton.click();
    }

    /**
     * Выбрать радиокнопку Yes.
     */
    @Step("Выбрать радиокнопку Yes")
    public void clickYesRadioButton() {
        yesRadioButton.click();
    }

    /**
     * Вернуть текст сообщения о выбранной радио-кнопке.
     *
     * @return String
     */
    @Step("Вернуть текст сообщения о выбранной радио-кнопке")
    public String getMessage() {
        fieldMessage.shouldBe(visible);
        return fieldMessage.getText();
    }
}
