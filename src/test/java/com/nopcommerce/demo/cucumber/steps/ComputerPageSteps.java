package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import cucumber.api.java.en.Then;

public class ComputerPageSteps {
    @Then("^I navigated computer page successfully$")
    public void iNavigatedComputerPageSuccessfully() {
        new ComputerPage().verifyComputerPage("Computers");
    }

    @Then("^I click on desktop$")
    public void iClickOnDesktop() {
        new ComputerPage().clickOnDesktop();
    }
}
