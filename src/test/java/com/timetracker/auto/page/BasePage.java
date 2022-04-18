package com.timetracker.auto.page;

import com.timetracker.auto.page.components.CategoryComponent;
import com.timetracker.auto.page.components.FooterComponent;
import com.timetracker.auto.page.components.SearchComponent;
import com.timetracker.auto.page.components.TaskComponent;
import com.timetracker.auto.util.Utils;

import static com.codeborne.selenide.Selenide.open;

public class BasePage {
    private final FooterComponent footerComponent;
    private final CategoryComponent categoryComponent;
    private final SearchComponent searchComponent;
    private final TaskComponent taskComponent;

    public BasePage() {
        footerComponent = new FooterComponent();
        categoryComponent = new CategoryComponent();
        searchComponent = new SearchComponent();
        taskComponent = new TaskComponent();
    }

    public BasePage openBasePage() {
        open(Utils.getPROPS().UI_BASE_URL());
        return this;
    }

    public BasePage staticCheckOfPage() {
        footerComponent.verifyStaticCheckOfFooterComponent();
        categoryComponent.verifyStaticCheckOfCategoryComponent();
        searchComponent.verifyStaticCheckOfSearchComponent();
        taskComponent.verifyStaticCheckOfTaskComponent();
        return this;
    }
}
