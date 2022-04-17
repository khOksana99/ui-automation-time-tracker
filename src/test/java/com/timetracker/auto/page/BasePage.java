package com.timetracker.auto.page;

import com.timetracker.auto.util.Utils;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    public BasePage openBasePage() {
        open(Utils.getPROPS().UI_BASE_URL());
        return this;
    }
}
