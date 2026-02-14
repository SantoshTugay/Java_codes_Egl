package com.example.selenium.pages;

import com.example.selenium.AutoLocator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikipediaHomePage {
    private final WebDriver driver;
    private final AutoLocator autoLocator;

    // POM keys and default xpaths (defaults live here)
    public static final String SEARCH_BOX_KEY = "WikipediaHomePage.searchBox";
    public static final String SEARCH_BOX_DEFAULT = "//input[@id='searchInput']";

    public WikipediaHomePage(WebDriver driver, AutoLocator autoLocator) {
        this.driver = driver;
        this.autoLocator = autoLocator;
    }

    public void open() {
        driver.get("https://www.wikipedia.org/");
    }

    public void search(String query) {
        WebElement search = autoLocator.findElement(driver, SEARCH_BOX_KEY, SEARCH_BOX_DEFAULT);
        search.sendKeys(query);
        search.sendKeys(Keys.ENTER);
    }
}