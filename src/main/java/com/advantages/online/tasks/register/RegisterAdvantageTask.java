package com.advantages.online.tasks.register;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static com.advantages.online.userinterfaces.RegisterAdvantagePage.BTN_CREATE;
import static com.advantages.online.userinterfaces.RegisterAdvantagePage.BTN_SIGN;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class RegisterAdvantageTask implements Task {

	private WebDriver hisBrowser;
	
	public RegisterAdvantageTask(WebDriver hisBrowser) {
		this.hisBrowser = hisBrowser;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(WaitUntil.the(BTN_SIGN, isVisible()),
				Click.on(BTN_SIGN),
				WaitUntil.the(BTN_CREATE, isVisible()),
				Click.on(BTN_CREATE));
	}

	public static RegisterAdvantageTask createAccount(WebDriver hisBrowser) {
		return instrumented(RegisterAdvantageTask.class, hisBrowser);
	}
	
}
