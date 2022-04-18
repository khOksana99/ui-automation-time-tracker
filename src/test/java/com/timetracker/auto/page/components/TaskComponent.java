package com.timetracker.auto.page.components;

import com.timetracker.auto.page.elements.TaskComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.addTaskBtnBotDisplayed;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaskComponent implements TaskComponentElements {
    public TaskComponent verifyStaticCheckOfTaskComponent() {
        verifyAddTaskComponent();
        return this;
    }

    private TaskComponent verifyAddTaskComponent() {
        assertThat(addTaskBtnBotDisplayed, $(addTaskBtn).isDisplayed());
        return this;
    }
}
