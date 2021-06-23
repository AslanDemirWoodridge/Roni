package com.woodridgesoftware.automation.StepDefs;

import com.woodridgesoftware.automation.Pages.SavingAccountPage;
import com.woodridgesoftware.automation.Utils.BrowserUtils;
import com.woodridgesoftware.automation.Utils.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class SavingAccountStepDef {
    SavingAccountPage savingAccountPage = new SavingAccountPage();

    @When("the user clicks on the WS_ProductSelector page Savings accounts explore button")
    public void the_user_clicks_on_the_ws_product_selector_page_savings_accounts_explore_button() {
        BrowserUtils.wait(2);
        savingAccountPage.Saving_Account_Explorer.click();
    }

    @Then("{string} is the first product displayed")
    public void is_the_first_product_displayed(String string) {
        String ExpectedResult ="Temenos premier savings";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.TemenosPremierSavings.isDisplayed());
        BrowserUtils.wait(2);
        // Driver.closeDriver();
    }

    @Then("the first product description for the Temenos Savings accounts states {string}")
    public void the_first_product_description_for_the_temenos_savings_accounts_states(String string) {
        String ExpectedResult ="Get a head start on your future by starting to save today";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.firstPremierSavingDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the second product description for the Temenos Savings accounts states {string}")
    public void the_second_product_description_for_the_temenos_savings_accounts_states(String string) {
        String ExpectedResult ="Mobile Check Deposits";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.secondPremierSavingDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the third product description for the Temenos Savings accounts states {string}")
    public void the_third_product_description_for_the_temenos_savings_accounts_states(String string) {
        String ExpectedResult = "Automatic Transfers";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.thirdPremierSavingDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the fourth product description for the Temenos Savings accounts states {string}")
    public void the_fourth_product_description_for_the_temenos_savings_accounts_states(String string) {
        String ExpectedResult ="Overdraft Protection";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.fourthPremierSavingDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the fifth product description for the Temenos Savings accounts states {string}")
    public void the_fifth_product_description_for_the_temenos_savings_accounts_states(String string) {
        String ExpectedResult ="FDIC Insured upto $250,000";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.fifthPremierSavingDescription.isDisplayed());
        BrowserUtils.wait(2);
        Driver.closeDriver();
    }

    //    ------------------------Second Scenario-----------------------------------------------------

    @Then("{string} is the second product displayed")
    public void is_the_second_product_displayed(String string) {
        String ExpectedResult = "Custodial (UTMA) Savings Account";
        BrowserUtils.wait(2);
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver(); jse.executeScript("window.scrollBy(0,250)", "");

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.CustodialUTMA_Savings_Account.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }

    @Then("the first product description for the Custodial \\(UTMA) Savings Account states {string}")
    public void the_first_product_description_for_the_custodial_utma_savings_account_states(String string) {
        String ExpectedResult ="Save for later. Deposit funds into a savings account as a gift for when a child reaches maturity";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.CustodialUTMA_First_Description.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the second product description for the Custodial \\(UTMA) Savings Account states {string}")
    public void the_second_product_description_for_the_custodial_utma_savings_account_states(String string) {
        String ExpectedResult ="  $8/month. No fee if account owner is under the age of 18";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.CustodialUTMA_Second_Description.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the third product description for the Custodial \\(UTMA) Savings Account states {string}")
    public void the_third_product_description_for_the_custodial_utma_savings_account_states(String string) {
        String ExpectedResult = "Free 6 transfers and withdrawals each monthly statement cycle";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.CustodialUTMA_Third_Description.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }
    @Then("the fourth product description for the Custodial \\(UTMA) Savings Account states {string}")
    public void the_fourth_product_description_for_the_custodial_utma_savings_account_states(String string) {
        String ExpectedResult = "Automatic Transfers";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.CustodialUTMA_Fourth_Description.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the fifth product description for the Custodial \\(UTMA) Savings Account states {string}")
    public void the_fifth_product_description_for_the_custodial_utma_savings_account_states(String string) {
        String ExpectedResult ="FDIC Insured";

        Assert.assertTrue("ExpectedResult is not found", savingAccountPage.CustodialUTMA_Fifth_Description.isDisplayed());
        BrowserUtils.wait(2);
        Driver.closeDriver();
    }


}
