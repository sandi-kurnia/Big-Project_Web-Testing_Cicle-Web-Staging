package com.sandi.pages;

import com.sandi.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    public LoginPage(){
        PageFactory.initElements(driver,"https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8");
    }
    By googleLoginBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]");
    By googleEmailField = By.id("identifierId");
    By googleNextBtn = By.xpath("//*[@id=\"identifierNext\"]/div/button");
    By googlePassField = By.name("password");
    By googleNextAfterPassBtn = By.xpath("//*[@id=\"passwordNext\"]/div/button");

    public void clickGoogleLoginBtn(){

        driver.findElement(googleLoginBtn).click();
    }
    public void inputGoogleEmailField(String email){
        driver.findElement(googleEmailField).sendKeys(email);
    }
    public void clickGoogleNextBtn(){
        driver.findElement(googleNextBtn).click();
    }
    public void inputGooglePassField (String password) {
        driver.findElement(googlePassField).sendKeys(password);
    }
    public void clickGoogleNextAfterPassBtn(){
        driver.findElement(googleNextAfterPassBtn).click();
    }

}

