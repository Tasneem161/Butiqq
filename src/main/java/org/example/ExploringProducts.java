package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExploringProducts {
    WebDriver driver;

    public ExploringProducts(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"navbarNav1\"]/ul/li[1]/a")
    private WebElement buttonNew;

    @FindBy(xpath = "//*[@id=\"navbarNav1\"]/ul/li[1]/div/div/div/div/div/a[1]")
    private WebElement clickOnItem;

    @FindBy(xpath = "//*[@id=\"category1\"]")
    private WebElement selectItems;

    @FindBy(xpath = "/html/body/div[2]/div/nav[1]/div[2]/div/div[2]/div/input")
    private WebElement search;

    @FindBy(xpath = "/html/body/div[2]/div/nav[1]/div[2]/div/div[2]/div/a/i")
    private WebElement clickOnSearch;

    @FindBy(xpath = "//*[@id=\"swiper-wrapper-e0e4451a74388cc9\"]/div[1]/img")
    private WebElement searchResultsElement;

    public WebElement hoverButton() {
        return buttonNew;
    }

    public WebElement getClickOnItem(){
        return clickOnItem;
    }

    public WebElement getSelectItems(){
        return selectItems;
    }

    public WebElement getSearch(){
        return search;
    }

    public WebElement getClickOnSearch(){
        return clickOnSearch;
    }


    public WebElement getSearchResultsElement() {
        return searchResultsElement;
    }
}


