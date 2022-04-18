package com.timetracker.auto.page.elements;

import org.openqa.selenium.By;

public interface FooterComponentElements {
    By ourSiteLink = By.partialLinkText("Our site");
    By aboutApplicationLink = By.partialLinkText("About application");
    By blogLink = By.partialLinkText("Blog");
    By footerTitle = By.cssSelector("div[class='copyright float-right']");
}
