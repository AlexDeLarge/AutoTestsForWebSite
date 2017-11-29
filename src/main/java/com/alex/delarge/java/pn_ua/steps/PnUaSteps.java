package com.alex.delarge.java.pn_ua.steps;

import com.alex.delarge.java.pn_ua.core.Helpers;
import com.alex.delarge.java.pn_ua.pages.HomePage;
import com.alex.delarge.java.pn_ua.pages.ItemPage;
import com.alex.delarge.java.pn_ua.pages.PageObject;
import com.alex.delarge.java.pn_ua.pages.SectionPage;
import org.openqa.selenium.WebDriver;

import java.text.MessageFormat;
import java.util.logging.Logger;

public class PnUaSteps {
    private ItemPage itemPage;
    private SectionPage sectionPage;
    private HomePage homePage;
    private PageObject pageObject;
    private static final Logger logger = Logger.getLogger(PnUaSteps.class.getName());

    public PnUaSteps(WebDriver driver) {
        sectionPage = new SectionPage(driver);
        itemPage = new ItemPage(driver);
        homePage = new HomePage(driver);
        pageObject = new PageObject(driver);
/*        logger = Logger.getLogger(PnUaSteps.class.getName());*/
    }

    public PnUaSteps search(String request) {
        Helpers.type(homePage.getRequestInput(), request);
        Helpers.clickOnElement(homePage.getSearchButton());
        return this;
    }

    public PnUaSteps filter(String firstRequest, String secondRequest) {
        Helpers.type(sectionPage.getMinPriceInput(), firstRequest);
        Helpers.type(sectionPage.getMaxPriceInput(), secondRequest);
        Helpers.clickOnElement(sectionPage.getPriceButton());
        return this;
    }

    public PnUaSteps selectProduct() {
        Helpers.clickOnElement(sectionPage.getSelectedItem());
        logger.info(MessageFormat.format("Window with selected product is opened {0}", itemPage.getImageImg().getText()));
        return this;
    }

    public PnUaSteps review() {
        Helpers.clickOnElement(itemPage.getReviewTab());
        logger.info(MessageFormat.format("Review window is opened {0}", itemPage.getReviewTab().getText()));
        return this;
    }

    public PnUaSteps showImage() {
        Helpers.clickOnElement(itemPage.getImageImg());
        logger.info(MessageFormat.format("Image window is opened {0}", itemPage.getImageImg().getText()));
        return this;
    }

    public PnUaSteps login(String email, String password) {
        Helpers.clickOnElement(homePage.getLoginImg());
        Helpers.clickOnElement(homePage.getOpenloginFormButton());
        Helpers.type(homePage.getEmailField(), email);
        Helpers.type(homePage.getPasswordField(), password);
        Helpers.clickOnElement(homePage.getLoginButton());
        return this;
    }

    public PnUaSteps assertThatLoginImageIsDisplayed() {
        Helpers.assertThatElementIsDisplayed(homePage.getLoginImg());
        return this;
    }

    public PnUaSteps assertThatImageIsDisplayed() {
        Helpers.assertThatElementIsDisplayed(itemPage.getImageImg());
        return this;
    }

    public PnUaSteps assertThatReviewTabIsDisplayed() {
        Helpers.assertThatElementIsDisplayed(itemPage.getReviewTab());
        return this;
    }

    public PnUaSteps assertThatSelectedProductIsDisplayed() {
        Helpers.assertThatElementIsDisplayed(sectionPage.getSelectedItem());
        return this;
    }
}
