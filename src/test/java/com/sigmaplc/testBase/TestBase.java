package com.sigmaplc.testBase;

import com.sigmaplc.propertyreader.PropertyReader;
import com.sigmaplc.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(groups = {"Smoke","Sanity","Regression"})
    public void openBrowser() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
