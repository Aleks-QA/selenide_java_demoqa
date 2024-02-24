package alerts;

import elements.BaseTest;
import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom.AlertsPage;

import static com.codeborne.selenide.Selenide.open;

public class AlertsTest extends BaseTest {

    /**
     * Проверка работы Alert
     */
    @Test
    @Epic(value = "Alerts")
    @DisplayName("Проверка работы Alert")
    public void FirstAlertTest() {
        open("https://demoqa.com/alerts");

        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonFirstAlert();
        alertsPage.confirmAlert();
    }

    /**
     * Проверка работы Alert с задержкой
     */
    @Test
    @Epic(value = "Alerts")
    @DisplayName("Проверка работы Alert с задержкой")
    public void timerAlertTest() {
        open("https://demoqa.com/alerts");

        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonTimerAlert();
        alertsPage.confirmAlert();
    }

    /**
     * Проверка отклонения Alert
     */
    @Test
    @Epic(value = "Alerts")
    @DisplayName("Проверка отклонения Alert")
    public void confirmAlertTest() {
        open("https://demoqa.com/alerts");

        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonConfirmAlert();
        alertsPage.dismissAlert();
        String message = alertsPage.getMessageConfirmAlert();

        Assertions.assertEquals("You selected Cancel", message);
    }

    /**
     * Проверка ввода текста в Alert
     */
    @Test
    @Epic(value = "Alerts")
    @DisplayName("Проверка ввода текста в Alert")
    public void promptAlertTest() {
        open("https://demoqa.com/alerts");

        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonPromptAlert();
        alertsPage.inputTextPromptAlert("test777");
        String message = alertsPage.getMessagePromptAlert();

        Assertions.assertEquals("You entered test777", message);
    }
}
