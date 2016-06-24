package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

/**
 * Created by TironM on 24-Jun-16.
 */

public class TestBase {
    @Parameters({"browserName", "url"})
    @BeforeMethod
    public void setup(@Optional String browserName, @Optional String url){
        WebDriverManager.setDriver(WebDriverManager.chooseDriver(browserName));
        WebDriverManager.baseUrl = url;
    }

    @AfterMethod
    public void close(){
        WebDriverManager.getDriver().close();
    }
}
