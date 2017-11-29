package com.alex.delarge.java.pn_ua.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageObject {

    @FindBy(css = ".icon.icon-7_2")
    private WebElement loginImg;
    @FindBy(css = "#userSettings>li>a[onclick^='showLoginForm']")
    private WebElement openloginFormButton;
    @FindBy(id = "login-form-login")
    private WebElement emailField;
    @FindBy(id = "login-form-password")
    private WebElement passwordField;
    @FindBy(id = "loginButton")
    private WebElement loginButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLoginImg() {
        return loginImg;
    }

    public WebElement getOpenloginFormButton() {
        return openloginFormButton;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }
}
