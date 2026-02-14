package com.example.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import com.example.selenium.pages.WikipediaHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class E2ETest {
    private WebDriver driver;
    private AutoLocator autoLocator;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions opts = new ChromeOptions();
        opts.addArguments("--headless=new");
        opts.addArguments("--no-sandbox");
        driver = new ChromeDriver(opts);
        autoLocator = new AutoLocator();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void wikiSearch_updatesXpathAndContinues() {
        WikipediaHomePage home = new WikipediaHomePage(driver, autoLocator);
        home.open();
        home.search("Selenium (software)");

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.titleContains("Selenium"));

        Assert.assertTrue(driver.getTitle().toLowerCase().contains("selenium"));
    }
}