package com.app.pom;

import com.app.testbase.PageObject;
import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.allure.annotations.Step;

import java.io.IOException;

/**
 * Created by Oscar Garcia on 8/2/2016.
 */
public class WebPage extends PageObject {

    public WebPage(WebDriver driver, String url) throws IOException {
        super(driver, url);
        initObjects();
    }

    @Step
    public void initObjects(){

    }
}
