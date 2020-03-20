package com.advantages.online.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.advantages.online.tasks.generics.NavigateAdvantageTask;
import com.advantages.online.tasks.register.RegisterAdvantageTask;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class RegisterAdvantageStepDefinition {

	@Managed(driver="chrome")
	private WebDriver hisBrowser;
	private Actor userAdvantage = Actor.named("userAdvantage");
	
	@Before
	public void setUp() {
		userAdvantage.can(BrowseTheWeb.with(hisBrowser));
	}
	
	@Given("^User enter in create new account$")
	public void userEnterInCreateNewAccount() {
		userAdvantage.wasAbleTo(NavigateAdvantageTask.intoHome());
		userAdvantage.attemptsTo(RegisterAdvantageTask.createAccount(hisBrowser));
	}


	@When("^User enter data test$")
	public void userEnterDataTest(DataTable dtRegister) {
		int i=1;
		List<List<String>> data = dtRegister.raw();
		while(i < data.size()) {
			
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
			i++;
		}
	}

	@Then("^User click on register$")
	public void userClickOnRegister() {

	}
	
}
