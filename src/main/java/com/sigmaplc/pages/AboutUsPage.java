package com.sigmaplc.pages;

import com.sigmaplc.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AboutUsPage extends Utility {

    private static final Logger log = LogManager.getLogger(AboutUsPage.class.getName());

    @FindBy(xpath = "//header/div[1]/div[1]/div[2]/nav[1]/ul[2]/li[1]/a[1]")
    WebElement _aboutUsLink;

    @FindBy(xpath = "//strong[contains(text(),'About Us')]")
    WebElement _actualAboutUsMessage;





    public void clickOnAboutUsLink () throws InterruptedException {
        Reporter.log("Clicking on About Us Link" + _aboutUsLink.toString() + "<br>");
        Thread.sleep(500);
        clickOnElement(_aboutUsLink);
        log.info("Click on About us link" + _aboutUsLink.toString());

    }

    public String actualAboutUsMessage() throws InterruptedException {
        Reporter.log( "Actual Message on About Us Page" + _actualAboutUsMessage.toString() + "<br>");
        Thread.sleep(500);
        log.info("About Us Message Verification" + _actualAboutUsMessage.toString());
        return getTextFromElement(_actualAboutUsMessage);
    }




}
