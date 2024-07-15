package tests;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;


@Tag("web")

public class KworkWebTest extends BaseTest {

    @DisplayName("Проверка наименований заголовков и тегов")
    @Test
    public void testWebsiteRepairPage() {
        KworkWebsiteRepairPage kworkPage = new KworkWebsiteRepairPage();

        // Открываем страницу и проверяем наименование заголовок и тегов
        kworkPage.openPage()
                 .checkTitle()
                 .checkTagName();
    }


    @Test
    public void testSearchFunctionality() {
        KworkSearch searchPage = new KworkSearch();

        // Открываем главную страницу, выполняем поиск и проверяем результаты
        searchPage.openHomePage()
                  .searchFor("настройка чат бота");
    }

}