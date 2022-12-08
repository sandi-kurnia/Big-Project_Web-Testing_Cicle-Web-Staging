package com.sandi.base;

import com.sandi.utils.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static Properties properties;

    public TestBase (){
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/sandi/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void initialization(){
//        String browserName = properties.getProperty("browser");
//        if (browserName.equals("chrome")){
//        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
//        driver = new ChromeDriver();

        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");

        chrome_options.addArguments("user-data-dir=/Users/sandikurnia/Library/Application Support/Google/Chrome/Default/default");
        chrome_options.addArguments("--profile-directory=default");

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver(chrome_options);

        driver.manage().timeouts().pageLoadTimeout(TestUtils.Page_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);

        driver.get(properties.getProperty("url"));


//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//
//        ChromeOptions options = new ChromeOptions();
//        options.setBinary("/Applications");
//        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
//        options.setExperimentalOption("useAutomationExtension", false);
//
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("disable-infobars");
//        options.addArguments("--disable-extensions");
//        options.addArguments("--start-maximized");
//        options.addArguments("--disable-web-security");
//        options.addArguments("--allow-running-insecure-content");
//
//        options.addArguments("--remote-debugging-port=31780");
//        options.addArguments("/Users/sandikurnia/Library/Application Support/Google/Chrome/Default");
//        options.addArguments("profile-directory=Default");

//        capabilities.setCapability("chrome","src/main/resources/chromedriver");
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

//        driver.manage().window().maximize();
//        driver.manage().deleteAllCookies();

    }
}
