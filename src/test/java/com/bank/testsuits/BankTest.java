package com.bank.testsuits;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    CustomerPage customerPage = new CustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
//    click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginLink();
//    click On "Add Customer" Tab
        addCustomerPage.clickOnAddCustomer();
//    enter FirstName
        addCustomerPage.enterFirstName("Joan");
        //    enter LastName
        addCustomerPage.enterLastName("eve");
//    enter PostCode
        addCustomerPage.enterPostCode("Tw3 4Qp");
//    click On "Add Customer" Button
        addCustomerPage.clickOnAddCustomerButton();
//    popup display
//    verify message "Customer added successfully"
        Assert.assertEquals(addCustomerPage.getPopUpMessage(), "Customer added successfully with customer id :8", "message not found");
//    click on "ok" button on popup.
        addCustomerPage.clickOnPopUpMessage();
    }


    @Test
    public void bankManagerShouldOpenAccountSuccessfully() {
//        click On "Bank Manager Login" Tab
        homePage.clickOnBankManagerLoginLink();
//        click On "Open Account" Tab
        homePage.clickOnOpenAccount();
//        Search customer that created in first test
        customerPage.searchCustomerFromDropDown("Harry Potter");

//        Select currency "Pound"
        customerPage.selectCurrencyFromDropDown("Pound");

//        click on "process" button
        customerPage.clickOnProcess();
//        popup displayed
//        verify message "Account created successfully"
        Assert.assertEquals(customerPage.getPopTextFromOpenAccount(), "Account created successfully with account Number :1016", "text not found");
//        click on "ok" button on popup.
        addCustomerPage.clickOnPopUpMessage();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() {
//    click on "Customer Login" Tab
        customerLoginPage.clickOnCustomersLoginButton();
//    search customer that you created.
        customerLoginPage.searchCreatedCustomer("Ann olins");
//    click on "Login" Button
        customerLoginPage.clickOnLoginButton();
//    verify "Logout" Tab displayed.
        customerLoginPage.getTextLogOut();
//    click on "Logout"
        customerLoginPage.clickOnLogOut();
//    verify "Your Name" text displayed.
        Assert.assertEquals(customerLoginPage.getTextOfYourName(), "Your Name");


    }

    @Test
    public void customerShouldDepositMoneySuccessfully() {

//    click on "Customer Login" Tab
        customerLoginPage.clickOnCustomersLoginButton();
//    search customer that you created.
        customerLoginPage.searchCreatedCustomer("Ann olins");
//    click on "Login" Button
        customerLoginPage.clickOnLoginButton();
//    click on "Deposit" Tab
        customerLoginPage.clickOnDepositButton();
//    Enter amount 100
        accountPage.enterAmountToDeposit("100");
//    click on "Deposit" Button
        customerLoginPage.clickOnDepositButton();
//    verify message "Deposit Successful"
        Assert.assertEquals(accountPage.getDepositMsg(), "Deposit Successful", "Message not found");
    }


    @Test
    public void customerShouldWithdrawMoneySuccessfully() {
//        click on "Customer Login" Tab
        customerLoginPage.clickOnCustomersLoginButton();
//        search customer that you created.
        customerLoginPage.searchCreatedCustomer("Ann olins");
//         click on "Login" Button
        customerLoginPage.clickOnLoginButton();
//        click on "Withdrawl" Tab
        customerLoginPage.clickOnWithdrawl();
//        Enter amount 50
        accountPage.enterAmountToWithdraw("50");
//        click on "Deposit" Button
        accountPage.clickOnWithdrawButton();
        customerLoginPage.clickOnDepositButton();
//        verify message "Transaction Successful"
        Assert.assertEquals(accountPage.getWithdrawMsg(), "Transaction Successful", "Message not found");

    }
}