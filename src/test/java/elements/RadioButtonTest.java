package elements;

import org.junit.Test;

import org.junit.Assert;
import static com.codeborne.selenide.Selenide.*;

public class RadioButtonTest {

    @Test
    public void radioButtonTest() {
        open("https://demoqa.com/radio-button");

        // Impressive
        $("label[class*=\"custom-control\"][for=\"impressiveRadio\"]").click();
        Assert.assertEquals("Текст результата не совпадает с выбранным  radioButton", $(".text-success").text(), $("label[class*=\"custom-control\"][for=\"impressiveRadio\"]").text());
        sleep(1000);

        // Yes
        $("label[class*=\"custom-control\"][for=\"yesRadio\"]").click();
        Assert.assertEquals("Текст результата не совпадает с выбранным  radioButton", $(".text-success").text(), $("label[class*=\"custom-control\"][for=\"yesRadio\"]").text());
        sleep(1000);

    }

}
