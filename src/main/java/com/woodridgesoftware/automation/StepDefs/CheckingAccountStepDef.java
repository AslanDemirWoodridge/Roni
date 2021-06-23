package com.woodridgesoftware.automation.StepDefs;

import com.woodridgesoftware.automation.Pages.CheckingAccountPage;
import com.woodridgesoftware.automation.Utils.BrowserUtils;
import com.woodridgesoftware.automation.Utils.ConfigurationReader;
import com.woodridgesoftware.automation.Utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

public class CheckingAccountStepDef {
    CheckingAccountPage checkingAccountPage = new CheckingAccountPage();

    @Given("^I am on the WS_ProductSelectorPO page$")
    public void i_am_on_the_WS_ProductSelectorPO_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(1);
        BrowserUtils.wait(2);
    }

    @When("^the user clicks on the WS_ProductSelector page Checking accounts explore button$")
    public void the_user_clicks_on_the_WS_ProductSelector_page_Checking_accounts_explore_button() {

        checkingAccountPage.Checking_Account_Explorer.click();
    }


    @Then("{string} is the first product displayed to the user")
    public void is_the_first_product_displayed_to_the_user(String string) {


        Assert.assertTrue("Dashboard is not found", checkingAccountPage.TemenosPremierChecking.isDisplayed());
        BrowserUtils.wait(2);
         //Driver.closeDriver();
    }

    @Then("the first product description for the Temenos premier checking product states {string}")
    public void the_first_product_description_for_the_temenos_premier_checking_product_states(String string) {
        String ExpectedResult = "A good choice if you want to avoid overdraft fees and don't write checks.";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.firstPremierDescription.isDisplayed());
        BrowserUtils.wait(2);
        //Driver.closeDriver();
    }

    @Then("the second product description for the Temenos premier checking product states {string}")
    public void the_second_product_description_for_the_temenos_premier_checking_product_states(String string) {

        String ExpectedResult = "Get help spending only the money you have available";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.secondPremierDescription.isDisplayed());
        BrowserUtils.wait(2);
        //Driver.closeDriver();
    }

    @Then("the third product description for the Temenos premier checking product states {string}")
    public void the_third_product_description_for_the_temenos_premier_checking_product_states(String string) {

        String ExpectedResult = "Pay with a debit card, Zelle®, Mobile or Online banking - no paper checks available";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.thirdPremierDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the fourth product description for the Temenos premier checking product states {string}")
    public void the_fourth_product_description_for_the_temenos_premier_checking_product_states(String string) {

        String ExpectedResult = "No overdraft fees";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.fourthPremierDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the fifth product description for the Temenos premier checking product states {string}")
    public void the_fifth_product_description_for_the_temenos_premier_checking_product_states(String string) {
        String ExpectedResult = "No monthly fee for eligible students";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.fifthPremierDescription.isDisplayed());
        BrowserUtils.wait(2);
        Driver.closeDriver();
    }
//    ------------------------Second Scenario-----------------------------------------------------

    @Then("{string} is the second product displayed to the user")
    public void is_the_second_product_displayed_to_the_user(String string) {
        String ExpectedResult =  "Temenos basic checking";
        BrowserUtils.wait(3);
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver(); jse.executeScript("window.scrollBy(0,300)", "");

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.TemenosBasicChecking.isDisplayed());
        BrowserUtils.wait(2);
        // Driver.closeDriver();
    }

    @Then("the first product description for the Temenos basic checking product states {string}")
    public void the_first_product_description_for_the_temenos_basic_checking_product_states(String string) {
        String ExpectedResult =  "The best basic checking account available.";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.firstBasicDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the second product description for the Temenos basic checking product states {string}")
    public void the_second_product_description_for_the_temenos_basic_checking_product_states(String string) {
        String ExpectedResult = "Easy setup and no savings account required!";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.secondBasicDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the third product description for the Temenos basic checking product states {string}")
    public void the_third_product_description_for_the_temenos_basic_checking_product_states(String string) {
        String ExpectedResult = "Pay with a debit card, Zelle®, Mobile or Online banking - no paper checks available";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.thirdBasicDescription.isDisplayed() );
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the fourth product description for the Temenos basic checking product states {string}")
    public void the_fourth_product_description_for_the_temenos_basic_checking_product_states(String string) {
        String ExpectedResult =  "No monthly fees for anyone";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.fourthBasicDescription.isDisplayed());
        BrowserUtils.wait(2);
        Driver.closeDriver();
    }
//    ------------------------Third Scenario-----------------------------------------------------

    @Then("{string} is the third product displayed to the user")
    public void is_the_third_product_displayed_to_the_user(String string) {
        String ExpectedResult =  "Advantage plus banking";
        BrowserUtils.wait(2);
        JavascriptExecutor jse = (JavascriptExecutor)Driver.getDriver(); jse.executeScript("window.scrollBy(0,1250)", "");

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.AdvantagePlusBanking.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }

    @Then("the first product description for the Advantage plus banking states {string}")
    public void the_first_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult ="A good choice if you use direct deposit and want a straightforward banking account";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.firstAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }

    @Then("the second product description for the Advantage plus banking states {string}")
    public void the_second_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult ="Choose from multiple ways to waive the monthly fee";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.secondAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }
    @Then("the third product description for the Advantage plus banking states {string}")
    public void the_third_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult ="Pay with a debit card, Zelle®, Mobile or Online banking - no paper checks";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.thirdAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the fourth product description for the Advantage plus banking states {string}")
    public void the_fourth_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult =" Add optional Overdraft Protection";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.fourthAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }
    @Then("the fifth product description for the Advantage plus banking states {string}")
    public void the_fifth_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult =" No monthly fee for eligible students";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.fifthAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the sixth product description for the Advantage plus banking states {string}")
    public void the_sixth_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult =" Advantage Relationship Banking";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.sixthAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }
    @Then("the seventh product description for the Advantage plus banking states {string}")
    public void the_seventh_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult =" A good choice if you keep higher balances and want multiple accounts and complimentary services";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.seventhAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the eight product description for the Advantage plus banking states {string}")
    public void the_eight_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult ="   Earn interest on your balance";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.eighthAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
      //  Driver.closeDriver();
    }
    @Then("the nineth product description for the Advantage plus banking states {string}")
    public void the_nineth_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult =" Get fee waivers on select services";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.ninethAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
       // Driver.closeDriver();
    }
    @Then("the tenth product description for the Advantage plus banking states {string}")
    public void the_tenth_product_description_for_the_advantage_plus_banking_states(String string) {
        String ExpectedResult ="   Add optional Overdraft Protection";

        Assert.assertTrue("ExpectedResult is not found", checkingAccountPage.tenthAdvantagePlusDescription.isDisplayed());
        BrowserUtils.wait(2);
        Driver.closeDriver();
    }

}


