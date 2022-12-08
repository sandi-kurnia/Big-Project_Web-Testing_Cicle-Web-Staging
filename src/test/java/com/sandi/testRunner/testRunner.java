package com.sandi.testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber-reports/cucumberGroupChat.json",
                "html:target/cucumber-reports/groupChatReport.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = "src/test/resources/Feature/groupChat.feature    ",
        glue = {"com/sandi/stepDef"},
        monochrome = true,
        dryRun = false,
        tags = "@GroupChat-Feature"
)

public class testRunner extends AbstractTestNGCucumberTests {

}
