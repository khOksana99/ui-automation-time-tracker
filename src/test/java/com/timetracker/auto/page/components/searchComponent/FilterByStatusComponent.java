package com.timetracker.auto.page.components.searchComponent;

import com.codeborne.selenide.Condition;
import com.timetracker.auto.page.elements.FilterByStatusComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FilterByStatusComponent implements FilterByStatusComponentElements {
    public FilterByStatusComponent verifyStaticCheckOfFilterByStatusComponent() {
        verifyFilterByStatusTitle();
        verifyFilterByStatusBlock();
        return this;
    }
    private FilterByStatusComponent verifyFilterByStatusTitle() {
        assertThat(filterByStatusTitleNotDisplayed, $(filterByStatusTitle).isDisplayed());
        assertThat(filterByStatusTitleNotCorrect, $(filterByStatusTitle).text(), equalTo(filterByStatusTitle));
        return this;
    }

    private FilterByStatusComponent verifyFilterByStatusBlock() {
        $(filterByStatusTitle).click();
        $(filterByStatusBlock).shouldBe(Condition.visible);
        assertThat(filterByStatusBlockNotDisplayed, $(filterByStatusBlock).isDisplayed());
        assertThat(allStatusesOptionNotDisplayed, $(allStatusesOption).isDisplayed());
        assertThat(allStatusesOptionNotCorrect, $(allStatusesOption).text(), equalTo(allStatusesOption));
        assertThat(doneTasksOptionNotDisplayed, $(doneTasksOption).isDisplayed());
        assertThat(doneTasksOptionNotCorrect, $(doneTasksOption).text(), equalTo(doneTasksOption));
        assertThat(uncompletedTasksOptionNotDisplayed, $(uncompletedTasksOption).isDisplayed());
        assertThat(uncompletedTasksOptionNotCorrect, $(uncompletedTasksOption).text(), equalTo(uncompletedTasksOption));
        return this;
    }
}
