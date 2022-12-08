package com.sandi.pages;

import com.sandi.base.TestBase;
import org.openqa.selenium.By;

public class BlastPage extends TestBase {

    public BlastPage(){
        driver.navigate().to("https://staging.cicle.app/companies/61eba2c85080f47b25ddc8f8/teams/636deac7609ac90f8426d64d/blasts/636deac7609ac90f8426d6c5");
    }

        By cicleTeams = By.xpath("//*[contains(text(),'Big Project')]");
        By blastMenu = By.xpath("//*[contains(text(),'Blast!')]");

        By blastDetail = By.className("Post_link__3u8eF");
        By createBlastBtn = By.xpath("//*[contains(text(),'Create Blast')]");
        By typeATittleField = By.xpath("//*[contains(@placeholder,'Type a title...')]");
        By tellYourStoryHereField = By.xpath("//*[@id=\"root\"]/div[3]/div[2]/div/div/div[2]/div/div/div[3]/div");
        By publishBtn = By.xpath("//*[contains(text(),'Publish')]");
        By insertFilesBtn = By.id("insertFiles-1");
        By insertFilesByUrlBtn = By.id ("filesByURL-1");
        By insertFilesByUrlField = By.id("fr-files-by-url-layer-text-1");
        By uploadFilesbtn = By.id("filesUpload-1");
        By browseFileBtn = By.xpath("//*[@id=\"fr-files-upload-layer-1\"]/div/div[2]/input");
        By addBtn = By.xpath("//*[contains(text(),'Add')]");
        By uploadBtnOnFiles = By.id("fr-file-insert-button-0");

        By uploadBtnOnUploadFiles = By.xpath("//*[contains(@id,'fr-file-insert-button-0')]/child::node()[2]");
//Cheers
        By cheersBtn = By.xpath("//*[contains(@class,'CheersButton_buttonCheers__2mJix')]");
        By cheersField = By.xpath("//*[contains(@placeholder,\"Give'em cheers!\")]");
        By checkCheersBtn = By.xpath("//*[contains(@data-testid,\"CheckCircleOutlineIcon\")]");
        By cancelCheersBtn = By.xpath("//*[contains(@data-testid,\"HighlightOffIcon\")]");

        By bubbleOfCheersUser = By.className("CheersItem_content__3kzfx");

        By deleteCheersUserBtn = By.xpath("//*[contains(@data-testid,'DeleteIcon')]");


//Asssertion
        By fieldParamaterNotComplete = By.xpath("//*[@id=\"notistack-snackbar\"]");
        By urlenteredIsInvalid = By.xpath("//*[contains(text(),'Url entered is invalid. Please try again.')]");

        By createCheersOnPostSuccessful = By.xpath("//*[contains(text(),'Create cheers on post successful')]");

        By cheerCannotBeEmpty = By.xpath("//*[contains(text(),'Cheer cannot be empty')]");

        By deleteCheersOnPostSuccessful = By.xpath("//*[contains(text(),'Delete cheers on post successful')]");

        By insertFilesByUrlOnDescField = By.xpath("//*[contains(@class,'fr-element fr-view')]/p/child::node()[2]");



//--------------------------------------------------------------------------------

    public void clickCicleTeams(){
        driver.findElement(cicleTeams).click();
    }
    public void clickBlastMenu(){
        driver.findElement(blastMenu).click();
    }
    public void clickBlastDetail(){
        driver.findElement(blastDetail).click();
    }
    public void clickCreateBlastBtn(){
        driver.findElement(createBlastBtn).click();
    }
    public void clickTypeATittleField(){
        driver.findElement(typeATittleField).click();
    }
    public void inputTypeATittleField(){
        driver.findElement(typeATittleField).sendKeys("Big Project Sekolah QA");
    }

    public void inputEmptyTypeTittleField(){
        driver.findElement(typeATittleField).sendKeys("");
    }

    public void clickTellYourStoryHereField(){
        driver.findElement(typeATittleField).click();
    }
    public void inputTellYourStoryHereField(){
        driver.findElement(tellYourStoryHereField).sendKeys("Semangat !!");
    }
    public void clickPublishBtn(){
        driver.findElement(publishBtn).click();
    }
    public void clickInsertFilesBtn(){
        driver.findElement(insertFilesBtn).click();
    }
    public void clickInsertFilesByUrlBtn(){
        driver.findElement(insertFilesByUrlBtn).click();
    }
    public void clickInsertFilesByUrlField(){
        driver.findElement(insertFilesByUrlField).click();
    }
    public void insertFilesByValidUrl(){
        driver.findElement(insertFilesByUrlField).sendKeys("https://akcdn.detik.net.id/visual/2020/01/30/fd8a89f8-cd07-4d7e-9a24-17c440c90e4d_169.png?w=650");
    }
    public void insertFilesByEmptyUrl(){
        driver.findElement(insertFilesByUrlField).sendKeys("");
    }

    public void clickUploadFilesBtn(){
        driver.findElement(uploadFilesbtn).click();
    }
    public void clickBrowseFileBtn(){
        driver.findElement(browseFileBtn).sendKeys("/Users/sandikurnia/IdeaProjects/BigProject-CicleWebStaging/src/filetest/AndroidStudio.png");
    }
    public void clickAddBtn(){
        driver.findElement(addBtn).click();
    }
    public void clickUploadInsertImage(){
        driver.findElement(uploadBtnOnFiles).click();
    }

    public void clickUploadBtnByBrowseFile(){
        driver.findElement(uploadBtnOnUploadFiles).click();
    }

//Cheers
    public void clickCheersBtn(){
        driver.findElement(cheersBtn).click();
    }
    public void clickCheersField(){
        driver.findElement(cheersField).click();
    }

    public void inputTextOnCheersField(){
        driver.findElement(cheersField).sendKeys("Noted Ka...");
    }

    public void inputEmptyTextOnCheerField(){
        driver.findElement(cheersField).sendKeys("");
    }

    public void clickCheckCheersBtn(){
        driver.findElement(checkCheersBtn).click();
    }

    public void clickCancelCheersBtn(){
        driver.findElement(cancelCheersBtn).click();
    }

    public void clickBubbleCheers(){
        driver.findElement(bubbleOfCheersUser).click();
    }

    public void clickDeleteCheers(){
        driver.findElement(deleteCheersUserBtn).click();
    }

//    Assertion

    public void getBlastDetail(){
        driver.findElement(blastDetail).isDisplayed();
    }
    public void getFieldParamaterNotComplete(){
        driver.findElement(fieldParamaterNotComplete).isDisplayed();
    }
    public void getUrlenteredIsInvalid(){ driver.findElement(urlenteredIsInvalid).isDisplayed();}
    public void getCreateCheersOnPostSuccessful(){
        driver.findElement(createCheersOnPostSuccessful).isDisplayed();
    }
    public void getCheersCannotBeEmpty(){
        driver.findElement(cheerCannotBeEmpty).isDisplayed();
    }

    public void deleteCheersOnPostSuccessful(){
        driver.findElement(deleteCheersOnPostSuccessful).isDisplayed();
    }

    public void getFilesByUrlOnDesc(){
        driver.findElement(insertFilesByUrlOnDescField).isDisplayed();
    }
}
