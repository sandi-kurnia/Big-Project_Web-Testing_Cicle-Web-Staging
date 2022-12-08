package com.sandi.stepDef;

import com.sandi.base.TestBase;
import com.sandi.pages.BoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class boardStep extends TestBase {

    BoardPage board;

    public boardStep(){
        super();
    }

    @Given("Navigate user to board page")
    public void navigateUserToTeamsPage() throws Exception {
             initialization();
             board = new BoardPage();
             Thread.sleep(2000);
    }
//BOARDLIST
    @When("User click board menu")
    public void userClickBoardMenu() throws Exception {
        board.clickBoardMenu();
        Thread.sleep(2000);

    }
    @When("User click add list button")
    public void userClickAddListButton() throws Exception {
        board.clickAddListBtn();
        Thread.sleep(2000);

    }

    @And("User click list name field")
    public void userClickListNameField() throws Exception {
        board.clickAddListNameField();
        Thread.sleep(2000);
    }

    @And("User input text in list name field")
    public void userInputTextInListNameField() throws Exception{
        board.inputValidAddListNameField();
        Thread.sleep(2000);
    }

    @And("User click create button")
    public void userClickCreateButton() throws Exception {
        board.clickCreateBtn();
        Thread.sleep(2000);
    }

    @Then("User success to add new board list")
    public void userSuccessToAddNewBoardList() throws Exception {
        board.notifCreatingListIsSuccess();
        Thread.sleep(2000);
        driver.quit();
    }


    @And("User input empty text in list name field")
    public void userInputEmptyListNameField() throws Exception {
        board.inputEmptyAddListNameField();
        Thread.sleep(2000);
    }

    @Then("User failed to add new board list")
    public void userFailedToAddNewBoardList() throws Exception  {
        board.notifListNameCannotBeEmpty();
        Thread.sleep(2000);
        driver.quit();
    }
//CARD
    @When("User click add card button")
    public void userClickAddCardButton() throws Exception{
        board.clickAddCardBtn();
        Thread.sleep(2000);
    }

    @And("User click card name field")
    public void userClickCardNameField() throws Exception{
        board.clickCardNameField();
        Thread.sleep(2000);
    }

    @And("User input valid card name field")
    public void userInputValidCardNameField() throws Exception{
        board.inputValidCardNameField();
        Thread.sleep(2000);
    }

    @And("User submit add card button")
    public void userSubmitAddCardButton() throws Exception{
        board.clickSubmitAddCardBtn();
        Thread.sleep(2000);
    }

    @Then("User success to create new card")
    public void UserSuccesstoCreateNewCard() throws Exception{
        board.notifCreatingCardIsSuccess();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User input empty card name field")
    public void userInputEmptyCardNameField() throws Exception{
        board.inputEmptyCardNameField();
        Thread.sleep(2000);
    }

    @Then("User failed to create new card")
    public void userFailedToCreateNewCard() throws Exception{
        board.notifCardNameCannotBeEmpty();
        Thread.sleep(2000);
        driver.quit();
    }
//LABEL
    @When("User click card user")
    public void userClickCardUser() throws Exception{
        board.clickCardUser();
        Thread.sleep(2000);
    }

    @And("User click label button")
    public void userClickLabelsButton() throws Exception{
        board.clickLabelsBtn();
        Thread.sleep(2000);
    }

    @And("User click add label button")
    public void userClickAddLabelButton() throws Exception{
        board.clickAddLabelBtn();
        Thread.sleep(2000);
    }

    @And("User click name label field")
    public void userClickNameLabelField() throws Exception{
        board.clickNameLabelField();
        Thread.sleep(2000);
    }

    @And("User input valid name label")
    public void userInputValidNameLabel() throws Exception{
        board.inputValidNameLabel();
        Thread.sleep(2000);
    }

    @And("User input empty name label")
    public void userInputEmptyNameLabel() throws Exception{
        board.inputEmptyNameLabel();
        Thread.sleep(2000);
    }

    @And("User click color of label")
    public void userClickColorOfLabel() throws Exception{
        board.clickColorOfLabel();
        Thread.sleep(2000);
    }

    @And("User click create label button")
    public void userClickCreateLabelButton() throws Exception{
        board.clickCreateLabelBtn();
        Thread.sleep(2000);
    }

    @Then("User success to create new label")
    public void userSuccessToCreateNewLabel() throws Exception{
        board.notifCreatingLabelForThisBoardSuccess();
        Thread.sleep(2000);
        driver.quit();
    }

    @Then("User failed to create new label")
    public void userFailedToCreateNewLabel() throws Exception{
        board.notifLabelNameCannotBeEmpty();
        Thread.sleep(2000);
        driver.quit();
    }

//COMMENT
    @And("User add new comment field")
    public void userAddNewCommentField() throws Exception{
        board.clickAddNewCommentField();
        Thread.sleep(2000);
    }

    @And("User tell your story field")
    public void userTellYourStoryField() throws Exception{
        board.clickTellYourStoryField();
        Thread.sleep(2000);
    }

    @And("User input valid comment")
    public void userInputValidComment() throws Exception{
        board.inputValidComment();
        Thread.sleep(2000);
    }

    @And("User input empty comment")
    public void userInputEmptyComment() throws Exception{
        board.inputEmptyComment();
        Thread.sleep(2000);
    }

    @And("User click post button")
    public void userClickPostButton() throws Exception{
        board.clickPostBtn();
        Thread.sleep(2000);
    }

    @Then("User success to add new comment")
    public void userSuccessToAddNewComment() throws Exception{
        board.notifCreateCommentIsSuccess();
        Thread.sleep(2000);
        driver.quit();
    }

    @Then("User failed to add new comment")
    public void userFailedToAddNewComment() throws Exception{
        board.commentField();
        Thread.sleep(2000);
        driver.quit();
    }
//AttahesImage
    @And("User click insert files button in comment card")
    public void userClickInsertFilesButtonInCommentCard() throws Exception{

        board.clickInsertFilesBtnInCommentCard();
        Thread.sleep(2000);
    }

    @And("User click files by url button")
    public void userClickFilesByUrlButton() throws Exception{
        board.clickFilesByUrlBtn();
        Thread.sleep(2000);
    }

    @And("User click files by url field")
    public void userClickFilesByUrlField() throws Exception{

        board.clickFilesByURLField();
        Thread.sleep(2000);
    }

    @And("User input valid url field")
    public void userInputValidUrlField() throws Exception{

        board.inputValidURlField();
        Thread.sleep(2000);
    }

    @And("User click add button")
    public void userClickAddButton() throws Exception{
        board.clickAddBtn();
        Thread.sleep(2000);
    }

    @And("User click insert upload files by url button")
    public void userClickInsertUploadFilesByUrlButton() throws Exception{
        board.clickInsertUploadFilesByUrlBtn();
        Thread.sleep(2000);
    }

    @Then("User can view that image showing in card name comment field")
    public void userCanViewThatImageShowingInCardNameCommentField() throws Exception{

        board.imageShowingInCardNameComment();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User input invalid url field")
    public void userInputInvalidUrlField() throws Exception{
        board.inputInvalidURlField();
        Thread.sleep(2000);
    }

    @Then("User failed to attaches image using invalid url")
    public void userFailedToAttachesImageUsingInvalidURL() throws Exception {
        board.notifUrlEnteredIsInvalid();
        Thread.sleep(2000);
        driver.quit();
    }

    @And("User input character using space button in card name field")
    public void userInputCharacterUsingSpaceButtonInCardNameField() throws Exception{
        board.inputCharacterUsingSpaceButtonInCardNameField();
        Thread.sleep(2000);
    }

    @And("User input character using space button in board list name field")
    public void userInputCharacterUsingSpaceButtonInBoardListNameField() throws Exception{
        board.inputCharacterUsingSpacesButtonInBoardListNameField();
        Thread.sleep(2000);
    }
}
