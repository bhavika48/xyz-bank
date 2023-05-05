package com.bank.pages;


import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {
    By systemUserText = By.xpath("//h5[normalize-space()='System Users']");
    By addButton = By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']");
    By addUserText = By.xpath("//h6[normalize-space()='Add User']");
    By userRoleDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By empNameTextBox = By.xpath("//input[@placeholder='Type for hints...']");
    By userNameField = By.xpath("//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By passwordField = By.name("//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By confirmPasswordField = By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']");
    By statusDropDown = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    By sucessfulSave = By.xpath("//body");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By depositMsg = By.xpath("//span[text()='Deposit Successful']");
    By withdrawTab = By.xpath("//button[@ng-click='withdrawl()']");
    By withdrawButton = By.xpath("//button[text()='Withdraw']");
    By withdrawMsg = By.xpath("//span[text()='Transaction Successful']");
    By amountField = By.xpath("//input[@ng-model='amount']");


    public String getTextSystemUser() {
        return getTextFromElement(systemUserText);
    }

    public void clickOnAdminTab() {
        clickOnElement(addButton);
    }

    public String getTextAddUser() {
        return getTextFromElement(addUserText);
    }

    public void selectUserRole(String visibleText) {
        //selectByVisibleTextFromDropDown(userRoleDropDown, visibleText);
        clickOnElement(By.xpath("//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[1]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
        clickOnElement(By.xpath("//div[contains(text(),'Admin')]"));
    }

    public void enterEmployeeName(String employeeName) {
        sendTextToElement(empNameTextBox, employeeName);
    }

    public void enterUserName(String userName) {
        sendTextToElement(userNameField, userName);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String password) {
        sendTextToElement(confirmPasswordField, password);
    }

    public void selectStatus(String visibleText) {
        selectByVisibleTextFromDropDown(statusDropDown, visibleText);
    }

    public void clickOnSaveButton() {
        clickOnElement(saveButton);
    }

    public String getTextSuccessfullySaved() {
        return getTextFromElement(sucessfulSave);
    }

    public void clickOnSearchButton() {
        clickOnElement(searchButton);
    }

    public void clickOnWithdrawTab() {
        clickOnElement(withdrawTab);
    }

    public void enterAmountToWithdraw(String text) {
        sendTextToElement(amountField, text);
    }

    public void clickOnWithdrawButton() {
        clickOnElement(withdrawButton);
    }

    public String getWithdrawMsg() {
        return getTextFromElement(withdrawMsg);
    }

    public String getDepositMsg() {
        return getTextFromElement(depositMsg);
    }

    public void enterAmountToDeposit(String text) {
        sendTextToElement(amountField, text);
    }


}







