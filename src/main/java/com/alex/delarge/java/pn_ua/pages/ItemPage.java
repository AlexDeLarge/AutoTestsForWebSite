package com.alex.delarge.java.pn_ua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends PageObject {
    @FindBy(xpath = "//div[@class = 'product-img']//img")
    private WebElement imageImg;
    @FindBy(css = ".reviews")
    private WebElement reviewTab;

    public ItemPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getImageImg() {
        return imageImg;
    }

    public WebElement getReviewTab() {
        return reviewTab;
    }
}
