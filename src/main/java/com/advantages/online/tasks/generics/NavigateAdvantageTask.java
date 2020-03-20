package com.advantages.online.tasks.generics;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.advantages.online.userinterfaces.RegisterAdvantagePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class NavigateAdvantageTask implements Task{

	RegisterAdvantagePage registerAdvantagePage;

	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(OpenTheBrowserTask.openURL(registerAdvantagePage));
	}
	
	public static NavigateAdvantageTask intoHome() {
		return instrumented(NavigateAdvantageTask.class);
	}

}
