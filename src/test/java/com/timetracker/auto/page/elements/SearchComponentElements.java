package com.timetracker.auto.page.elements;

import org.openqa.selenium.By;

public interface SearchComponentElements {
    By nameInput = By.cssSelector("input[class='mat-input-element mat-form-field-autofill-control ng-tns-c49-11 cdk-text-field-autofill-monitored ng-pristine ng-valid ng-touched']");
    By searchBtn = By.cssSelector("button[class='mat-focus-indicator mat-raised-button mat-button-base mat-accent search-button blink-button']");
    By clearBtn = By.cssSelector("button[class='mat-focus-indicator mat-button mat-button-base']");
    By hideSearchOption = By.xpath("//span[text()='Hide search']");
    By showSearchOption = By.xpath("//span[text()='Show search']");
}
