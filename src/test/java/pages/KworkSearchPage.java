package pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

public class KworkSearchPage {

    private final SelenideElement
            searchInput = $(".header-search");
    private final ElementsCollection
            postElements = $$(".page-filters__content");

    @Step("Открыть главную страницу Kwork")
    public KworkSearchPage openHomePage() {
        open("https://kwork.ru/");
        return this;
    }

    @Step("Ввести поисковый запрос {query} и выполнить поиск")
    public KworkSearchPage searchFor(String query) {
        searchInput.setValue(query);
        searchInput.pressEnter();
        return this;
    }

    @Step("Проверка введенного значения {query}")
    public KworkSearchPage checkSearchInputValue(String query) {
        searchInput.shouldHave(Condition.value(query));
        return this;
    }

    @Step("Проверить, что поиск вернул хотя бы 1 результат")
    public void checkSearchResult() {
        postElements.shouldHave(sizeGreaterThan(0));
    }
}