package pom;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

/**
 * Страница "CheckBox".
 */
public class CheckBoxPage {

    /**
     * Чекбокс дерева.
     */
    private final SelenideElement checkBox = $x("//span[@class=\"rct-checkbox\"]");

    /**
     * Кнопка свернутого элемента дерева.
     */
    private final SelenideElement buttonCollapseTree = $x("//li[contains(@class,'rct-node-collapsed')]/span/button");

    /**
     * Название видимого элемента дерева.
     */
    private final ElementsCollection titleElementTree = $$x("//span[@class=\"rct-title\"]");

    /**
     * Сообщение об отмеченных элементах.
     */
    private final ElementsCollection messageSuccess = $$x("//span[@class='text-success']");


    /**
     * Отметить все элементы дерева.
     */
    public void checkAllTheBoxes() {
        checkBox.click();
    }

    /**
     * Если найден элемент с классом который говорит что раздел не раскрыт,
     * то открываем его, иначе выходим
     */
    public void uncoverAllTheElementsTree() {
        while (true) {
            if (buttonCollapseTree.exists()) {
                buttonCollapseTree.scrollIntoView(true).click();
            } else {
                break;
            }
        }
    }

    /**
     * Перебираем все элементы дерева и берем из них текст
     *
     * @return List<String>
     */
    public List<String> getAllTitlesTree() {
        List<String> strArr = new ArrayList<>();
        ElementsCollection section = titleElementTree;
        int count = section.size();
        while (count > 0) {
            count--;
            strArr.add(section.get(count).getText());
        }
        return strArr;
    }

    /**
     * Возвращаем сообщение об отмеченных элементах
     *
     * @return ElementCollection
     */
    public ElementsCollection returnMessageSuccess() {
        return messageSuccess;
    }

}
