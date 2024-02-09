package elements;

import io.qameta.allure.Epic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pom.UploadDownloadPage;

import static com.codeborne.selenide.Selenide.open;

public class UploadDownloadTest extends BaseTest {

    /**
     * Проверка возможности скачать файл.
     */
    @Test
    @Epic(value = "Elements")
    @DisplayName("Проверка возможности скачать файл")
    public void testDownload() {
        open("https://demoqa.com/upload-download");
        UploadDownloadPage uploadDownloadPage = new UploadDownloadPage();
        String fileName = uploadDownloadPage.downloadFile();

        Assertions.assertEquals("sampleFile.jpeg", fileName, "Название скачанного файла не соответствует ожидаемому");
    }

    /**
     * Проверка возможности отправить файл.
     */
    @Test
    @Epic(value = "Elements")
    @DisplayName("Проверка возможности отправить файл")
    public void testUpload() {
        open("https://demoqa.com/upload-download");
        UploadDownloadPage uploadDownloadPage = new UploadDownloadPage();
        String path = uploadDownloadPage.uploadFile();

        Assertions.assertTrue(path.contains("picture.jpg"));
    }
}
