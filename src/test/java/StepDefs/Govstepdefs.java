package StepDefs;

import Pages.Govpage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Govstepdefs {
    Govpage page = new Govpage();

    @Given("^I am on Gov\\.Uk homepage$")
    public void i_am_on_Gov_Uk_homepage() throws Throwable {
        page.openhomepage();
    }

    @When("^I click business and self employed$")
    public void i_click_business_and_self_employed() throws Throwable {
        page.businessandselfemployed();

    }

    @When("^I click Business tax$")
    public void i_click_Business_tax() throws Throwable {
        page.businesstax();

    }

    @When("^I click company tax returns$")
    public void i_click_company_tax_returns() throws Throwable {
        page.companytaxreturns();

    }

    @When("^I click Penalties for late filing$")
    public void i_click_Penalties_for_late_filing() throws Throwable {
        page.penaltiesforlatefiling();

    }

    @Then("^I should see company tax returns page$")
    public void i_should_see_company_tax_returns_page() throws Throwable {
        page.verifycompanytaxreturns();

    }
}
