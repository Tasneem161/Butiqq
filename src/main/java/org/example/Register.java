package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Register {
    WebDriver driver;


    public Register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"icon\"]/div/a[1]/i")
    private WebElement loginMenu;

    @FindBy(xpath = "/html/body/section/div/div/div/div[3]/a")
    private WebElement registerMenu;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement enterEmail;

    @FindBy(xpath = "//*[@id=\"phone\"]")
    private WebElement enterPhone;

    @FindBy(xpath = "/html/body/section/div/div/form/div/div[3]/div/div/input")
    private WebElement setName;

    @FindBy(xpath = "//*[@id=\"passwordInput-1\"]")
    private WebElement setPassword;

    @FindBy(xpath = "//*[@id=\"passwordInput-confirmation\"]")
    private WebElement confirmPassword;

    @FindBy(xpath = "//*[@id=\"your_email_1\"]")
    private WebElement clickBirthDay;

    @FindBy(xpath = "//*[@id=\"sign-up\"]/div[7]")
    private WebElement clickRegister;

    public WebElement getClickBirthDay() {
        return clickBirthDay;
    }



    public WebElement confirmPassword(){
        return confirmPassword;
    }

    public WebElement setPassword(){
        return setPassword;
    }
    public WebElement getName() {
        return setName;
    }
    public WebElement setPhone() {
        return enterPhone;
    }

    public WebElement setEmail(){
        return enterEmail;
    }

    public WebElement getRegisterMenu() {
        return registerMenu;
    }

    public WebElement getLoginMenu() {
        return loginMenu;
    }

    public WebElement getClickRegister(){
        return clickRegister;
    }

}