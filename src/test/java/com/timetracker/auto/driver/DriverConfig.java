package com.timetracker.auto.driver;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Browsers.CHROME;

public class DriverConfig {
    public static void initializeDriver() {
        Configuration.timeout = 15000;
        Configuration.pageLoadTimeout = 15000;
        Configuration.browser = CHROME;
        Configuration.startMaximized = true;
        Configuration.proxyEnabled = true;
    }
}
