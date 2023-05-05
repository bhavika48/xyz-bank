package com.bank.pages;


import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {
    By adminTab= By.xpath("//span[.='Admin']");
    By dashboard=By.xpath("//h6[normalize-space()='Dashboard']");


    public void clickOnAdminTab(){
        clickOnElement(adminTab);
    }
    public String getTextDashboard(){
        return getTextFromElement(dashboard);
    }
}
