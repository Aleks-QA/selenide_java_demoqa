package elements;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom.ButtonsPage;

import static com.codeborne.selenide.Selenide.*;

public class ButtonsTest extends BaseTest {
    /**
     * Проверка возможности различного способа нажатия кнопок:
     */
    @Test
    @Epic(value = "Elements")
    @DisplayName("Проверка возможности различного способа нажатия кнопок: клик на кнопку ПКМ, двойной клик ПКМ и клик ЛКМ")
    public void buttonsTest() {
        open("https://demoqa.com/buttons");

        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage.doubleClick();
        buttonsPage.rightClick();
        buttonsPage.dynamicClick();

        // Проверяем нажатие на кнопки
        Assertions.assertEquals("You have done a double click", buttonsPage.getDoubleClickMessage());
        Assertions.assertEquals("You have done a right click", buttonsPage.getRightClickMessage());
        Assertions.assertEquals("You have done a dynamic click", buttonsPage.getDynamicClickMessage());
    }
}
