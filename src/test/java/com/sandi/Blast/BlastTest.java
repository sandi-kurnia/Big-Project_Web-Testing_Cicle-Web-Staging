package com.sandi.Blast;

import com.sandi.base.TestBase;
import com.sandi.pages.BlastPage;
import javafx.scene.layout.Priority;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlastTest extends TestBase {

    BlastPage blast;

    public BlastTest(){

        super();
    }

    @BeforeMethod
    public void setup() throws InterruptedException{
        initialization();
        blast = new BlastPage();
    }

    @Test(priority = 0)
    public void User_Publish_a_Post_by_Input_Text_in_Title_and_Description(){
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickCreateBlastBtn();
        blast.clickTypeATittleField();
        blast.inputTypeATittleField();
        blast.clickTellYourStoryHereField();
        blast.inputTellYourStoryHereField();
        blast.clickPublishBtn();
    }

    @Test(priority = 1)
    public void User_Publish_a_Post_by_Input_Empty_Text_in_Title() throws InterruptedException {
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickCreateBlastBtn();
        blast.clickTypeATittleField();
        blast.inputEmptyTypeTittleField();
        blast.clickTellYourStoryHereField();
        blast.inputTellYourStoryHereField();
        blast.clickPublishBtn();
        Thread.sleep(3000);
        blast.getFieldParamaterNotComplete();
    }

    @Test(priority = 2)
    public void User_Insert_Files_By_Valid_Url(){
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickCreateBlastBtn();
        blast.inputTypeATittleField();
        blast.inputTellYourStoryHereField();
        blast.clickInsertFilesBtn();
        blast.clickInsertFilesByUrlBtn();
        blast.clickInsertFilesByUrlField();
        blast.insertFilesByValidUrl();
        blast.clickAddBtn();
        blast.clickUploadInsertImage();
    }

    @Test(priority = 3)
    public void User_Insert_Files_By_Empty_Url() throws InterruptedException {
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickCreateBlastBtn();
        blast.inputTypeATittleField();
        blast.inputTellYourStoryHereField();
        blast.clickInsertFilesBtn();
        blast.clickInsertFilesByUrlBtn();
        blast.clickInsertFilesByUrlField();
        blast.insertFilesByEmptyUrl();
        blast.clickAddBtn();
        Thread.sleep(3000);
        blast.getUrlenteredIsInvalid();
    }

    @Test(priority = 4)
    public void User_Insert_Files_By_Upload_Files()throws InterruptedException{
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickCreateBlastBtn();
        blast.inputTypeATittleField();
        blast.inputTellYourStoryHereField();
        blast.clickInsertFilesBtn();
        blast.clickUploadFilesBtn();
        blast.clickBrowseFileBtn();
        Thread.sleep(4000);
        blast.clickUploadBtnByBrowseFile();
        Thread.sleep(3000);
    }

    @Test(priority = 5)
    public void User_set_cheers_on_blast_by_input_text()throws InterruptedException{
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickBlastDetail();
        blast.clickCheersBtn();
        blast.clickCheersField();
        blast.inputTextOnCheersField();
        blast.clickCheckCheersBtn();
        blast.getCreateCheersOnPostSuccessful();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void User_set_cheers_on_blast_by_input_empty_text()throws InterruptedException{
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickBlastDetail();
        blast.clickCheersBtn();
        blast.clickCheersField();
        blast.inputEmptyTextOnCheerField();
        blast.clickCheckCheersBtn();
        blast.getCheersCannotBeEmpty();
        Thread.sleep(3000);
    }

    @Test(priority = 7)
    public void User_delete_cheers_on_blast()throws InterruptedException{
        blast.clickCicleTeams();
        blast.clickBlastMenu();
        blast.clickBlastDetail();
        blast.clickBubbleCheers();
        blast.clickDeleteCheers();
        blast.deleteCheersOnPostSuccessful();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
