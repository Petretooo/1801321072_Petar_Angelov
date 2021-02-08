package com.game.platform;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.RegistrationFormModel;

public class RegistrationSteps {
	
	RegistrationFormModel registrationScreen = new RegistrationFormModel();
	
	@Given("^Отваря формичката за регистрация на потребители$")
	public void openRegistrationForm() throws Throwable {
	    registrationScreen.showRegistrationForm();
	}

	@When("^Въвежда потребителско име \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
	    registrationScreen.addUsername(arg1);
	}

	@When("^Въвежда парола \"([^\"]*)\"$")
	public void addPassword(String arg1) throws Throwable {
	    registrationScreen.addPassword(arg1);
	}

	@When("^Въвежда имейл \"([^\"]*)\"$")
	public void addEmail(String arg1) throws Throwable {
	    registrationScreen.addEmail(arg1);
	}

	@When("^Въвежда име \"([^\"]*)\"$")
	public void addFirstName(String arg1) throws Throwable {
	    registrationScreen.addFirstName(arg1);
	}

	@When("^Въвежда фамилия \"([^\"]*)\"$")
	public void addLastName(String arg1) throws Throwable {
	    registrationScreen.addLastName(arg1);
	}

	@When("^Натиска върху бутона за регистрация в системата\\.$")
	public void clickButton() throws Throwable {
	    registrationScreen.clickRegistrationButton();
	}

	@Then("^Виждаме съобщение \"([^\"]*)\"\\.$")
	public void checkRegistrationMessage(String arg1) throws Throwable {
	    assertEquals(arg1, registrationScreen.getMessage());
	}

}
