import org.junit.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideDoc {
    @Test
    public void selenideDoc() {
        open("/login");//   1. открыть(страницу)
        $("#submit").click();//  2. $(элемент).совершитьДействие()
        $(".message").shouldHave(text("Привет"));//  3. $(элемент).проверитьУсловие()

        //$(String cssSelector) - возвращает объект типа SelenideElement, который представляет первый найденный по CSS селектору элемент на странице
        //$(By) - возвращает "первый SelenideElement" по локатору типа By
        //$$(String cssSelector) - возвращает объект типа ElementsCollection, который представляет коллекцию всех элементов найденных по CSS селектру
        //$$(By) - возвращает "коллекцию элементов" по локатору типа By
        //sleep(1000);

        //$ (cssSelector).text();        //Что бы просто вытащить текст элемента используйте
        //$ (cssSelector).shouldHave(text(“Ваш_текст”));        //Что бы проверить содержится ли нужный вам текст в элементе
        //$x("//div[@id=\"output\"]/div/p[1]").shouldHave(text("qwerty")); // наличие текста в элементе в виде подстроки

        $("#username").shouldBe(visible);   // ждёт, пока элемент появится
        $("#username").shouldHave(text("Hello, Johny!")); // ждёт, пока текст элемента изменится на "Hello, Johny!"
        $("#login-button").shouldHave(cssClass("green-button")); // ждёт, пока кнопка станет зелёной
        $("#login-button").shouldBe(disabled); // ждёт, пока кнопка станет неактивной
        $(".error").shouldNotBe(visible);  // ждёт, пока элемент исчезнет
        $(".error").should(disappear);     // попробуйте-ка сделать это с Selenium в одну строчку!

    }
}
