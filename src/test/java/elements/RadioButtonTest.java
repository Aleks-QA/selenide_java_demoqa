package elements;

import org.junit.Test;

import org.junit.Assert;
import pom.RadioButtonPage;

import static com.codeborne.selenide.Selenide.*;

public class RadioButtonTest {

    @Test
    public void radioButtonTest() {
        open("https://demoqa.com/radio-button");

        RadioButtonPage radioButtonPage = new RadioButtonPage();
        radioButtonPage.clickYesRadioButton();
        Assert.assertEquals("Текст результата не совпадает с выбранным radioButton", "Yes", radioButtonPage.getMessage());

        radioButtonPage.clickImpressiveRadioButton();
        Assert.assertEquals("Текст результата не совпадает с выбранным radioButton", "Impressive", radioButtonPage.getMessage());
    }
}
