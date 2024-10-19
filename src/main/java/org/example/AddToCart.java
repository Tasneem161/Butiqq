package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
    WebDriver driver;

    public AddToCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "/html/body/div[4]/div/form/div[2]/div[2]/div/div/a/div[2]/div[2]")
    private WebElement clickOnItem;

    @FindBy(xpath = "/html/body/section/div/div[1]/div[2]/div[2]/div/button")
    private WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"cart-modal\"]/div[4]/a[2]")
    private WebElement continueProcess;

    @FindBy(xpath = "/html/body/div[4]/div/div[1]/div[2]/a")
    private WebElement confirmPayment;

    @FindBy(xpath = "//*[@id=\"govern\"]")
    private WebElement getCity;

    @FindBy(xpath = "//*[@id=\"govern\"]/option[2]")
    private WebElement chooseCity;

    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement getCountry;

    @FindBy(xpath = "//*[@id=\"city\"]/option")
    private WebElement chooseCounty;

    @FindBy(xpath = "//*[@id=\"zip_code\"]")
    private WebElement zipCode;

    @FindBy(xpath = "//*[@id=\"address\"]")
    private WebElement getAddress;

    @FindBy(xpath = "//*[@id=\"email\"]")
    private WebElement getEmail;

    @FindBy(xpath = "//*[@id=\"passwordInput-name\"]")
    private WebElement getPassword;

    public WebElement getGetPassword(){
        return getPassword;
    }

    public WebElement getGetEmail(){
        return getEmail;
    }

    public WebElement getGetAddress(){
        return getAddress;
    }
    public WebElement getZipCode(){
        return zipCode;
    }


    public WebElement getChooseCounty(){
        return chooseCounty;
    }



    public WebElement getGetCountry(){
        return getCountry ;
    }


    public WebElement getChooseCity(){
        return chooseCity;
    }

    public WebElement getGetCity(){
        return getCity;
    }

    public WebElement getConfirmPayment(){
        return confirmPayment;
    }
    public WebElement getClickOnItem() {
        return clickOnItem;
    }

    public WebElement getAddToCart(){
        return addToCart;
    }

    public WebElement getContinueProcess(){
        return continueProcess;
    }
}
