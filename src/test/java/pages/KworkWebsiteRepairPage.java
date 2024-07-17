package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;

public class KworkWebsiteRepairPage {

    SelenideElement pageTitle = $(".catalog-header");
    SelenideElement tagName = $(".active");

    @Step("Открыть раздел 'Настройка сайта'")
    public KworkWebsiteRepairPage openPage() {
        open("/categories/website-repair/nastroyka-sayta");
        return this;
    }

    @Step("Проверка заголовка страницы")
    public KworkWebsiteRepairPage checkTitle() {
        pageTitle.shouldHave(Condition.text("Настройка сайта"));
        return this;
    }

    @Step("Проверка наименования активного тега")
    public KworkWebsiteRepairPage checkTagName() {
        tagName.shouldHave(Condition.text("Настройка сайта"));
        return this;
    }

}