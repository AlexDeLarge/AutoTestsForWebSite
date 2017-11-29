package com.alex.delarge.java.pn_ua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {

    public PageObject(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".logo-city")
    private WebElement cityTab;
    @FindBy(name = "fn")
    private WebElement requestInput;
    @FindBy(xpath = "//form[@id='search']//input[@type='submit']")
    private WebElement searchButton;

    public WebElement getCityTab() {
        return cityTab;
    }

    public WebElement getRequestInput() {
        return requestInput;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
