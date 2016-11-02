@ContactForm
Feature: Contact Form

  Scenario: Contact Form not send since Captcha not populated
    Given User navigates to Referty Home Page
    And User navigates to Contact page
    When User enters First Name, Name, Company and Email
    And User does not populate Captcha field
    And User clicks Send button
    Then Form not send
    And Message Erreur de validation
    And Message Erreur code captcha

  Scenario: Contact Form send successfully
    Given User navigates to Referty Home Page
    And User navigates to Contact page
    When User enters First Name, Name, Company and Email
    And User populates Captcha field
    And User clicks Send button
    Then Form send successfully
    And Message validation dispalyed
