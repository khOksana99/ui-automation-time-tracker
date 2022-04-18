package com.timetracker.auto.page.elements;

import org.openqa.selenium.By;

public interface CategoryComponentElements {
    By categoriesBlockTitle = By.cssSelector("span[class='nav-title']");
    By addCategoryBtn = By.cssSelector("button[class='mat-focus-indicator add-icon mat-icon-button mat-button-base']");
    By searchCategoryInput = By.cssSelector("input[class='mat-input-element mat-form-field-autofill-control ng-tns-c49-0 cdk-text-field-autofill-monitored ng-pristine ng-valid ng-touched']");
    By searchCategoryBtn = By.cssSelector("button[class='mat-focus-indicator mat-button mat-icon-button mat-button-base blink-button ng-tns-c49-0 ng-star-inserted']");
    By cleanSearchCategoryBtn = By.cssSelector("button[aria-label='Clear']");
    By categoryBlock = By.cssSelector("li[class='nav-item category ng-star-inserted']");
    By categoryTitle = By.cssSelector("span[class='category-title']");
    By editCategoryBtn = By.cssSelector("span[class='edit-category-icon-area']");
    By taskCount = By.cssSelector("span[class='uncompleted-count']");
}
