package com.timetracker.auto.tests;

import org.testng.annotations.Test;

public class StaticCheckTest extends BaseTest {
    @Test(description = "Static check of page")
    public void verifyStaticCheckOfPageTest() {
        basePage.openBasePage()
                .staticCheckOfPage();
    }
}
