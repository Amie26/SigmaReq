package com.sigmaplc.pages;

import com.sigmaplc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class GenericPage extends Utility {

    private static final Logger log = LogManager.getLogger(GenericPage.class.getName());

    @FindBy(xpath = "//div[contains(text(),'Generic')]")
    WebElement _genericLink;

    public void clickOnGenericLink(){
        Reporter.log("Click on Generic Link" + _genericLink.toString() + "<br>");
        clickOnElement(_genericLink);
        log.info("Clicking on Generic Link" + _genericLink.toString());

    }


}
