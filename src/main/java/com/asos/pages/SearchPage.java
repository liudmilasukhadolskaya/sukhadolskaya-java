package com.asos.pages;

import com.asos.webdriver.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchPage {
    private final String INPUT_SEARCH = "//input[@data-testid='search-input']";
    private final String BUTTON_SEARCH = "//button[@data-testid='search-button-inline']";
    private final String TITLE_FIRST_RESULT = "//h2[@class='productDescription_sryaw'][1]";
    private final String TITLES_ALL_RESULTS = "//h2[@class='productDescription_sryaw']";
    private final String TITLE_NO_RESULTS = "//h2[@class='grid-text__title ' and not(contains(@style, 'display:none'))]";

    public void sendKeysSearch(String search) {
        WebDriver.sendKeysToElement(INPUT_SEARCH, search);
    }

    public void startSearch() {
        WebDriver.clickElement(BUTTON_SEARCH);
    }

    public String getFirstTitleFromSearchResult() {
        return WebDriver.getTextFromElement(TITLE_FIRST_RESULT);
    }

    public List<String> getSearchResultItemsTitleText() {
        List<WebElement> elements = WebDriver.getDriver().findElements(By.xpath(TITLES_ALL_RESULTS));
        List<String> titles = new ArrayList<>();
        for (WebElement element : elements) {
            titles.add(element.getText());
        }
        return titles;
    }

    public String getNoResultMsg() {
        return WebDriver.getTextFromElement(TITLE_NO_RESULTS);
    }
}
