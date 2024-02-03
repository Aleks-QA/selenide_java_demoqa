package forms;

import elements.BaseTest;

import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pom.PracticeFormPage;


//@Tag("AllTest")
//@Tag("PracticeFormTest")
public class PracticeFormTest extends BaseTest {

    @Test
    public void practiceFormTest() {
        open("https://demoqa.com/automation-practice-form");

        String firstName = "John";
        String lastName = "Smith";
        String email = "username@example.com";
        String number = "8888888888";
        String month = "May";
        String year = "1990";
        String subject = "Maths";
        String pathImage = "./src/main/java/test_data/picture.jpg";
        String address = "programmers street 42";
        String state = "NCR";
        String city = "Delhi";

        PracticeFormPage practiceFormPage = page(PracticeFormPage.class);
        practiceFormPage.removeFooter();
        practiceFormPage.setFirstName(firstName);
        practiceFormPage.setLastName(lastName);
        practiceFormPage.setEmail(email);
        practiceFormPage.clickRandomGender();
        practiceFormPage.setNumber(number);
        practiceFormPage.setDateOfBirth(month, year);
        practiceFormPage.setSubjects(subject);
        practiceFormPage.clickRandomHobbies();
        practiceFormPage.uploadPicture(pathImage);
        practiceFormPage.setCurrentAddress(address);
        practiceFormPage.setStateAndCity(state, city);
        practiceFormPage.clickSubmitButton();

        // проверка корректности заполненных полей
        Assertions.assertEquals(practiceFormPage.getNamePracticeForm(), firstName + " " + lastName);
        Assertions.assertEquals(practiceFormPage.getEmailPracticeForm(), email);
        Assertions.assertEquals(practiceFormPage.getNumberPracticeForm(), number);
        Assertions.assertEquals(practiceFormPage.getAddressPracticeForm(), address);
    }
}
