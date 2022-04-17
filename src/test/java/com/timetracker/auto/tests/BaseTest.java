package com.timetracker.auto.tests;

import com.codeborne.selenide.Selenide;
import com.timetracker.auto.driver.DriverConfig;
import com.timetracker.auto.page.BasePage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected BasePage basePage;

    @BeforeClass(alwaysRun = true)
    public void driverSetUo() {
        DriverConfig.initializeDriver();
        basePage = new BasePage();
    }

    @AfterClass(alwaysRun = true)
    public void driverTearDown() {
        Selenide.closeWebDriver();
    }
}
