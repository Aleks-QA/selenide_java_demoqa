package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RadioButtonPage {
    // локатор поля вывода сообщения о выбранном радио-кнопке
    private final SelenideElement fieldMessage = $(".text-success");

    // локатор радиокнопки Impressive
    private final SelenideElement impressiveRadioButton = $("label[class*=\"custom-control\"][for=\"impressiveRadio\"]");

    // локатор радиокнопки Yes
    private final SelenideElement yesRadioButton = $("label[class*=\"custom-control\"][for=\"yesRadio\"]");

    // выбор радиокнопки Impressive
    public void clickImpressiveRadioButton() {
        impressiveRadioButton.click();
    }

    // выбрать радиокнопку Yes
    public void clickYesRadioButton() {
        yesRadioButton.click();
    }

    /**
     * Вернуть текст сообщения о выбранной радио-кнопке
     *
     * @return String
     */
    public String getMessage() {
        fieldMessage.shouldBe(visible);
        return fieldMessage.getText();
    }
}
