package com.sandi.pages;

import com.sandi.base.TestBase;
import org.openqa.selenium.By;

import java.io.File;

public class GroupChatPage extends TestBase {

    public GroupChatPage(){
        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636deac7609ac90f8426d64d/group-chats/636deac7609ac90f8426d6c4");
    }

    By cicleTeams = By.xpath("//*[contains(text(),'Big Project')]");
    By groupChat = By.xpath("//*[contains(text(),'Group Chat')]");
    By typeMessageHere = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div");
    By inputMessage = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[2]/div/div/div");
    By sendBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[3]/div");

    By overLayBtnSendMsg = By.xpath("//*[contains(@class,'OverlayButton_box__2jFLd OverlayButton_contentOverlay__2zHVV')]");

    By textBallonMessage = By.className("Message_balloon__zRoXK");
    By optionBallonMessage = By.className("Message_iconOption__3F-Ru");

    By oldChat = By.xpath("//*[@id=\"list-groupChat-messages-section\"]/div/div/div[1]/div/div/div[1]/div[3]/div/p/span/time");

    By deleteMessageBtn = By.className("MessageMenuPopUp_menu__1rkRG");


    //*[contains(@class,'btn btn-danger btn-block btn-sm')]/child::node()
    By areYouSureToDeleteMessage = By.xpath("//*[contains(@class,'btn btn-danger btn-block btn-sm')]/child::node()");

    By attachmentBtn = By.xpath("//*[@id=\"root\"]/div[3]/div[1]/div[2]/div/div[1]/div");

    By attachmentFile = By.xpath("//*[contains(@type,'file')]");

        String filename1 = "/Users/sandikurnia/IdeaProjects/BigProject-CicleWebStaging/src/filetest/AndroidStudio.png";
        File file1 = new File(filename1);
        String path1 = file1.getAbsolutePath();

        String filename2 = "/Users/sandikurnia/IdeaProjects/BigProject-CicleWebStaging/src/filetest/videoTest.mov";
        File file2 = new File(filename2);
        String path2 = file2.getAbsolutePath();

    By downloadImage = By.xpath("//*[contains(text(),'Download')]");

    By downloadedImage = By.xpath("//*[contains(@src,'https://storage.googleapis.com/staging-cicle-app/61eba2c85080f47b25ddc8f8/637e4a4c66ccc7048ffe5643/66e2ca833ac5c7fe82797ac4ca95af7c/AndroidStudio.png')]");


//Assertion


    By uploadAttachmentIsSuccess = By.xpath("//*[contains(text(),'Upload attachments is success')]");

    By popUpDeleteMessage = By.xpath("//*[contains(text(),'Delete Message?')]");

    By deleteGroupChatAttachmentSuccess = By.xpath("//*[contains(text(),'Delete group chat message success')]");

    By formatFileNotAllowed = By.xpath("//*[contains(text(),'Format file not allowed.')]");

    public  void clickCicleTeams(){
        driver.findElement(cicleTeams).click();
    }

    public void clickGroupChatMenu(){
        driver.findElement(groupChat).click();
    }
    public void clickTypeMessageHere(){
        driver.findElement(typeMessageHere).click();
    }
    public void inputTypeMessageHere(){
        driver.findElement(inputMessage).sendKeys("Test V1");
    }

    public void inputEmptyTypeMessageHere(){
        driver.findElement(inputMessage).sendKeys("");
    }

    public void inputCharacterUsingSpaceButtonInTypeMessageField(){
        driver.findElement(inputMessage).sendKeys(" ");
    }

    public void clickSendBtn(){
        driver.findElement(sendBtn).click();
    }

    public void clickTextBallonMessage(){
        driver.findElement(textBallonMessage).click();
    }

    public void clickOptionBallonMessage(){
        driver.findElement(optionBallonMessage).click();
    }

    public void clickDeleteMessage(){
        driver.findElement(deleteMessageBtn).click();
    }

    public void clickAreYouSureToDeleteMessage(){
        driver.findElement(areYouSureToDeleteMessage).click();
    }

    public void clickAttachmentFile(){
        driver.findElement(attachmentFile).click();
    }

    public void clickAttachmentBtn(){
        driver.findElement(attachmentBtn).click();
    }

    public void clickUploadSupportedFile(){
        System.out.println("Upload file"+path1);
        driver.findElement(attachmentFile).sendKeys(path1);
    }

    public void clickUploadUnsupportedFile(){
        System.out.println("Upload file"+path2);
        driver.findElement(attachmentFile).sendKeys(path2);
    }

    public void clickDownloadImage(){
        driver.findElement(downloadImage).click();
    }

//Assertion

    public void userGetPopUpDeleteMessage(){
        driver.findElement(popUpDeleteMessage).isDisplayed();
    }
    public void userCanviewThatMessageShowingInGroupChat(){
        driver.findElement(textBallonMessage).isDisplayed();
    }

    public void userCanViewThatNoNewMessageShowingInGroupChat(){driver.findElement(oldChat).isDisplayed();}

    public void getnotifUploadAttachmentIsSuccess(){
        driver.findElement(uploadAttachmentIsSuccess).isDisplayed();
    }

    public void getNotifDeleteGroupChatAttachmentSuccess(){
        driver.findElement(deleteGroupChatAttachmentSuccess).isDisplayed();
    }

    public void getNotifFormatFileNotAllowed(){
        driver.findElement(formatFileNotAllowed).isDisplayed();
    }

    public void userCanViewDownloadedImage(){
        driver.findElement(downloadedImage).isDisplayed();
    }
}
