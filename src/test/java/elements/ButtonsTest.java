package elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pom.ButtonsPage;

import static com.codeborne.selenide.Selenide.*;

public class ButtonsTest extends BaseTest {

    @Test
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
