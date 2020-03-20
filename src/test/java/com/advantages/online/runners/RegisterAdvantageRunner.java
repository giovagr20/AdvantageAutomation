package com.advantages.online.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
features = {"src/test/resources/features/register_advantage.feature" },
glue = "com.advantages.online.stepdefinitions", 
snippets = SnippetType.CAMELCASE)
public class RegisterAdvantageRunner {}