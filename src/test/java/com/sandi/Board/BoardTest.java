package com.sandi.Board;

import com.sandi.base.TestBase;
import com.sandi.pages.BoardPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardTest extends TestBase {

    BoardPage board;

    public BoardTest(){
        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException{
        initialization();
        board = new BoardPage();
    }

    @Test(priority = 1)
    public void User_Add_Board_List_by_Input_Text_in_Board_List_Name() throws InterruptedException {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickAddListBtn();
        board.clickAddListNameField();
        board.inputValidAddListNameField();
        board.clickCreateBtn();
        Thread.sleep(3000);
        board.notifCreatingListIsSuccess();
    }

    @Test(priority = 2)
    public void User_Add_Board_List_by_Input_Empty_Text_Board_List_Name() throws InterruptedException {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickAddListBtn();
        board.clickAddListNameField();
        board.inputEmptyAddListNameField();
        board.clickCreateBtn();
        Thread.sleep(3000);
        board.notifListNameCannotBeEmpty();
    }

    @Test(priority = 3)
    public void User_Create_Card_Name_by_Input_Text_Card_Name()throws InterruptedException{
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickAddCardBtn();
        board.clickCardNameField();
        board.inputValidCardNameField();
        board.clickSubmitAddCardBtn();
        Thread.sleep(3000);
        board.notifCreatingCardIsSuccess();
    }

    @Test(priority = 4)
    public void User_Create_Card_Name_by_Input_Empty_Card_Name() throws InterruptedException {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickAddCardBtn();
        board.clickCardNameField();
        board.inputEmptyCardNameField();
        board.clickSubmitAddCardBtn();
        Thread.sleep(3000);
        board.notifCardNameCannotBeEmpty();
    }

    @Test(priority = 5)
    public void User_Create_New_Label_by_Input_Text_Name_and_Click_Color_of_Label() throws InterruptedException {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickCardUser();
        Thread.sleep(3000);
        board.clickLabelsBtn();
        board.clickAddLabelBtn();
        board.clickNameLabelField();
        board.inputValidNameLabel();
        board.clickColorOfLabel();
        board.clickCreateLabelBtn();
        Thread.sleep(3000);
        board.notifCreatingLabelForThisBoardSuccess();
    }

    @Test(priority = 6)
    public void User_Create_New_Label_by_Input_Empty_Name_and_Click_Color_of_Label() throws InterruptedException {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickCardUser();
        board.clickLabelsBtn();
        board.clickAddLabelBtn();
        board.clickNameLabelField();
        board.inputEmptyNameLabel();
        board.clickColorOfLabel();
        board.clickCreateLabelBtn();
        Thread.sleep(3000);
        board.notifLabelNameCannotBeEmpty();
    }

    @Test(priority = 7)
    public void User_Add_New_Comment_by_Input_Text_in_Tell_Your_Comment_Here_Field() throws InterruptedException {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickCardUser();
        board.clickAddNewCommentField();
        board.clickTellYourStoryField();
        board.inputValidComment();
        board.clickPostBtn();
        Thread.sleep(3000);
        board.notifCreateCommentIsSuccess();
    }

    @Test(priority = 7)
    public void User_Add_New_Comment_by_Input_Empty_Text_in_Tell_Your_Comment_Here_Field(){
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickCardUser();
        board.clickAddNewCommentField();
        board.clickTellYourStoryField();
        board.inputEmptyComment();
        board.clickPostBtn();
    }

    @Test(priority = 8)
    public void User_Attaches_Image_Using_Valid_URL_in_Card_Name_Comment_field() throws Exception {
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickCardUser();
        board.clickAddNewCommentField();
        board.clickInsertFilesBtnInCommentCard();
        board.clickFilesByUrlBtn();
        board.clickFilesByURLField();
        board.inputValidURlField();
        board.clickAddBtn();
        board.clickInsertUploadFilesByUrlBtn();
        Thread.sleep(3000);
        board.imageShowingInCardNameComment();

    }


    @Test(priority = 9)
    public void User_Attaches_Image_Using_Invalid_URL_in_Card_Name_Comment_field(){
//        board.clickCicleTeams();
        board.clickBoardMenu();
        board.clickCardUser();
        board.clickAddNewCommentField();
        board.clickInsertFilesBtnInCommentCard();
        board.clickFilesByUrlBtn();
        board.clickFilesByURLField();
        board.inputInvalidURlField();
        board.clickAddBtn();
        board.notifUrlEnteredIsInvalid();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
