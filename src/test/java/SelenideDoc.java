import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideDoc {
    public void selenideDoc() {
        open("/login");//   1. открыть(страницу)
        $("#submit").click();//  2. $(элемент).совершитьДействие()
        $(".message").shouldHave(text("Привет"));//  3. $(элемент).проверитьУсловие()
        $("#username").shouldBe(visible);   // ждёт, пока элемент появится
        $("#username").shouldHave(text("Hello, Johny!")); // ждёт, пока текст элемента изменится на "Hello, Johny!"
        $("#login-button").shouldHave(cssClass("green-button")); // ждёт, пока кнопка станет зелёной
        $("#login-button").shouldBe(disabled); // ждёт, пока кнопка станет неактивной
        $(".error").shouldNotBe(visible);  // ждёт, пока элемент исчезнет
        $(".error").should(disappear);     // попробуйте-ка сделать это с Selenium в одну строчку!
        $("#doubleClickBtn").click(usingJavaScript().offset(123, 222)); //Клик со сдвигом, чтобы кликать не в центр элемента
        $("#doubleClickBtn").doubleClick(); // двойной клик
        $("#doubleClickBtn").contextClick(); // ПКМ
        $(By.id("userName")).scrollIntoView(true).setValue("qwerty");// скрол
        $("[id=uploadPicture]").uploadFile(new File("./src/main/java/test_data/picture.jpg"));        //загрузить картинку в разделе Picture


//        executeJavaScript("$('footer').hide();");//удалить элемент
//        $.sendKeys ввод как в Selenium по умолчанию, то есть медленно и с генерацией событий.
//        $.setValue установка значения поля через JavaScript.
//        $(String cssSelector) - возвращает объект типа SelenideElement, который представляет первый найденный по CSS селектору элемент на странице
//        $(By) - возвращает "первый SelenideElement" по локатору типа By
//        $$(String cssSelector) - возвращает объект типа ElementsCollection, который представляет коллекцию всех элементов найденных по CSS селектору
//        $$(By) - возвращает "коллекцию элементов" по локатору типа By
//        $ (cssSelector).text();        //Что бы просто вытащить текст элемента используйте
//        $ (cssSelector).shouldHave(text(“Ваш_текст”));        //Что бы проверить содержится ли нужный вам текст в элементе
//        $x("//div[@id=\"output\"]/div/p[1]").shouldHave(text("qwerty")); // наличие текста в элементе в виде подстроки

    }
}
