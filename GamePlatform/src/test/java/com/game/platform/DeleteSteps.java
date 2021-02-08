package com.game.platform;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.DeleteFormModel;

public class DeleteSteps {

	DeleteFormModel deleteForm = new DeleteFormModel();

	@Given("^Отваря формичка за триене от системата$")
	public void openForm() throws Throwable {
		deleteForm.showDeleteForm();
	}

	@When("^Въвежда потребителско име за триене \"([^\"]*)\"$")
	public void addUsername(String arg1) throws Throwable {
		deleteForm.addUsername(arg1);
	}

	@When("^Натиска бутона Delete$")
	public void clickDeleteButton() throws Throwable {
		deleteForm.clickButton();
	}

	@Then("^Вижда съобщение за успешно изтриване \"([^\"]*)\"\\.$")
	public void showMessage(String arg1) throws Throwable {
		deleteForm.showMessage();
	}
}
