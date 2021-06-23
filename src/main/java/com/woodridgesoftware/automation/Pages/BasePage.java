package com.woodridgesoftware.automation.Pages;

import com.woodridgesoftware.automation.Utils.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class  BasePage {
    public BasePage (){
        PageFactory.initElements(Driver.getDriver(),this);
        }


}
