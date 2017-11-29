package com.alex.delarge.java.pn_ua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SectionPage extends PageObject {

    @FindBy(id = "price-min")
    private WebElement minPriceInput;
    @FindBy(id = "price-max")
    private WebElement maxPriceInput;
    @FindBy(id = "pricebutton")
    private WebElement priceButton;
    @FindBy(css = ".catalog-block-head>a:first-child")
    private WebElement selectedItem;

    public SectionPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getMinPriceInput() {
        return minPriceInput;
    }

    public WebElement getMaxPriceInput() {
        return maxPriceInput;
    }

    public WebElement getPriceButton() {
        return priceButton;
    }

    public WebElement getSelectedItem() {
        return selectedItem;
    }
}
