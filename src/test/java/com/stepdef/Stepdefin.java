package com.stepdef;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.test.Testcase;

import cucumber.api.java.en.*;

public class Stepdefin {
	public static WebDriver driver=Testcase.driver;
	  JavascriptExecutor js = (JavascriptExecutor) driver;
	@Given("^open the amazon$")
	public void open_the_amazon() throws Throwable {
       driver.get("https://www.amazon.in/");
	}

	@When("^open new tab for mobiles$")
	public void open_new_tab_for_mobiles() throws Throwable {
		WebElement mobiles =  driver.findElement(By.xpath("//a[ @class='nav-a  ']"));
		Actions act = new Actions(driver);
		act.contextClick(mobiles).build().perform();
		Robot rot = new Robot();
		rot.keyPress(KeyEvent.VK_DOWN);
		rot.keyPress(KeyEvent.VK_ENTER);
		
		WebElement best =  driver.findElement(By.xpath("(//a[ @class=\"nav-a  \"])[2]"));
	
		act.contextClick(best).build().perform();	
		rot.keyPress(KeyEvent.VK_DOWN);
		rot.keyPress(KeyEvent.VK_ENTER);
		
	   	}

	@Then("^move to homepage$")
	public void move_to_homepage() throws Throwable {
	 Set<String> windowHandles = driver.getWindowHandles();
	 for (String allwindowstitle : windowHandles) {
			String window = driver.switchTo().window(allwindowstitle).getTitle();
			System.out.println(window);
		}
		  String actual="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in" ; 
		  		 for (String allwindows : windowHandles) { 
		  			 if (driver.switchTo().window(allwindows).getTitle().equalsIgnoreCase(actual))  { 
		  			 break; 
		  		 }
		  		 }
		 
	}

	@Given("^scroll down and select the laptop$")
	public void scroll_down_and_select_the_laptop() throws Throwable {
		
		  WebElement echo = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/AMS/IN/970X250-_desktop_banner.jpg']"));
		  echo.click();
		  boolean selected = echo.isSelected();
		  System.out.println(selected);
		 
		// WebDriverWait wait = new WebDriverWait(driver,30);
		//wait.until(ExpectedConditions.visibilityOf(echo));
		
		  
	
		
		  js.executeScript("arguments[0].scrollIntoView();", echo);
		  echo.click();
		 
	}

	@Then("^click the buy$")
	public void click_the_buy() throws Throwable {
	   
	}
}
