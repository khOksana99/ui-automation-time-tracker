package com.timetracker.auto.page.components;

import com.timetracker.auto.page.components.searchComponent.FilterByPriorityComponent;
import com.timetracker.auto.page.components.searchComponent.FilterByStatusComponent;
import com.timetracker.auto.page.components.searchComponent.SortComponent;
import com.timetracker.auto.page.elements.SearchComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchComponent implements SearchComponentElements {
    private final FilterByPriorityComponent filterByPriorityComponent;
    private final FilterByStatusComponent filterByStatusComponent;
    private final SortComponent sortComponent;

    public SearchComponent() {
        filterByPriorityComponent = new FilterByPriorityComponent();
        filterByStatusComponent = new FilterByStatusComponent();
        sortComponent = new SortComponent();
    }

    public SearchComponent verifyStaticCheckOfSearchComponent() {
        verifyHideSearchOption();
        verifyNameInput();
        verifySearchButton();
        verifyClearButton();
        filterByStatusComponent.verifyStaticCheckOfFilterByStatusComponent();
        filterByPriorityComponent.verifyStaticCheckOfFilterByPriorityComponent();
        sortComponent.verifyStaticCheckOfFilterByStatusComponent();
        return this;
    }

    private SearchComponent verifyHideSearchOption() {
        assertThat(hideSearchOptionNotDisplayed, $(hideSearchOption).isDisplayed());
        return this;
    }

    private SearchComponent verifyNameInput() {
        assertThat(nameInputNotDisplayed, $(nameInput).isDisplayed());
        return this;
    }

    private SearchComponent verifySearchButton() {
        assertThat(searchBtnNotDisplayed, $(searchBtn).isDisplayed());
        return this;
    }

    private SearchComponent verifyClearButton() {
        assertThat(clearBtnNotDisplayed, $(clearBtn).isDisplayed());
        return this;
    }
}
