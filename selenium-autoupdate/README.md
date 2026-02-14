# selenium-autoupdate

Sample Maven project that demonstrates runtime auto-update of flaky XPath locators to reduce test failures.

Quick start

- mvn -DskipTests=false test

Notes

- Uses WebDriverManager to auto-download the Chrome driver.
- Uses TestNG as the test framework and Page Object Model (POM) for locators. Default locators live in page classes; the auto-updater will persist improved XPaths to `locator-store.json` for future runs.
- The test runs headless by default. Remove the headless args in `E2ETest` if you want to see the browser.