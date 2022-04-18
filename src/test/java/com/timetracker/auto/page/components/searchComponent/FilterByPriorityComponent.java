package com.timetracker.auto.page.components.searchComponent;

import com.codeborne.selenide.Condition;
import com.timetracker.auto.page.elements.FilterByPriorityComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FilterByPriorityComponent implements FilterByPriorityComponentElements {
    public FilterByPriorityComponent verifyStaticCheckOfFilterByPriorityComponent() {
        verifyFilterByStatusTitle();
        verifyFilterByStatusBlock();
        return this;
    }
    private FilterByPriorityComponent verifyFilterByStatusTitle() {
        assertThat(filterByPriorityTitleNotDisplayed, $(filterByPriorityTitle).isDisplayed());
        assertThat(filterByPriorityTitleNotCorrect, $(filterByPriorityTitle).text(), equalTo(filterByPriorityTitle));
        return this;
    }

    private FilterByPriorityComponent verifyFilterByStatusBlock() {
        $(filterByPriorityTitle).click();
        $(filterByPriorityBlock).shouldBe(Condition.visible);
        assertThat(filterByStatusBlockNotDisplayed, $(filterByPriorityBlock).isDisplayed());
        assertThat(allPrioritiesOptionNotDisplayed, $(allPrioritiesOption).isDisplayed());
        assertThat(allPrioritiesOptionNotCorrect, $(allPrioritiesOption).text(), equalTo(allPrioritiesOption));
        return this;
    }
}
