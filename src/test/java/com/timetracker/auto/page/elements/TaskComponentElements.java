package com.timetracker.auto.page.elements;

import org.openqa.selenium.By;

public interface TaskComponentElements {
    By addTaskBtn = By.cssSelector("button[class='mat-focus-indicator mat-raised-button mat-button-base mat-primary full-width']");
    By taskFoundCount = By.cssSelector("span[class='founded']");
}
