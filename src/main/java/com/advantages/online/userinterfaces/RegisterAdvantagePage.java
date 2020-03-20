package com.advantages.online.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterAdvantagePage extends PageObject{
	
	public static final Target BTN_SIGN = Target.the("BTN_SIGN").located(By.id("menuUserLink"));
	public static final Target BTN_CREATE = Target.the("BTN_CREATE")
			.located(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));	
}
