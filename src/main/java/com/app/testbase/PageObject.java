package com.app.testbase;

import com.app.utils.Conversion;
import com.app.utils.PropertyLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by Oscar Garcia on 8/2/2016.
 */
public class PageObject {

    private final static Logger logger = LoggerFactory.getLogger(PageObject.class);

    protected WebDriver _driver;
    protected String _url;
    protected WebDriverWait _wait;


    public static PropertyLoader property = new PropertyLoader();

    public String getURL() {
        return _url;
    }


    public void setImplicitWait(int waitSec) {
        _wait = (WebDriverWait) new WebDriverWait(_driver, waitSec)
                .ignoring(WebDriverException.class);
    }

    public boolean isLoaded() {
        String url = _driver.getCurrentUrl();
        return url.toUpperCase().equalsIgnoreCase(_url);
    }

    public PageObject(WebDriver driver,String url) throws IOException {
        _driver = driver;
        _url = url;
        setImplicitWait(Conversion.StringToInt(property.loadProperty("implicitWait")));
    }
    /**
     * Ask the browser to load this page.
     * @throws IOException
     * @throws InterruptedException
     */
    public void load() throws IOException, InterruptedException {
        // Special attention here
        //_driver.get(_url);
        logger.info("Injecting JS on Client: In Progress");
        //Utils.injectJS(_driver);
        logger.info("Injection JS on Client: Complete");
        //Often times, the page will get some initial configuration before it's ready.
        //Utils.waitForJS(_driver);
    }

}

