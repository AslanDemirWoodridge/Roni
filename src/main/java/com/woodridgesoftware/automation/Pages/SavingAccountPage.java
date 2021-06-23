package com.woodridgesoftware.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SavingAccountPage extends BasePage{
    @FindBy(xpath ="(//button[@type='button'])[3]")
    public WebElement Saving_Account_Explorer;

    @FindBy(xpath = "(//h3[@class='wdg-section-2-title ng-binding'])[1]")
    public WebElement TemenosPremierSavings;

    @FindBy(xpath = "(//div[@class='text-display animate-height-if av-optional id-lblProdInfo av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding ng-scope'])[1]")
    public WebElement firstPremierSavingDescription;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[1]")
    public WebElement secondPremierSavingDescription;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[2]")
    public WebElement thirdPremierSavingDescription;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[3]")
    public WebElement fourthPremierSavingDescription;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[4]")
    public WebElement fifthPremierSavingDescription;

    //    ------------------------Second Scenario-----------------------------------------------------

    @FindBy(xpath = "(//h3[@class='wdg-section-2-title ng-binding'])[2]")
    public WebElement CustodialUTMA_Savings_Account;

    @FindBy(xpath = "(//div[@class='text-display animate-height-if av-optional id-lblProdInfo av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding ng-scope'])[2]")
    public WebElement CustodialUTMA_First_Description;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[5]")
    public WebElement CustodialUTMA_Second_Description;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[6]")
    public WebElement CustodialUTMA_Third_Description;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[7]")
    public WebElement CustodialUTMA_Fourth_Description;

    @FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[8]")
    public WebElement CustodialUTMA_Fifth_Description;
}
