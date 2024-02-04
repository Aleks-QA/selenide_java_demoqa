package elements;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom.TextBoxPage;

import static com.codeborne.selenide.Selenide.*;


public class TextBoxTest extends BaseTest {

    @Test
    @Epic(value = "Elements")
    @DisplayName("Проверка возможности заполнения полей ввода")
    public void testTextBox() {
        open("https://demoqa.com/text-box");

        final String fullName = "qwerty qwerty";
        final String email = "qwerty@gmail.com";
        final String currentAddress = "qwerty 142";
        final String permanentAddress = "Berlin n/a";

        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.setFullName(fullName);
        textBoxPage.setEmail(email);
        textBoxPage.setCurrentAddress(currentAddress);
        textBoxPage.setPermanentAddress(permanentAddress);
        textBoxPage.clickSubmit();
        textBoxPage.visibilityFieldOutput();

        // проверка вхождения переменной в соответствующих полях ввода
        Assertions.assertTrue(textBoxPage.getOutputFullName().contains(fullName));
        Assertions.assertTrue(textBoxPage.getOutputEmail().contains(email));
        Assertions.assertTrue(textBoxPage.getOutputCurrentAddress().contains(currentAddress));
        Assertions.assertTrue(textBoxPage.getOutputPermanentAddress().contains(permanentAddress));
    }
}
