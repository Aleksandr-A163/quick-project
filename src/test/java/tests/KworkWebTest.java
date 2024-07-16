package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;


@Tag("kwork-web")
public class KworkWebTest extends BaseTest {

    @DisplayName("Проверка наличия ссылки на VK переход по ссылке")
    @Test
    public void testVkLinkFunctionality() {
        KworkLinks linksVkPage = new KworkLinks();

        linksVkPage.openHomePage()
                 .goToVkLink()
                 .checkVkUrl()
                 .openHomePage();
    }

    @DisplayName("Проверка наличия ссылки на Apple + переход по ссылке")
    @Test
    public void testAppleLinkFunctionality() {
        KworkLinks linksApplePage = new KworkLinks();

        linksApplePage.openHomePage()
                 .goToAppleLink();
    }


    @DisplayName("Проверка наименований заголовков и тегов")
    @Test
    public void testWebsiteRepairPage() {
        KworkWebsiteRepairPage kworkPage = new KworkWebsiteRepairPage();

        // Открываем страницу и проверяем наименование заголовок и тегов
        kworkPage.openPage()
                 .checkTitle()
                 .checkTagName();
    }

    @DisplayName("Проверка поиска на главной странице кириллией")
    @Test
    public void testSearchKirilFunctionality() {
        KworkSearch searchPage = new KworkSearch();

        // Проверяем работу поиска
        searchPage.openHomePage()
                  .searchFor("настройка чат бота")
                  .checkSearchInputValue("настройка чат бота")
                  .checkSearchResult();
    }

    @DisplayName("Проверка поиска на главной странице латиницей")
    @Test
    public void testSearchEngFunctionality() {
        KworkSearch searchPage = new KworkSearch();

        // Проверяем работу поиска
        searchPage.openHomePage()
                  .searchFor("QA")
                  .checkSearchInputValue("QA")
                  .checkSearchResult();
    }

    @DisplayName("Проверка поиска на главной странице по числу")
    @Test
    public void testSearchNumberFunctionality() {
        KworkSearch searchPage = new KworkSearch();

        // Проверяем работу поиска
        searchPage.openHomePage()
                  .searchFor("12")
                  .checkSearchInputValue("12")
                  .checkSearchResult();
    }


}