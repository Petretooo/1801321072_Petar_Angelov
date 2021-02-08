package com.game.platform;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.UpdateFormModel;

public class UpdateSteps {
	
	UpdateFormModel updateForm = new UpdateFormModel();
	
	@Given("^Отваря формичката за ъпдейт на потребителя\\.$")
	public void openForm() throws Throwable {
	    updateForm.showUpdateForm();
	}

	@When("^Обновява потребителско име \"([^\"]*)\"$")
	public void updateUsername(String arg1) throws Throwable {
	    updateForm.addUsername(arg1);
	}

	@When("^Обновява парола \"([^\"]*)\"$")
	public void updatePassword(String arg1) throws Throwable {
	    updateForm.addPassword(arg1);
	}

	@When("^Обновява имейл \"([^\"]*)\"$")
	public void updateEmail(String arg1) throws Throwable {
	    updateForm.addEmail(arg1);
	}

	@When("^Обновява име \"([^\"]*)\"$")
	public void updateFistName(String arg1) throws Throwable {
	    updateForm.addFirstName(arg1);
	}

	@When("^Обновява фамилия \"([^\"]*)\"$")
	public void updateLastName(String arg1) throws Throwable {
	    updateForm.addLastName(arg1);
	}

	@When("^Натиска върху бутона за запазване на промените в системата\\.$")
	public void clickUpdateButton() throws Throwable {
	    updateForm.clickSaveButton();
	}

	@Then("^Вижда, че информацията е обновена успешно \"([^\"]*)\"\\.$")
	public void showMessage(String arg1) throws Throwable {
	    updateForm.getMessage();
	}

}
