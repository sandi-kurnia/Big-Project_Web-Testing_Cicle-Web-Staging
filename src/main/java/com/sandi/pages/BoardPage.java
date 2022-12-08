package com.sandi.pages;

import com.sandi.base.TestBase;
import org.openqa.selenium.By;

public class BoardPage extends TestBase {

    public BoardPage(){
        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636deac7609ac90f8426d64d/boards/636deac7609ac90f8426d6c3");
    }

        By cicleTeams = By.xpath("//*[contains(text(),'Big Project')]");
        By boardMenu = By.xpath("//*[contains(text(),'Board')]");

//List
        By addListBtn = By.xpath("//*[contains(text(),'Add List')]");

        By listNameField = By.xpath("//*[contains(@placeholder,'Input list name...')]");
        By createBtn = By.xpath("//*[contains(text(),'Create')]");
//Card
        By addCardBtn = By.xpath("//*[contains(text(),'Add Card')]");
        By threedotBtn = By.className("RoundActionMenu_container__2ta8s");
        By cardNameField =  By.xpath("//*[contains(@placeholder,'Card name')]");
        By submitAddCardBtn = By.xpath("//*[contains(text(),'Add Card')]");

        By cardUser = By.xpath("//*[@id=\"listcard_content-0\"]/div[1]/div/div/a");

//CommentCard
        By addNewCommentField = By.xpath("//*[contains(@placeholder,'Add new comment...')]");
        By tellYourStoryHere = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div/p");
        By postBtn = By.xpath("//*[contains(text(),'Post')]");

// Attachment Comment

        By insertFilesBtnInCommentCard = By.xpath("//*[@data-cmd=\"insertFiles\"]");

        By uploadFilesBtn = By.xpath("//*[contains(@data-cmd,'filesByURL')]");

        By filesByURLBtn = By.xpath("//*[contains(@data-cmd,'filesByURL')]");

        By filesByURLField = By.xpath("//*[@id=\"fr-files-by-url-layer-text-1\"]");

        By insertUploadFilesByUrlBtn = By.xpath("//*[contains(@data-cmd,'imageInsertByUpload')]");

        By uploadFilesBtnInCommentCard = By.xpath("//*[contains(text(),'Drag & Drop One or More Files')]");

        By addBtn = By.xpath("//*[contains(@data-cmd,'filesInsertByURL')]");

//Label
        By labelsBtn = By.xpath("//*[contains(@data-testid,'LabelIcon')]/child::node()");
        By addLabelBtn = By.xpath("//*[contains(@class,'ToggleLabels_plusButton__3YgnQ')]");

        By inputNameLabelField = By.xpath("//*[contains(@placeholder,'Input name')]");

        By colorOfLabels = By.xpath("//*[contains(@style,'background-color: grey')]");

        By createLabelBtn = By.xpath("//*[@id=\"cardModal\"]/div/div/div[2]/div[1]/div[2]/div/div[6]/button");

//Assertion
        By creatingListIsSuccess = By.xpath("//*[contains(text(),'Creating list is success')]");

        By creatingCardIsSuccess = By.xpath("//*[contains(text(),'Creating card is success')]");

        By listNameCannotBeEmpty = By.xpath("//*[contains(text(),'List name cannot be empty')]");
        By cardNameCannotBeEmpty = By.xpath("//*[contains(text(),'Card name cannot be empty')]");

        By createCommentIsSuccess = By.xpath("//*[contains(text(),'Create comment is success')]");

        By creatingLabelForThisBoardSuccess = By.xpath("//*[contains(text(),'Creating label for this board is success')]");

        By LabelNameCannotBeEmpty = By.xpath("//*[contains(text(),'Label name cannot be empty!')]");

        By urlEnteredisInvalid = By.xpath("//*[contains(text(),'Url entered is invalid. Please try again.')]");

        By ImageUsingUrlinCardNameComment = By.xpath("//*[@id=\"cardModal\"]/div/div/div[1]/div[7]/div/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div[1]/p/img");

    public void clickCicleTeams(){
        driver.findElement(cicleTeams).click();
    }

    public void clickBoardMenu (){
        driver.findElement(boardMenu).click();
    }

    public void clickAddListBtn (){
        driver.findElement(addListBtn).click();
    }

    public void clickAddListNameField(){
        driver.findElement(listNameField).click();
    }
    public void inputValidAddListNameField(){
        driver.findElement(listNameField).sendKeys("Apple");
    }
    public void inputEmptyAddListNameField(){
        driver.findElement(listNameField).sendKeys("");
    }

    public void inputCharacterUsingSpacesButtonInBoardListNameField(){
        driver.findElement(listNameField).sendKeys(" ");
    }

