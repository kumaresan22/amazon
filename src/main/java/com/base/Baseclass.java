package com.base;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Baseclass {
public static WebDriver driver;
	public static WebDriver getbrower(String browser) {
		if (browser.equalsIgnoreCase("chrome")  ) {

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUMARESAN\\eclipse-workspace\\amazon\\Driver\\chromedriver.exe");

			 driver = new ChromeDriver();
			driver.manage().window().maximize();
			return driver;
		}
		
		else
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KUMARESAN\\eclipse-workspace\\Cucumber\\Driver\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
		
		
		
	}
	
	public static WebDriver getbrowser(String url) {
		driver.get(url);
		return driver;
		}
	public static  void sendkeys(WebElement element, String value ) {
		element.sendKeys(value);

	}
	
	public static  void click(WebElement element) {
		element.click();
	}
	
	public static void singledrop(WebElement element,String option ,String value) {
       Select s = new Select(element);
       if (option.equalsIgnoreCase("index")) {
    	   int parseInt = Integer.parseInt(value);
    	   s.selectByIndex(parseInt);
	
		
		}else if (option.equalsIgnoreCase("value")) {
			s.selectByValue(value);
	}else if (option.equalsIgnoreCase("text")) {
		s.selectByVisibleText(value);
	}
   
       
	}
	
	public static void clear(WebElement element) {
		element.clear();

	}
	public static  void takescreenshot(String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filename+".png");
		Files.copy(source, destination);
		}
}
