package com.sigmaplc.testSuite;

import com.sigmaplc.pages.AboutUsPage;
import com.sigmaplc.testBase.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutUsPageTest extends TestBase {

   // AboutUsPage aboutUsPage;


    @BeforeMethod
    public void setUp() {

    }

@Test
    public void clickOnAboutUsLink (){

    }



   @Test
    public void clickOnGenericLink(){

  }

   @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
