package com.bank.pages;



import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By bankManagerLoginLink=By.xpath("//button[normalize-space()='Bank Manager Login']");
    By registerLink=By.linkText("Register");
    By openAccount=By.xpath("//button[normalize-space()='Open Account']");

    public void clickOnBankManagerLoginLink(){
        clickOnElement(bankManagerLoginLink);
    }
    public void registerLink(){
        clickOnElement(registerLink);
    }
    public String getBaseUrl(){
        return driver.getCurrentUrl();

    }
    public void clickOnOpenAccount(){
        clickOnElement(openAccount);
    }
}
