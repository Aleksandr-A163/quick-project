package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;


@Tag("kwork-web")
public class KworkWebTest extends BaseTest {

    @DisplayName("Проверка наличия ссылки на VK переход по ссылке")
    @Test
    public void vkLinkFunctionalityTest() {
        KworkLinksPage linksVkPage = new KworkLinksPage();

        linksVkPage.openHomePage()
                .goToVkLink()
                .checkVkUrl()
                .openHomePage();
    }

    @DisplayName("Проверка наличия ссылки на Apple и проверка заголовка")
    @Test
    public void AppleLinkFunctionalityTest() {
        KworkLinksPage linksApplePage = new KworkLinksPage();

        linksApplePage.openHomePage()
                .goToAppleLink()
                .checkTitleName();
    }


    @DisplayName("Проверка наименований заголовков и тегов")
    @Test
    public void WebsiteRepairPageTest() {
        KworkWebsiteRepairPage kworkPage = new KworkWebsiteRepairPage();

        kworkPage.openPage()
                .checkTitle()
                .checkTagName();
    }

    @DisplayName("Проверка поиска на главной странице кириллией")
    @Test
    public void SearchKirilFunctionalityTest() {
        KworkSearchPage searchPage = new KworkSearchPage();

        searchPage.openHomePage()
                .searchFor("настройка чат бота")
                .checkSearchInputValue("настройка чат бота")
                .checkSearchResult();
    }

    @DisplayName("Проверка поиска на главной странице латиницей")
    @Test
    public void SearchEngFunctionalityTest() {
        KworkSearchPage searchPage = new KworkSearchPage();

        searchPage.openHomePage()
                .searchFor("QA")
                .checkSearchInputValue("QA")
                .checkSearchResult();
    }

    @DisplayName("Проверка поиска на главной странице по числу")
    @Test
    public void SearchNumberFunctionalityTest() {
        KworkSearchPage searchPage = new KworkSearchPage();

        // Проверяем работу поиска
        searchPage.openHomePage()
                .searchFor("12")
                .checkSearchInputValue("12")
                .checkSearchResult();
    }
}