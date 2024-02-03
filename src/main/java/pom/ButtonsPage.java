package pom;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница "Buttons".
 */
public class ButtonsPage {
    /**
     * Локатор кнопки которую нужно щелкнуть 2 раза.
     */
    private final SelenideElement doubleClickBtn = $("#doubleClickBtn");

    /**
     * Локатор кнопки которую нужно щелкнуть ПКМ.
     */
    private final SelenideElement rightClickBtn = $("#rightClickBtn");

    /**
     * Локатор кнопки которую нужно щелкнуть.
     */
    private final SelenideElement dynamicClickBtn = $x("//div/div[3]/button");

    /**
     * Локатор сообщения о нажатии кнопки двойной клик.
     */
    private final SelenideElement doubleClickMessage = $("#doubleClickMessage");

    /**
     * Локатор сообщения о нажатии кнопки ПКМ.
     */
    private final SelenideElement rightClickMessage = $("#rightClickMessage");

    /**
     * Локатор сообщения о нажатии кнопки dynamic.
     */
    private final SelenideElement dynamicClickMessage = $("#dynamicClickMessage");

    /**
     * Сделать двойной клик по кнопке doubleClickBtn.
     */
    public void doubleClick() {
        doubleClickBtn.doubleClick();
    }

    /**
     * Нажать ПКМ по кнопке rightClickBtn.
     */
    public void rightClick() {
        rightClickBtn.contextClick();
    }

    /**
     * Нажать на кнопку dynamicClickBtn.
     */
    public void dynamicClick() {
        dynamicClickBtn.click();
    }

    /**
     * Получить сообщение о нажатии кнопки doubleClickBtn.
     *
     * @return String сообщение о нажатии кнопки doubleClickBtn.
     */
    public String getDoubleClickMessage() {
        return doubleClickMessage.getText();
    }

    /**
     * Вернуть сообщение о нажатии кнопки rightClickBtn.
     *
     * @return String сообщение о нажатии кнопки rightClickBtn.
     */
    public String getRightClickMessage() {
        return rightClickMessage.getText();
    }

    /**
     * Вернуть сообщение о нажатии кнопки dynamicClickBtn.
     *
     * @return String сообщение о нажатии кнопки dynamicClickBtn.
     */
    public String getDynamicClickMessage() {
        return dynamicClickMessage.getText();
    }

}
