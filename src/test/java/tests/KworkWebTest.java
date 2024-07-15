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
}