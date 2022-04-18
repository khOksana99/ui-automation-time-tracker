package com.timetracker.auto.page.components;

import com.timetracker.auto.page.elements.FooterComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class FooterComponent implements FooterComponentElements {
    public FooterComponent verifyStaticCheckOfFooterComponent() {
        verifyOurSiteLink();
        verifyBlogLink();
        verifyAboutApplicationLink();
        verifyFooterTitle();
        return this;
    }

    private FooterComponent verifyOurSiteLink() {
        assertThat(ourSiteLinkNotDisplayed, $(ourSiteLink).isDisplayed());
        return this;
    }

    private FooterComponent verifyBlogLink() {
        assertThat(blogLinkNotDisplayed, $(blogLink).isDisplayed());
        return this;
    }

    private FooterComponent verifyAboutApplicationLink() {
        assertThat(aboutApplicationLinkNotDisplayed, $(aboutApplicationLink).isDisplayed());
        return this;
    }

    private FooterComponent verifyFooterTitle() {
        assertThat(footerTitleNotDisplayed, $(footerTitle).isDisplayed());
        assertThat(footerTitleNotCorrect, $(footerTitle).text(), equalTo(footerTitle));
        return this;
    }
}
