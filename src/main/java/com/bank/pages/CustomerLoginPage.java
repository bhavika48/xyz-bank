package com.bank.pages;


import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By userNameField = By.name("username");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By customersLoginButton = By.xpath("//button[normalize-space()='Customer Login']");
    By searchCustomerName = By.xpath("//input[@placeholder='Search Customer']");
    By logoutText=By.xpath("//button[normalize-space()='Logout']");
    By welcomeUserNameText=By.xpath("//select[@id='userSelect']");
    By logoutButton=By.xpath("//button[normalize-space()='Logout']");
    By yourNameDropDown=By.xpath("//select[@id='userSelect']");
    By depositButton=By.xpath("//button[normalize-space()='Deposit']");
    By withdrawButton=By.xpath("//button[normalize-space()='Withdrawl']");



    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public void clickOnCustomersLoginButton() {
        clickOnElement(customersLoginButton);

    }

    public void searchCreatedCustomer(String visibleText) {
       selectByVisibleTextFromDropDown(yourNameDropDown, visibleText);
    }
    public String getTextLogOut(){
        return getTextFromElement(logoutText);
    }
    public String getTextOfYourName(){
        return getTextFromElement(welcomeUserNameText);
    }
    public void clickOnLogOut(){
        clickOnElement(logoutButton);
    }
    public void clickOnDepositButton(){
        clickOnElement(depositButton);
    }
    public void clickOnWithdrawl(){
        clickOnElement(withdrawButton);
    }


}


