package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.DisplayName;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.url;

public class KworkLinksPage {

    private final SelenideElement
            vkLink = $("a[href='https://vk.com/kwork_kwork']"),
            appleLink = $("a[href='https://apps.apple.com/ru/app/kwork/id1456387980']"),
            titleName = $(".app-header");

    @DisplayName("Проверка VK")
    @Step("Открыть главную страницу Kwork")
    public KworkLinksPage openHomePage() {
        open("https://kwork.ru/");
        return this;
    }

    @Step("Перейти в VK по ссылке в футере")
    public KworkLinksPage goToVkLink() {
        executeJavaScript("arguments[0].click();", vkLink);
        return this;
    }

    @Step("Проверить наличие адреса VK в строке браузера")
    public KworkLinksPage checkVkUrl() {
        switchTo().window(1);  // Переключаемся на новую вкладку
        // Проверяем, что текущий URL совпадает с ожидаемым
        String currentUrl = url();
        if (!currentUrl.equals("https://vk.com/kwork_kwork")) {
            throw new AssertionError("Current URL is not as expected. Expected: https://vk.com/kwork_kwork, but was: " + currentUrl);
        }
        return this;
    }

    @DisplayName("Проверка перехода в apple store из футера")
    @Step("Перейти на страницу Kwork в Apple Store по ссылке в футере")
    public KworkLinksPage goToAppleLink() {
        executeJavaScript("arguments[0].click();", appleLink);
        return this;
    }

    @Step("Проверить наименование заголовка в apple store")

    public KworkLinksPage checkTitleName() {
        switchTo().window(1);
        titleName.shouldHave(Condition.text("Kwork"));
        return this;
    }
}
