package com.example.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class AutoLocator {
    private static final Duration SHORT_WAIT = Duration.ofSeconds(4);

    public WebElement findElement(WebDriver driver, String key) {
        return findElement(driver, key, null);
    }

    public WebElement findElement(WebDriver driver, String key, String defaultXpath) {
        String xpath = LocatorStore.get(key);
        if (xpath != null) {
            try {
                return new WebDriverWait(driver, SHORT_WAIT).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
            } catch (Exception e) {
                System.out.println("Stored XPath failed for key '" + key + "': " + xpath);
            }
        }

        if (defaultXpath != null && !defaultXpath.isEmpty()) {
            try {
                return new WebDriverWait(driver, SHORT_WAIT).until(ExpectedConditions.presenceOfElementLocated(By.xpath(defaultXpath)));
            } catch (Exception e) {
                System.out.println("Default XPath failed for key '" + key + "': " + defaultXpath);
            }
        }

        // Heuristic search: look for elements whose id/name/placeholder/title/class/text contains the key
        List<WebElement> candidates = driver.findElements(By.cssSelector("input,button,a,select,textarea,div,span"));
        String loweredKey = key.toLowerCase();
        for (WebElement el : candidates) {
            try {
                for (String attr : Arrays.asList("id", "name", "placeholder", "aria-label", "title", "alt", "class")) {
                    String value = el.getAttribute(attr);
                    if (value != null && value.toLowerCase().contains(loweredKey)) {
                        String newXpath = getXPath(driver, el);
                        System.out.println("Auto-updater: found a candidate by attr '" + attr + "' (" + value + ") -> " + newXpath);
                        LocatorStore.put(key, newXpath);
                        return driver.findElement(By.xpath(newXpath));
                    }
                }
                String text = el.getText();
                if (text != null && text.toLowerCase().contains(loweredKey)) {
                    String newXpath = getXPath(driver, el);
                    System.out.println("Auto-updater: found a candidate by text (" + text + ") -> " + newXpath);
                    LocatorStore.put(key, newXpath);
                    return driver.findElement(By.xpath(newXpath));
                }
            } catch (StaleElementReferenceException sere) {
                // continue searching
            }
        }

        throw new NoSuchElementException("Unable to locate element for key: " + key);
    }

    private String getXPath(WebDriver driver, WebElement element) {
        String script = "function getXPath(el){" +
                "if(el.id!=='')return '//*[@id=\"'+el.id+'\"]';" +
                "var parts=[];while(el&&el.nodeType===1){var idx=1;var sib=el.previousSibling;while(sib){if(sib.nodeType===1&&sib.nodeName===el.nodeName)idx++;sib=sib.previousSibling;}parts.unshift(el.nodeName.toLowerCase()+\"[\"+idx+\"]\");el=el.parentNode;}return '/'+parts.join('/');} return getXPath(arguments[0]);";
        Object res = ((JavascriptExecutor) driver).executeScript(script, element);
        return (res == null) ? null : res.toString();
    }
}