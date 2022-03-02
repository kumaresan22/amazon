package com.test;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import com.base.Baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\amazon.feature",glue="com\\stepdef")
public class Testcase {

	
	public static WebDriver driver;
	@BeforeClass
	public static void setupp() {
	
       driver = Baseclass.getbrower("chrome");
	
		
		
	}
	
}
