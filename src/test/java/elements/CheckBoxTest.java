package elements;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom.CheckBoxPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxTest extends BaseTest {

    @Test
    @Epic(value = "Elements")
    @DisplayName("Проверка возможности раскрытия дерева и выбора всех чек боксов")
    public void checkBoxTest() {
        open("https://demoqa.com/checkbox");

        CheckBoxPage checkBoxPage = new CheckBoxPage();
        checkBoxPage.checkAllTheBoxes();
        checkBoxPage.uncoverAllTheElementsTree();
        List<String> allTitleTree = checkBoxPage.getAllTitlesTree();

        // Проверяем что количество найденных элементов совпадает с количеством в массиве
        Assertions.assertEquals(checkBoxPage.returnMessageSuccess().size(), allTitleTree.size(), "Количество найденных элементов не совпадает с количеством в массиве");
    }
}
