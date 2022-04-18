package com.timetracker.auto.page.elements;

import org.openqa.selenium.By;

public interface SortComponentElements {
    By sortTitle = By.cssSelector("label[class='mat-form-field-label ng-tns-c49-16 ng-star-inserted']");
    By sortDefaultOption = By.cssSelector("span[class='ng-tns-c95-17 ng-star-inserted']");
    By sortBlock = By.id("mat-select-5-panel");
    By nameOption = By.cssSelector("mat-option[value='title']");
    By timeOption = By.cssSelector("mat-option[value='date']");
    By priorityOption = By.cssSelector("mat-option[value='priority']");
    By categoryOption = By.cssSelector("mat-option[value='category']");
}
