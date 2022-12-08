package com.sandi.stepDef;

import com.sandi.base.TestBase;
import com.sandi.pages.GroupChatPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class groupChatStep extends TestBase {

    GroupChatPage groupChat;

    @Given("Navigate user to group chat page")
    public void navigateUserGroupChatPage() throws Exception {
        initialization();
        groupChat = new GroupChatPage();
        Thread.sleep(3000);
    }

    @When("User click type message here field")
    public void userClickTypeMessageHereField() throws Exception{
        groupChat.clickTypeMessageHere();
        Thread.sleep(2000);
    }

    @And("User input text in type message here field")
    public void userInputTextInTypeMessageHereField() throws Exception{
        groupChat.inputTypeMessageHere();
        Thread.sleep(2000);
    }

    @And("User input empty text in type message here field")
    public void userInputEmptyTextInTypeMessageHereField() throws Exception{
        groupChat.inputEmptyTypeMessageHere();
        Thread.sleep(2000);
    }

    @And("User click send button")
    public void userClickSendButton() throws Exception{
        groupChat.clickSendBtn();
        Thread.sleep(2000);
    }

    @Then("User can view that message success to send in group chat")
    public void userCanViewThatMessageSuccessToSendInGroupChat() throws Exception{
        groupChat.userCanviewThatMessageShowingInGroupChat();
        Thread.sleep(2000);
        driver.quit();
    }

    @Then("User failed to send message in group chat")
    public void userFailedToSendMessageInGroupChat() throws Exception{
        groupChat.userCanViewThatNoNewMessageShowingInGroupChat();
        Thread.sleep(2000);
        driver.quit();
    }
    //Delete Message

    @When("User click text ballon message")
    public void userClickTextBallonMessage() throws Exception{
        groupChat.clickTextBallonMessage();
        Thread.sleep(2000);
    }

    @And("User click Option button on ballon message")
    public void userClickOptionButtonOnBallonMessage() throws Exception{
        groupChat.clickOptionBallonMessage();
        Thread.sleep(2000);
    }

    @And("User click delete message button")
    public void userClickDeleteMessageButton() throws Exception{
        groupChat.clickDeleteMessage();
        Thread.sleep(2000);
    }

    @Then("User get pop up notification delete message")
    public void userGetPopUpNotificationDeleteMessage() throws Exception{
        groupChat.userGetPopUpDeleteMessage();
        Thread.sleep(2000);

    }

    @When("User click delete button")
    public void userClickDeleteButton() throws Exception{
        groupChat.clickAreYouSureToDeleteMessage();
        Thread.sleep(2000);
    }

    @Then("User success to delete message")
    public void userSuccessToDeleteMessage() throws Exception{
        groupChat.getNotifDeleteGroupChatAttachmentSuccess();
        Thread.sleep(2000);
        driver.quit();
    }
//Attachment File
    @When("User click attachment button")
    public void userClickAttachmentButton() throws Exception{
        groupChat.clickAttachmentBtn();
        Thread.sleep(2000);
    }

    @And("User Upload Supported File")
    public void userUploadSupportedFile() throws Exception{
        groupChat.clickUploadSupportedFile();
        Thread.sleep(2000);
    }

    @Then("User successful to attach file in group chat")
    public void userSuccessfulToAttachFileInGroupChat() throws Exception{
        groupChat.getnotifUploadAttachmentIsSuccess();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User Upload unsupported File")
    public void userUploadUnsupportedFile() throws Exception{
        groupChat.clickUploadUnsupportedFile();
        Thread.sleep(2000);
    }

    @Then("User failed to attach file in group chat")
    public void userFailedToAttachFileInGroupChat() throws Exception{
        groupChat.getNotifFormatFileNotAllowed();
        Thread.sleep(2000);
        driver.quit();
    }

    @When("User click download image on ballon message")
    public void userClickDownloadImageOnBallonMessage() throws Exception{
        groupChat.clickDownloadImage();
        Thread.sleep(2000);
    }

    @Then("User able to view downloaded image")
    public void UserAbleToViewDownloadedImage() throws Exception{
        groupChat.userCanViewDownloadedImage();
        Thread.sleep(2000);
        driver.quit();
    }

}
