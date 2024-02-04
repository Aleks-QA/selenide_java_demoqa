package elements;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom.RadioButtonPage;

import static com.codeborne.selenide.Selenide.*;

public class RadioButtonTest extends BaseTest {

    @Test
    @Epic(value = "Elements")
    @DisplayName("Проверка работы радио-кнопок")
    public void radioButtonTest() {
        open("https://demoqa.com/radio-button");

        RadioButtonPage radioButtonPage = new RadioButtonPage();
        radioButtonPage.clickYesRadioButton();
        //проверка, что нужный radioButton выбран
        Assertions.assertEquals("Yes", radioButtonPage.getMessage(), "Текст результата не совпадает с выбранным radioButton");

        radioButtonPage.clickImpressiveRadioButton();
        //проверка, что нужный radioButton выбран
        Assertions.assertEquals("Impressive", radioButtonPage.getMessage(), "Текст результата не совпадает с выбранным radioButton");
    }
}
