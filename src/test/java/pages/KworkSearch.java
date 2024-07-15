package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class KworkSearch {
    SelenideElement searchInput = $(".header-search");

    @Step("Открыть главную страницу Kwork")
    public KworkSearch openHomePage() {
        open("https://kwork.ru/");
        return this;
    }

    @Step("Ввести поисковый запрос {query} и выполнить поиск")
    public KworkSearch searchFor(String query) {
        searchInput.setValue(query);
        searchInput.pressEnter();
        return this;
    }
}