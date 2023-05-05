package com.bank.pages;


import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerPage extends Utility {

    By userFoundInList = By.xpath("//div[contains(text(),'Nina.Patel')]");
    By checkBox = By.xpath("div[role='columnheader'] i[class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButton=By.xpath("//i[@class='oxd-icon bi-trash']");
    By drpcustomerName=By.id("userSelect");
    By currencyDropDown=By.id("currency");
    By processButton=By.xpath("//button[normalize-space()='Process']");

    public String getTextUser() {
        return getTextFromElement(userFoundInList);

    }

    public void clickOnCheckBox() {
        clickOnElement(checkBox);
    }
    public void clickOnDeleteButton() {
        clickOnElement(deleteButton);
    }
    public void searchCustomerFromDropDown(String text){
        selectByVisibleTextFromDropDown(drpcustomerName,text);
    }
    public void selectCurrencyFromDropDown(String text){
        selectByVisibleTextFromDropDown(currencyDropDown,text);
    }
    public void clickOnProcess(){
        clickOnElement(processButton);
    }
    public String getPopTextFromOpenAccount(){
      return  getTextFromAlert();
    }
}
