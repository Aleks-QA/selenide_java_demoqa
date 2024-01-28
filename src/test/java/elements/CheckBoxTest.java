package elements;

import org.junit.Test;

import org.junit.Assert;
import pom.CheckBoxPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxTest {

    @Test
    public void checkBoxTest() {
        open("https://demoqa.com/checkbox");

        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.checkAllTheBoxes();
        checkBoxPage.uncoverAllTheElementsTree();
        List<String> allTitleTree = checkBoxPage.getAllTitlesTree();

        // Проверяем что количество найденных элементов совпадает с количеством в массиве
        Assert.assertEquals("Количество найденных элементов не совпадает с количеством в массиве", checkBoxPage.returnMessageSuccess().size(), allTitleTree.size());
    }
}
