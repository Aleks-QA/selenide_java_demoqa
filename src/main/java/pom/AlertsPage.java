package pom;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.ModalOptions.withTimeout;

import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

/**
 * Страница "Alerts".
 */
public class AlertsPage {
    /**
     * Локатор кнопки вызова первого Alert.
     */
    private final SelenideElement buttonFirstAlert = $("#alertButton");

    /**
     * Локатор кнопки вызова отложенного Alert.
     */
    private final SelenideElement buttonTimerAlert = $("#timerAlertButton");

    /**
     * Локатор кнопки вызова Confirm.
     */
    private final SelenideElement buttonConfirmAlert = $("#confirmButton");

    /**
     * Локатор кнопки вызова Prompt.
     */
    private final SelenideElement buttonPromptAlert = $("#promtButton");

    /**
     * Локатор получателя сообщения после закрытия Confirm.
     */
    private final SelenideElement messageConfirmAlert = $("#confirmResult");

    /**
     * Локатор получателя сообщения после закрытия Prompt.
     */
    private final SelenideElement messagePromptAlert = $("#promptResult");

    /**
     * Нажатие кнопки вызова первого Alert.
     */
    @Step("Нажатие кнопки вызова первого Alert")
    public void clickButtonFirstAlert() {
        buttonFirstAlert.shouldBe(visible).click();
    }

    /**
     * Нажатие кнопки вызова отложенного Alert.
     */
    @Step("Нажатие кнопки вызова отложенного Alert")
    public void clickButtonTimerAlert() {
        buttonTimerAlert.shouldBe(visible).click();
    }

    /**
     * Нажатие кнопки вызова Confirm.
     */
    @Step("Нажатие кнопки вызова Confirm")
    public void clickButtonConfirmAlert() {
        buttonConfirmAlert.shouldBe(visible).click();
    }

    /**
     * Нажатие кнопки вызова Prompt.
     */
    @Step("Нажатие кнопки вызова Prompt")
    public void clickButtonPromptAlert() {
        buttonPromptAlert.shouldBe(visible).click();
    }

    /**
     * Подтвердить Alert.
     */
    @Step("Подтвердить Alert")
    public void confirmAlert() {
        confirm(withTimeout(ofSeconds(15)));
    }

    /**
     * Отклонить Alert.
     */
    @Step("Отклонить Alert")
    public void dismissAlert() {
        dismiss(withTimeout(ofSeconds(15)));
    }

    /**
     * Ввод текста в Prompt.
     *
     * @param name имя для ввода.
     */
    @Step("Ввод текста в Prompt")
    public void inputTextPromptAlert(final String name) {
        prompt("Please enter your name", name);
    }

    /**
     * Получение текста после закрытия Confirm.
     *
     * @return полученный текст.
     */
    @Step("Получение текста после закрытия Confirm")
    public String getMessageConfirmAlert() {
        messageConfirmAlert.shouldBe(visible);
        return messageConfirmAlert.getText();
    }

    /**
     * Получение текста после закрытия Prompt.
     *
     * @return полученный текст.
     */
    @Step("Получение текста после закрытия Prompt.")
    public String getMessagePromptAlert() {
        messagePromptAlert.shouldBe(visible);
        return messagePromptAlert.getText();
    }
}
