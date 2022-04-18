package com.timetracker.auto.page.elements;
import org.openqa.selenium.By;

public interface FilterByStatusComponentElements {
    By filterByStatusTitle = By.partialLinkText("Filter by status");
    By filterByStatusBlock = By.id("mat-select-3-panel");
    By allStatusesOption = By.xpath("//span[text()='All statuses']");
    By doneTasksOption = By.xpath("//span[text()='Done tasks']");
    By uncompletedTasksOption = By.xpath("//span[text()='Uncompleted tasks']");
}
