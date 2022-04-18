package com.timetracker.auto.page.components.searchComponent;

import com.codeborne.selenide.Condition;
import com.timetracker.auto.page.elements.SortComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.*;
import static com.timetracker.auto.constants.PageConstants.defaultSortOption;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SortComponent implements SortComponentElements {
    public SortComponent verifyStaticCheckOfFilterByStatusComponent() {
        verifyFilterByStatusTitle();
        verifyFilterByStatusBlock();
        verifyDefaultSortOption();
        return this;
    }

    private SortComponent verifyFilterByStatusTitle() {
        assertThat(sortTitleNotDisplayed, $(sortTitle).isDisplayed());
        assertThat(sortTitleNotCorrect, $(sortTitle).text(), equalTo(sortTitle));
        return this;
    }

    private SortComponent verifyDefaultSortOption() {
        assertThat(defaultOptionNotDisplayed, $(sortDefaultOption).isDisplayed());
        assertThat(defaultOptionNotCorrect, $(sortDefaultOption).text(), equalTo(defaultSortOption));
        return this;
    }

    private SortComponent verifyFilterByStatusBlock() {
        $(sortDefaultOption).click();
        $(sortBlock).shouldBe(Condition.visible);
        assertThat(filterByStatusBlockNotDisplayed, $(sortBlock).isDisplayed());
        assertThat(nameOptionNotDisplayed, $(nameOption).isDisplayed());
        assertThat(nameOptionNotCorrect, $(nameOption).text(), equalTo(nameOption));
        assertThat(timeOptionNotDisplayed, $(timeOption).isDisplayed());
        assertThat(timeOptionNotCorrect, $(timeOption).text(), equalTo(timeOption));
        assertThat(priorityOptionNotDisplayed, $(priorityOption).isDisplayed());
        assertThat(priorityOptionNotCorrect, $(priorityOption).text(), equalTo(priorityOption));
        assertThat(categoryOptionNotDisplayed, $(categoryOption).isDisplayed());
        assertThat(categoryOptionNotCorrect, $(categoryOption).text(), equalTo(categoryOption));
        return this;
    }
}
