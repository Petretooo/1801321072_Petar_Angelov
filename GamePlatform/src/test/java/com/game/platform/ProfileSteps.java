package com.game.platform;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.ProfileFormModel;

public class ProfileSteps {
	
	ProfileFormModel profileForm = new ProfileFormModel();
	
	@Given("^Отваря формичка с търсачка$")
	public void openForm() throws Throwable {
		profileForm.showProfileForm();
	}

	@When("^Въвежда потребителско име в търсачката \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
	    profileForm.addUsername(arg1);
	}

	@When("^Натиска върху бутона за да покажи потребил в системата\\.$")
	public void clickSearchButton() throws Throwable {
	    profileForm.clickSearchButton();
	}

	@Then("^Вижда информацията за себе си\\.$")
	public void showMessage() throws Throwable {
		profileForm.getMessage();
	}
}
