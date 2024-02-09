package pom;

import com.codeborne.selenide.DownloadOptions;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import java.io.File;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.FileDownloadMode.FOLDER;
import static com.codeborne.selenide.Selenide.*;

/**
 * Страница "Upload and Download".
 */
public class UploadDownloadPage {
    /**
     * Локатор кнопки загрузки файла.
     */
    private final SelenideElement downloadFileButton = $("#downloadButton");

    /**
     * Локатор кнопки отправки файла.
     */
    private final SelenideElement uploadFileButton = $("#uploadFile");

    /**
     * Локатор поля который содержит выбранный путь отправленного файла.
     */
    private final SelenideElement uploadedFilePath = $("#uploadedFilePath");

    /**
     * Загрузка файла.
     *
     * @return String - название загруженного файла
     */
    @Step("Загрузка файла и возврат названия загруженного файла")
    public String downloadFile() {
        downloadFileButton.shouldBe(visible);
        File downloadedFile = downloadFileButton.download(DownloadOptions.using(FOLDER).withTimeout(5000));
        return downloadedFile.getName();
    }

    /**
     * Отправка файла.
     *
     * @return String - путь указанного для отправки файла
     */
    @Step("Отправка файла и возврат пути указанного для отправки файла")
    public String uploadFile() {
        uploadFileButton.uploadFile(new File("./src/main/java/test_data/picture.jpg"));
        uploadedFilePath.shouldBe(visible);
        return uploadedFilePath.text();
    }
}
