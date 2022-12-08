package com.sandi.stepDef;

import com.sandi.base.TestBase;
import com.sandi.pages.BlastPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class blastStep extends TestBase {

    BlastPage blast;

    @Given("Navigate user to blast page")
    public void navigateUserToBlastChatPage() throws Exception {
        initialization();
        blast = new BlastPage();
        Thread.sleep(2000);
    }

    @When("User click create blast button")
    public void userClickCreateBlastButton() throws Exception {
        blast.clickCreateBlastBtn();
        Thread.sleep(2000);
    }

    @And("User click type a tittle field")
    public void userClickTypeATittleField() throws Exception {
        blast.clickTypeATittleField();
        Thread.sleep(2000);
    }

    @And("User input text in type a tittle field")
    public void userInputTextInTypeATittleField() throws Exception {
        blast.inputTypeATittleField();
        Thread.sleep(2000);
    }

    @And("User click tell your story here field")
    public void userClickTellYourStoryHereField() throws Exception {
        blast.clickTellYourStoryHereField();
        Thread.sleep(2000);
    }

    @And("User input text in tell your story here field")
    public void userInputTextInTellYourStoryHereField() throws Exception {
        blast.inputTellYourStoryHereField();
        Thread.sleep(2000);
    }

    @And("User click publish button")
    public void userClickPublishButton() throws Exception {
        blast.clickPublishBtn();
        Thread.sleep(2000);
    }

    @Then("User success to publish a post")
    public void userSuccessToPublishAPost() throws Exception{
        blast.getBlastDetail();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User input empty text in type a tittle field")
    public void userInputEmptyTextInTypeATittleField() throws Exception{
        blast.inputEmptyTypeTittleField();
        Thread.sleep(2000);
    }

    @Then("User get notif field parameter not completed")
    public void userGetNotifFieldParameterNotCompleted() throws Exception{
        blast.getFieldParamaterNotComplete();
        Thread.sleep(2000);
        driver.quit();
    }
//Insert FIles By Url
    @And("User click insert files button")
    public void userClickInsertFilesButton() throws Exception{
        blast.clickInsertFilesBtn();
        Thread.sleep(2000);
    }

    @And("User click insert files by url button")
    public void userClickInsertFilesByUrlButton() throws Exception{
        blast.clickInsertFilesByUrlBtn();
        Thread.sleep(2000);
    }

    @And("User click insert file by url field")
    public void userClickInsertFileByUrlField() throws Exception{
        blast.clickInsertFilesByUrlField();
        Thread.sleep(2000);
    }

    @And("User insert files by valid url")
    public void userInsertFilesByValidUrl() throws Exception{
        blast.insertFilesByValidUrl();
        Thread.sleep(2000);
    }

    @And("User click add button in url menu")
    public void userClickAddButtonInUrlMenu() throws Exception{
        blast.clickAddBtn();
        Thread.sleep(2000);
    }

    @And("User click upload Insert Image")
    public void userClickUploadInsertImage() throws Exception{
        blast.clickUploadInsertImage();
        Thread.sleep(2000);
    }

    @Then("User success to insert files by valid url on description")
    public void userSuccessToInsertFilesByValidUrlOnDescription() throws Exception{
        blast.getFilesByUrlOnDesc();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User insert files by empty url")
    public void userInsertFilesByEmptyUrl() throws Exception{
        blast.insertFilesByEmptyUrl();
        Thread.sleep(2000);
    }

    @Then("User failed to insert files by empty url on description")
    public void userFailedToInsertFilesByEmptyUrlOnDescription() throws Exception{
        blast.getUrlenteredIsInvalid();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User click upload files button")
    public void userClickUploadFilesButton() throws Exception{
        blast.clickUploadFilesBtn();
        Thread.sleep(2000);
    }

    @And("User click browse file button")
    public void userClickBrowseFileButton() throws Exception{
        blast.clickBrowseFileBtn();
        Thread.sleep(2000);
    }

    @And("User click upload button by browse file button")
    public void userClickUploadButtonByBrowseFileButton() throws Exception{
        blast.clickUploadBtnByBrowseFile();
        Thread.sleep(2000);
    }

    @Then("User success to insert files by upload files on description")
    public void userSuccessToInsertFilesByUploadFilesOnDescription() throws Exception{
        blast.getFilesByUrlOnDesc();
        Thread.sleep(2000);
        driver.quit();
    }
//Cheers
    @When("User click blast detail")
    public void userClickBlastDetail() throws Exception{
        blast.clickBlastDetail();
        Thread.sleep(2000);

    }

    @And("User click cheers button")
    public void userClickCheersButton() throws Exception{
        blast.clickCheersBtn();
        Thread.sleep(2000);
    }

    @And("User click cheers field")
    public void userClickCheersField() throws Exception{
        blast.clickCheersField();
        Thread.sleep(2000);
    }

    @And("User input text on cheers field")
    public void userInputTextOnCheersField() throws Exception{
        blast.inputTextOnCheersField();
        Thread.sleep(2000);
    }

    @And("User click check cheers button")
    public void userClickCheckCheersButton() throws Exception{
        blast.clickCheckCheersBtn();
        Thread.sleep(2000);
    }

    @Then("User success to create cheers on post")
    public void userSuccessToCreateCheersOnPost() throws Exception{
        blast.getCreateCheersOnPostSuccessful();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User input empty text on cheers field")
    public void userInputEmptyTextOnCheersField() throws Exception{
        blast.inputEmptyTextOnCheerField();
        Thread.sleep(2000);

    }

    @Then("User failed to create cheers on blast")
    public void userFailedToCreateCheersOnBlast() throws Exception{
        blast.getCheersCannotBeEmpty();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User click bubble cheers")
    public void userClickBubbleCheers() throws Exception{
        blast.clickBubbleCheers();
        Thread.sleep(2000);
    }

    @And("User click delete cheers")
    public void userClickDeleteCheers() throws Exception{
        blast.clickDeleteCheers();
        Thread.sleep(2000);
    }

    @Then("User success to delete cheers")
    public void userSuccessToDeleteCheers() throws Exception{
        blast.deleteCheersOnPostSuccessful();
        Thread.sleep(2000);
        driver.quit();
    }
}
