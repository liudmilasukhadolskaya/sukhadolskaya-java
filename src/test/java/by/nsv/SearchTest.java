package by.nsv;

import by.nsv.pages.HomePage;
import by.nsv.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchTest extends BaseTest {
    @BeforeEach
    public void openSiteAcceptCookies() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.closeBanner();
        homePage.clickAccept();
    }

    @Test
    @DisplayName("Ensure a specific item appears in search results")
    public void test1() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("Мотоцикл Bajaj Boxer BM 125 X - 5 передач (синий)");
        searchPage.startSearch();

        Assertions.assertEquals("Мотоцикл Bajaj Boxer BM 125 X - 5 передач (синий)", searchPage.getSearchResultFirstItemTitleText());
    }

    @Test
    @DisplayName("Verify search result contains 'мотоцикл'")
    public void test2() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("мотоцикл");
        searchPage.startSearch();
        List<String> results = searchPage.getSearchResultItemsTitleText();
        for (String title : results) {

            Assertions.assertTrue(title.toLowerCase().contains("мотоцикл"),
                    "Search result does not contain 'мотоцикл': " + title);
        }
    }

    @Test
    @DisplayName("Verify the msg when no results found")
    public void test3() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("cucumber");
        searchPage.startSearch();

        Assertions.assertEquals(" \nСожалеем, но ничего не найдено.", searchPage.getNoResultsMsg());
    }
}
