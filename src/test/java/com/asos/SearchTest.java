package com.asos;

import com.asos.pages.HomePage;
import com.asos.pages.SearchPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SearchTest extends BaseTest {
    @BeforeEach
    public void setup() {
        HomePage homePage = new HomePage();
        homePage.openSite();
        homePage.clickAcceptCookies();
        homePage.clickAcceptDelivery();
    }

    @Test
    @DisplayName("Verify search by a product name")
    public void test1() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("mac macximal sleek satin lipstick- blankety");
        searchPage.startSearch();

        Assertions.assertEquals("MAC Macximal Sleek Satin Lipstick- Blankety", searchPage.getFirstTitleFromSearchResult());
    }

    @Test
    @DisplayName("Verify search result for multiple items")
    public void test2() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("mac macximal sleek satin lipstick");
        searchPage.startSearch();
        List<String> results = searchPage.getSearchResultItemsTitleText();
        for (String title : results) {

            Assertions.assertTrue(title.toLowerCase().contains("mac"),
                    "Search result does not contain 'mac': " + title);
        }
    }

    @Test
    @DisplayName("Verify the msg when there is no result")
    public void test3() {
        SearchPage searchPage = new SearchPage();
        searchPage.sendKeysSearch("qwerty");
        searchPage.startSearch();

        Assertions.assertEquals("NOTHING MATCHES YOUR SEARCH", searchPage.getNoResultMsg());
    }
}
