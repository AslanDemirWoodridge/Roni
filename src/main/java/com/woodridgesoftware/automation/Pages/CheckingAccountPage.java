package com.woodridgesoftware.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckingAccountPage extends BasePage{

@FindBy(xpath ="(//button[@type='button'])[2]")
    public WebElement Checking_Account_Explorer;

@FindBy(xpath = "(//h3[@class='wdg-section-2-title ng-binding'])[1]") ////h3[.='Temenos premier checking']
public WebElement TemenosPremierChecking;

//public String getPageTitleText(){
//    return Dashboard.getText();
//}

@FindBy(xpath = "(//div[@class='text-display animate-height-if av-optional id-lblProdInfo av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding ng-scope'])[1]")
public WebElement firstPremierDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[1]")
public WebElement secondPremierDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[2]")
public WebElement thirdPremierDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[3]")
public WebElement fourthPremierDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[4]")
public WebElement fifthPremierDescription;

//    ------------------------Second Scenario-----------------------------------------------------

@FindBy(xpath = "(//h3[@class=\"wdg-section-2-title ng-binding\"])[2]")
    public WebElement TemenosBasicChecking;

@FindBy(xpath = "(//div[.='The best basic checking account available.'])[1]")
    public WebElement firstBasicDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[5]")
    public WebElement secondBasicDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[6]")
    public WebElement thirdBasicDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[7]")
    public WebElement fourthBasicDescription;

//    ------------------------Third Scenario-----------------------------------------------------

@FindBy(xpath = "(//h3[@class=\"wdg-section-2-title ng-binding\"])[3]")
public WebElement AdvantagePlusBanking;

@FindBy(xpath = "(//div[@class='text-display animate-height-if av-optional id-lblProdInfo av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding ng-scope'])[3]")
    public WebElement firstAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[8]")
    public WebElement secondAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[9]")
    public WebElement thirdAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[10]")
    public WebElement fourthAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[11]")
    public WebElement fifthAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[12]")
    public WebElement sixthAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[13]")
    public WebElement seventhAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[14]")
    public WebElement eighthAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[15]")
    public WebElement ninethAdvantagePlusDescription;

@FindBy(xpath = "(//div[@class='text-display av-optional id-txtHighlight av-form-field col-xs-12 col-sm-12 col-md-12 col-lg-12 av-item-container ng-binding'])[16]")
    public WebElement tenthAdvantagePlusDescription;
}