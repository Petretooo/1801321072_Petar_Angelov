package com.game.platform;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.ShowBoughtGamesFormModel;

public class ShowBoughtGamesSteps {
	
	private ShowBoughtGamesFormModel showBoughtGames = new ShowBoughtGamesFormModel();
	
	@Given("^Отваря формичка на потребителя$")
	public void отваря_формичка_на_потребителя() throws Throwable {
	    showBoughtGames.showBoughtGamesForm();
	}

	@When("^Натиска бутона покажи игри и се подава потребителско име \"([^\"]*)\"$")
	public void натиска_бутона_покажи_игри_и_се_подава_потребителско_име(String arg1) throws Throwable {
		showBoughtGames.showGames(arg1);
	}

	@Then("^Вижда списък с игри ако има\\.$")
	public void вижда_списък_с_игри_ако_има() throws Throwable {
		showBoughtGames.showGames();
	}

}
