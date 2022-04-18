package com.timetracker.auto.page.components;

import com.timetracker.auto.page.elements.CategoryComponentElements;

import static com.codeborne.selenide.Selenide.$;
import static com.timetracker.auto.constants.AssertionMessages.*;
import static com.timetracker.auto.constants.PageConstants.categoriesTitle;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CategoryComponent implements CategoryComponentElements {
    public CategoryComponent verifyStaticCheckOfCategoryComponent() {
        verifyCategoriesTitle();
        verifyAddCategoryBtn();
        verifySearchCategory();
        return this;
    }

    private CategoryComponent verifyCategoriesTitle() {
        assertThat(categoriesTitleNotDisplayed, $(categoriesBlockTitle).isDisplayed());
        assertThat(categoriesTitleNotCorrect, $(categoriesBlockTitle).text(), equalTo(categoriesTitle));
        return this;
    }

    private CategoryComponent verifyAddCategoryBtn() {
        assertThat(addCategoryBtnNotDisplayed, $(addCategoryBtn).isDisplayed());
        return this;
    }

    private CategoryComponent verifySearchCategory() {
        assertThat(searchCategoryInputNotDisplayed, $(searchCategoryInput).isDisplayed());
        assertThat(searchCategorySearchBtnNotDisplayed, $(searchCategoryBtn).isDisplayed());
        assertThat(searchCategorySearchCloseNotDisplayed, $(cleanSearchCategoryBtn).isDisplayed());
        return this;
    }
}
