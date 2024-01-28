package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ButtonsPage {
    // локатор кнопки которую нужно щелкнуть 2 раза
    private final SelenideElement doubleClickBtn = $("#doubleClickBtn");

    // локатор кнопки которую нужно щелкнуть ПКМ
    private final SelenideElement rightClickBtn = $("#rightClickBtn");

    // локатор кнопки которую нужно щелкнуть
    private final SelenideElement dynamicClickBtn = $x("//div/div[3]/button");

    // локатор сообщения о нажатии кнопки двойной клик
    private final SelenideElement doubleClickMessage = $("#doubleClickMessage");

    // локатор сообщения о нажатии кнопки ПКМ
    private final SelenideElement rightClickMessage = $("#rightClickMessage");

    // локатор сообщения о нажатии кнопки
    private final SelenideElement dynamicClickMessage = $("#dynamicClickMessage");

    // сделать двойной клик по кнопке doubleClickBtn
    public void doubleClick() {
        doubleClickBtn.doubleClick();
    }

    // нажать ПКМ по кнопке rightClickBtn
    public void rightClick() {
        rightClickBtn.contextClick();
    }

    // нажать на кнопку dynamicClickBtn
    public void dynamicClick() {
        dynamicClickBtn.click();
    }

    // вернуть сообщение о нажатии кнопки doubleClickBtn
    public String getDoubleClickMessage() {
        return doubleClickMessage.getText();
    }

    // вернуть сообщение о нажатии кнопки rightClickBtn
    public String getRightClickMessage() {
        return rightClickMessage.getText();
    }

    // вернуть сообщение о нажатии кнопки dynamicClickBtn
    public String getDynamicClickMessage() {
        return dynamicClickMessage.getText();
    }

}
