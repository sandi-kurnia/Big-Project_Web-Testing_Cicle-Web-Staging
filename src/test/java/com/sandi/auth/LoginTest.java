package com.sandi.auth;

import com.sandi.base.TestBase;
import com.sandi.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    LoginPage loginPage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
        public void setUp() throws InterruptedException {
            initialization();
            loginPage = new LoginPage();
    }

    @Test
        public void verify_success_login_when_user_entered_valid_an_account(){

    }

    @AfterMethod
    public void tearDown (){

    }
}
