package pom;

import com.codeborne.selenide.ModalOptions;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.ModalOptions.withTimeout;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

/**
 * Страница "Alerts".
 */
public class AlertsPage {
    SelenideElement buttonFirstAlert = $("#alertButton"); // alertButton
    SelenideElement buttonTimerAlert = $("#timerAlertButton"); // timerAlertButton
    SelenideElement buttonConfirmAlert = $("#confirmButton"); // confirmButton
    SelenideElement buttonPromptAlert = $("#promtButton"); // promtButton
    SelenideElement messageConfirmAlert = $("#confirmResult"); // confirmResult
    SelenideElement messagePromptAlert = $("#promptResult"); // promptResult

    public void clickButtonFirstAlert() {
        buttonFirstAlert.shouldBe(visible).click();
    }

    public void clickButtonTimerAlert() {
        buttonTimerAlert.shouldBe(visible).click();
    }

    public void clickButtonConfirmAlert() {
        buttonConfirmAlert.shouldBe(visible).click();
    }

    public void clickButtonPromptAlert() {
        buttonPromptAlert.shouldBe(visible).click();
    }

    public void confirmAlert() {
        confirm(withTimeout(ofSeconds(15)));
    }

    public void inputTextPromptAlert(String name) {
        prompt("Please enter your name", name);
    }

    public void dismissAlert() {
        dismiss(withTimeout(ofSeconds(15)));
    }

    public String getMessageConfirmAlert() {
        messageConfirmAlert.shouldBe(visible);
        return messageConfirmAlert.getText();
    }

    public String getMessagePromptAlert() {
        messagePromptAlert.shouldBe(visible);
        return messagePromptAlert.getText();
    }
}
