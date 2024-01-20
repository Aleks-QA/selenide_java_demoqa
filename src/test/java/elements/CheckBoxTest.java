package elements;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class CheckBoxTest {

    @Test
    public void checkBoxTest() {
        open("https://demoqa.com/checkbox");
        $x("//span[@class=\"rct-text\"]/button").click();
        $x("//span[@class=\"rct-checkbox\"]").click();

        // Если найден элемент с классом который говорит что раздел не раскрыт, то открываем его, иначе выходим
        while (true) {
            if ($x("//li[contains(@class,'rct-node-collapsed')]/span/button").exists()) {
                $x("//li[contains(@class,'rct-node-collapsed')]/span/button").scrollIntoView(true).click();
            } else {
                break;
            }
        }

        // Перебираем все элементы и берем из них текст
        List<String> strArr = new ArrayList<>();
        ElementsCollection section = $$x("//span[@class =\"rct-title\"]");
        int count = section.size();
        while (count > 0) {
            count--;
            strArr.add(section.get(count).getText());
        }

        // Проверяем что количество найденных элементов совпадает с количеством в массиве
        assertEquals("Количество найденных элементов не совпадает с количеством в массиве", $$x("//span[@class='text-success']").size(), strArr.size());
        sleep(1000);
    }
}
