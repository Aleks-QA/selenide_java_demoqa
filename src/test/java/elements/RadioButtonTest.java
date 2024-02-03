package elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pom.RadioButtonPage;

import static com.codeborne.selenide.Selenide.*;

public class RadioButtonTest extends BaseTest{

    @Test
    public void radioButtonTest() {
        open("https://demoqa.com/radio-button");

        RadioButtonPage radioButtonPage = new RadioButtonPage();
        radioButtonPage.clickYesRadioButton();
        Assertions.assertEquals("Yes", radioButtonPage.getMessage(), "Текст результата не совпадает с выбранным radioButton");

        radioButtonPage.clickImpressiveRadioButton();
        Assertions.assertEquals("Impressive", radioButtonPage.getMessage(), "Текст результата не совпадает с выбранным radioButton");
    }
}
