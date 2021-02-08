package com.game.platform;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.BuyingGameFormModel;

public class BuyGameSteps {
	
	private BuyingGameFormModel buyingGameForm = new BuyingGameFormModel();
	
	@Given("^Отваря формичка за каталога с игри\\.$")
	public void openForm() throws Throwable {
		buyingGameForm.showForm();
	}

	@When("^Натиска на Buy бутон на някаква игра, се взима самата игра и потребителското име на купувача \"([^\"]*)\"$")
	public void clickOnGameBuy(String arg1) throws Throwable {
		buyingGameForm.buyGame(arg1);
	}


	@Then("^Вижда съобщение \"([^\"]*)\"\\.$")
	public void showMessage(String arg1) throws Throwable {
	    buyingGameForm.getMessage();
	}

}
