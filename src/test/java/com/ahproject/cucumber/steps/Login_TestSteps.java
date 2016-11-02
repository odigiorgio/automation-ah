package com.ahproject.cucumber.steps;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_TestSteps {

	private static WebDriver driver = null;
	
	// -------------------------------------------------------------------------------
	// Scenario Successful Login with Valid Credentials
	// -------------------------------------------------------------------------------
	@Given("^User is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
		
		// Create a new instance of the Firefox driver 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        driver.get("http://www.store.demoqa.com");
        
	    throw new PendingException();
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	
		// Find the element that's ID attribute is 'account'(My Account) 
        driver.findElement(By.xpath(".//*[@id='account']/a")).click();
        //driver.findElement(By.id("account")).click();
	    throw new PendingException();
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() throws Throwable {

		// Enter Username
        driver.findElement(By.id("log")).sendKeys("odg"); 
 
        // Enter Password
        driver.findElement(By.id("pwd")).sendKeys("acpqualife");
 
        // Now submit the form. WebDriver will find the form for us from the element 
        driver.findElement(By.id("login")).click();
        
	    throw new PendingException();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws Throwable {
		
		// Print a Log In message to the screen
        System.out.println("Login Successfully");
        
	    throw new PendingException();
	}

	// -------------------------------------------------------------------------------
	// Scenario Successful LogOut
	// -------------------------------------------------------------------------------
	@Given("^User is on Main Page$")
	public void user_is_on_Main_Page() throws Throwable {
        
	    throw new PendingException();
	}
	
	@When("User LogOut from the Application")
	public void user_LogOut_from_the_Application() throws Throwable {
	    
		// Click 'account_logout' (Log Out)
        //driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
        driver.findElement(By.id("account_logout")).click();
		
	    throw new PendingException();
	}

	@Then("Message displayed LogOut Successfully")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    
		// Print a Log In message to the screen 
        System.out.println("LogOut Successfully");
        
        // Close the driver
        driver.quit();
        
	    throw new PendingException();
	}

}
