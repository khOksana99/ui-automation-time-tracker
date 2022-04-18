package com.timetracker.auto.page.elements;

import org.openqa.selenium.By;

public interface FilterByPriorityComponentElements {
    By filterByPriorityTitle = By.partialLinkText("Filter by priority");
    By filterByPriorityBlock = By.id("mat-select-4-panel");
    By allPrioritiesOption = By.xpath("//span[text()='All priorities']");
}
