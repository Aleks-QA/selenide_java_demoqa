package forms;

import org.junit.Test;

import java.io.File;

import static com.codeborne.selenide.ClickOptions.usingJavaScript;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.byText;

import pom.PracticeFormPage;


//@Tag("AllTest")
//@Tag("PracticeFormTest")
public class PracticeFormTest {

    @Test
    public void practiceFormTest() {
        open("https://demoqa.com/automation-practice-form");

        String NAME = "John";
        String LAST_NAME = "Smith";
        String EMAIL = "username@example.com";
        String NUMBER = "8888888888";
        String MONTH = "May";
        String YEAR = "1990";
        String SUBJECTS = "Maths";
        String PATH = "./src/main/java/test_data/picture.jpg";
        String ADDRESS = "programmers street 42";
        String STATE = "NCR";
        String CITY = "Delhi";

        PracticeFormPage practiceFormPage = page(PracticeFormPage.class);
        practiceFormPage.removeFooter();
        practiceFormPage.setFirstName(NAME);
        practiceFormPage.setLastName(LAST_NAME);
        practiceFormPage.setEmail(EMAIL);
        practiceFormPage.clickRandomGender();
        practiceFormPage.setNumber(NUMBER);
        practiceFormPage.setDateOfBirth(MONTH, YEAR);
        practiceFormPage.setSubjects(SUBJECTS);
        practiceFormPage.clickRandomHobbies();
        practiceFormPage.uploadPicture(PATH);
        practiceFormPage.setCurrentAddress(ADDRESS);
        practiceFormPage.setStateAndCity(STATE, CITY);
        practiceFormPage.clickSubmitButton();

        practiceFormPage.assertFormFilled(NAME, LAST_NAME, NUMBER, EMAIL, ADDRESS);

    }
}
