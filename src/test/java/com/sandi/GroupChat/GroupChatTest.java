package com.sandi.GroupChat;

import com.sandi.base.TestBase;
import com.sandi.pages.GroupChatPage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GroupChatTest extends TestBase {
    GroupChatPage groupChat;

    public GroupChatTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException {
        initialization();
        groupChat = new GroupChatPage();
    }

    @Test(priority = 0)
    public void User_Send_Message_in_Group_Chat_by_Input_Text() throws InterruptedException {
 //       groupChat.clickCicleTeams();
//        groupChat.clickGroupChatMenu();
        groupChat.clickTypeMessageHere();
        groupChat.inputTypeMessageHere();
        groupChat.clickSendBtn();
        Thread.sleep(3000);
    }



    @Test(priority = 1)
    public void User_Send_Message_in_Group_Chat_without_Input_Text () throws InterruptedException {
//        groupChat.clickCicleTeams();
        groupChat.clickGroupChatMenu();
        groupChat.clickTypeMessageHere();
        groupChat.inputEmptyTypeMessageHere();
        groupChat.clickSendBtn();
        Thread.sleep(3000);
    }

    @Test(priority = 2)
    public void User_Delete_Message_in_Group_Chat() throws InterruptedException {
//        groupChat.clickCicleTeams();
        groupChat.clickGroupChatMenu();
        groupChat.clickTextBallonMessage();
        groupChat.clickTextBallonMessage();
        groupChat.clickDeleteMessage();
        groupChat.clickAreYouSureToDeleteMessage();
        groupChat.getNotifDeleteGroupChatAttachmentSuccess();
        Thread.sleep(3000);
    }

    @Test(priority = 3)
    public void User_Attaches_with_Supported_Format_File_in_Group_Chat() throws InterruptedException{
//        groupChat.clickCicleTeams();
//        groupChat.clickGroupChatMenu();
        groupChat.clickUploadSupportedFile();
        groupChat.getnotifUploadAttachmentIsSuccess();
        Thread.sleep(3000);
    }

    @Test(priority = 4)
    public void User_Attaches_with_Unsupported_Format_File_in_Group_Chat() throws InterruptedException{
//        groupChat.clickCicleTeams();
        groupChat.clickGroupChatMenu();
        groupChat.clickUploadUnsupportedFile();
        groupChat.getNotifFormatFileNotAllowed();
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public void User_Download_Image_in_Group_Chat() throws InterruptedException{
//        groupChat.clickCicleTeams();
        groupChat.clickGroupChatMenu();
        groupChat.clickDownloadImage();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
