package com.app.testcases;

import com.app.pom.WebPage;
import com.app.testbase.WebDriverBase;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Oscar Garcia on 8/2/2016.
 */
public class WebPageTest extends WebDriverBase{

    WebPage _page;

    @BeforeClass
    public void testInit(){
        _driver.get(websiteUrl);
       initPageObject();
    }

    @Override
    protected void initPageObject(){
        try {
            //strong typed page object
            _page = new WebPage(_driver, _driver.getCurrentUrl());
            //page object used by the base class
            _pageObject = _page;
            _pageObject.load();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test(groups ={"smoke"}, testName = "Home Page Search")
    public void playButton() {
        Assert.assertTrue(true);

    }

    @Test (groups ={"smoke"}, testName = "Home Page Search")
    public void playButton2() {
        Assert.assertTrue(true);

    }

    public void playButton3() {
        Assert.assertTrue(false);

    }


}