    public void clickCreateBtn(){
        driver.findElement(createBtn).click();
    }

    public void clickAddCardBtn(){
        driver.findElement(addCardBtn).click();
    }

    public void clickThreeDotBtn(){
        driver.findElement(threedotBtn).click();
    }

    public void clickCardNameField(){
        driver.findElement(cardNameField).click();
    }

    public void inputValidCardNameField(){
        driver.findElement(cardNameField).sendKeys("Big Project");
    }

    public void inputEmptyCardNameField(){
        driver.findElement(cardNameField).sendKeys("");
    }

    public void inputCharacterUsingSpaceButtonInCardNameField(){
        driver.findElement(cardNameField).sendKeys(" ");
    }

    public void clickSubmitAddCardBtn(){
        driver.findElement(submitAddCardBtn).click();
    }

    public void clickCardUser(){
        driver.findElement(cardUser).click();
    }

//  Comment
    public void clickAddNewCommentField(){
        driver.findElement(addNewCommentField).click();
    }


    public void clickTellYourStoryField(){
        driver.findElement(tellYourStoryHere).click();
    }
    public void inputValidComment(){
        driver.findElement(tellYourStoryHere).sendKeys("Indonesian");
    }

    public void inputEmptyComment(){
        driver.findElement(tellYourStoryHere).sendKeys("");
    }

    public void clickPostBtn(){
        driver.findElement(postBtn).click();
    }

    public void clickLabelsBtn(){
        driver.findElement(labelsBtn).click();
    }

    public void clickAddLabelBtn(){
        driver.findElement(addLabelBtn).click();
    }

    public void clickNameLabelField(){
        driver.findElement(inputNameLabelField).click();
    }

    public void clickColorOfLabel(){
        driver.findElement(colorOfLabels).click();
    }

    public void inputValidNameLabel(){
        driver.findElement(inputNameLabelField).sendKeys("Sandi");
    }

    public void inputEmptyNameLabel(){
        driver.findElement(inputNameLabelField).sendKeys("");
    }

    public void clickCreateLabelBtn(){
        driver.findElement(createLabelBtn).click();
    }

    public void clickInsertFilesBtnInCommentCard(){
        driver.findElement(insertFilesBtnInCommentCard).click();
    }
    public void clickUploadFilesBtn(){
        driver.findElement(uploadFilesBtn).click();
    }

    public void clickFilesByUrlBtn(){
        driver.findElement(filesByURLBtn).click();
    }

    public void clickFilesByURLField(){
        driver.findElement(filesByURLField).click();
    }
    public void inputValidURlField(){
        driver.findElement(filesByURLField).sendKeys("https://akcdn.detik.net.id/visual/2020/01/30/fd8a89f8-cd07-4d7e-9a24-17c440c90e4d_169.png?w=650");
    }

    public void inputInvalidURlField(){
        driver.findElement(filesByURLField).sendKeys("Nonochan");
    }

    public void clickInsertUploadFilesByUrlBtn(){
        driver.findElement(insertUploadFilesByUrlBtn).click();
    }

    public void clickUploadFilesBtnInCommentCard(){
        driver.findElement(uploadFilesBtnInCommentCard).sendKeys("src/filestest/AndroidStudio.png");
    }

    public void clickAddBtn(){
        driver.findElement(addBtn).click();
    }
//Assertion

    public void notifCreatingListIsSuccess(){
        driver.findElement(creatingListIsSuccess).isDisplayed();
    }

    public void notifCreatingCardIsSuccess(){
        driver.findElement(creatingCardIsSuccess).isDisplayed();
    }

    public void notifListNameCannotBeEmpty(){
        driver.findElement(listNameCannotBeEmpty).isDisplayed();
    }
    public void notifCardNameCannotBeEmpty(){
        driver.findElement(cardNameCannotBeEmpty).isDisplayed();
    }

    public void notifCreateCommentIsSuccess(){
        driver.findElement(createCommentIsSuccess).isDisplayed();
    }

    public void notifCreatingLabelForThisBoardSuccess(){
        driver.findElement(creatingLabelForThisBoardSuccess).isDisplayed();
    }

    public void notifLabelNameCannotBeEmpty(){
        driver.findElement(LabelNameCannotBeEmpty).isDisplayed();
    }

    public void notifUrlEnteredIsInvalid(){
        driver.findElement(urlEnteredisInvalid).isDisplayed();
    }

    public void commentField(){
        driver.findElement(addNewCommentField).isDisplayed();
    }

    public void imageShowingInCardNameComment(){
        driver.findElement(ImageUsingUrlinCardNameComment).isDisplayed();
    }
}
