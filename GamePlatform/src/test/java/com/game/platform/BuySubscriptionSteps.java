package com.game.platform;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.BuySubscriptionFormModel;

public class BuySubscriptionSteps {
	
	private BuySubscriptionFormModel buySubscriptionFormModel = new BuySubscriptionFormModel();
	
	
	@Given("^Отваря формичка за абонаменти$")
	public void отваря_формичка_за_абонаменти() throws Throwable {
		buySubscriptionFormModel.showFormSubscription();
	}

	@When("^Натиска бутона купи абонамент, се взима абонамента и потребителското име на купувача \"([^\"]*)\"$")
	public void натиска_бутона_купи_абонамент_се_взима_абонамента_и_потребителското_име_на_купувача(String arg1) throws Throwable {
	    buySubscriptionFormModel.buySubscription(arg1);
	}

	@Then("^Вижда съобщение за успешно закупен абонамен \"([^\"]*)\"\\.$")
	public void showMessage(String arg1) throws Throwable {
	    buySubscriptionFormModel.showMessage();
	}
	
	
}
