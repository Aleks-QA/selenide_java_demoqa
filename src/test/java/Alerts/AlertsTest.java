package Alerts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pom.AlertsPage;
import pom.ButtonsPage;

import static com.codeborne.selenide.Selenide.open;

public class AlertsTest {

    @Test
    public void FirstAlertTest() {
        open("https://demoqa.com/alerts");
        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonFirstAlert();
        alertsPage.confirmAlert();
    }

    @Test
    public void timerAlertTest() {
        open("https://demoqa.com/alerts");
        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonTimerAlert();
        alertsPage.confirmAlert();
    }

    @Test
    public void confirmAlertTest() {
        open("https://demoqa.com/alerts");
        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonConfirmAlert();
        alertsPage.confirmAlert();
        String message = alertsPage.getMessageConfirmAlert();
        System.out.println(message);
        Assertions.assertEquals("You selected Ok", message);
    }

    @Test
    public void promptAlertTest() {
        open("https://demoqa.com/alerts");
        AlertsPage alertsPage = new AlertsPage();
        alertsPage.clickButtonPromptAlert();
        alertsPage.inputTextPromptAlert("test777");
        String message = alertsPage.getMessagePromptAlert();
        System.out.println(message);
        Assertions.assertEquals("You entered test777", message);
    }
}
