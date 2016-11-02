package com.ahproject.cucumber.steps;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class ContactForm_TestSteps {

	private static WebDriver driver = null;

	@Given("^User navigates to Referty Home Page$")
	public void user_navigates_to_Referty_Home_page() throws Throwable {
		
		// Create a new instance of the Firefox driver 
        driver = new FirefoxDriver();
 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
        driver.get("http://www.referty.fr");
        
	    //throw new PendingException();
	}
	
	@And("User navigates to Contact page")
	public void user_navigates_to_contact_page() throws Throwable {

        driver.findElement(By.id("menu-item-196")).click();

	}

	@When("^User enters First Name, Name, Company and Email$")
	public void user_enters_First_Name_Name_Company_and_Email() throws Throwable {
	    
		// Enter First Name
        driver.findElement(By.name("your-prenom")).sendKeys("OLIVIER"); 
 
        // Enter Name
        driver.findElement(By.name("your-name")).sendKeys("DI GIORGIO");
        
        // Enter Company
        driver.findElement(By.name("text-290")).sendKeys("ACPQUALIFE");
        
        // Enter Email
        driver.findElement(By.name("your-email")).sendKeys("o.digiorgio@acpqualife.com");

	}

	@When("^User does not populate Captcha field$")
	public void user_does_not_populate_Captcha_field() throws Throwable {
	    
		// Enter Captcha
        driver.findElement(By.name("captcha-120")).sendKeys("");

	}

	@When("^User clicks Send button$")
	public void user_clicks_Send_button() throws Throwable {
	    
		// Send button
		driver.findElement(By.cssSelector("input.wpcf7-form-control.wpcf7-submit")).click();
		
	}

	@Then("^Form not send$")
	public void form_not_send() throws Throwable {

	    // throw new PendingException();
	}

	@Then("^Message Erreur de validation$")
	public void message_Erreur_de_validation() throws Throwable {
	    
		String expectedText = "Erreur de validation. Veuillez vérifier les champs et soumettre à nouveau.";
		
		// Get error code text
		String actualText = driver.findElement(By.cssSelector("div.wpcf7-response-output.wpcf7-display-none.wpcf7-validation-errors")).getText();
		System.out.format("Expected text : %n - Actual text %n \n : ", expectedText, actualText );
		
		// Verify error code value
		Assert.assertEquals(expectedText, actualText);
		
	    //throw new PendingException();
	}
	
	@SuppressWarnings("deprecation")
	@Then("^Message Erreur code captcha$")
	public void message_Erreur_de_code_captcha() throws Throwable {
	    
		String expectedText = "Le code entré est incorrect.";
		
		// Get error code text
		String actualText = driver.findElement(By.cssSelector("span.wpcf7-not-valid-tip")).getText();
		System.out.format("Expected text : %n - Actual text %n \n : ", expectedText, actualText );
		
		// Verify error code value
		Assert.assertEquals(expectedText, actualText);
		
	}
	
	@When("^User populates Captcha field$")
	public void user_populates_Captcha_field() throws Throwable {

		// Enter Captcha
        driver.findElement(By.name("captcha-120")).sendKeys("ABCD");
	}

	@Then("^Form send successfully$")
	public void form_send_successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}

	@Then("^Message validation dispalyed")
	public void message_validation_send() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
	}
	
	@After
	public void CloseBrowser() throws Throwable {
		driver.close();
	}

}
