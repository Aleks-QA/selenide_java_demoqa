package elements;

import org.junit.Assert;
import org.junit.Test;
import pom.ButtonsPage;

import static com.codeborne.selenide.Selenide.*;

public class ButtonsTest {

    @Test
    public void buttonsTest() {
        open("https://demoqa.com/buttons");

        ButtonsPage buttonsPage = new ButtonsPage();
        buttonsPage.doubleClick();
        buttonsPage.rightClick();
        buttonsPage.dynamicClick();

        // Проверяем
        Assert.assertEquals("You have done a double click", buttonsPage.getDoubleClickMessage());
        Assert.assertEquals("You have done a right click", buttonsPage.getRightClickMessage());
        Assert.assertEquals("You have done a dynamic click", buttonsPage.getDynamicClickMessage());
    }
}
