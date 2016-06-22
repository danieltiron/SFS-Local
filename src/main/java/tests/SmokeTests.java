package tests;


import framework.GoogleHomepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by TironM on 17-Jun-16.
 */

public class SmokeTests{
    @Parameters({"browserName", "url"})
    @BeforeTest
    public void setup(@Optional String browserName, @Optional String url){
        DriverManager.setDriver(DriverManager.chooseDriver(browserName));
        DriverManager.getDriver().get(url);
    }

    @AfterTest
    public void close(){
        DriverManager.getDriver().close();
    }

    @Test
    public void test1(){
        new GoogleHomepage()
                .searchFor("sad");
    }

    @Test
    public void test2(){
        new GoogleHomepage()
                .searchFor("dasdsad");
    }

    @Test
    public void test3(){
        new GoogleHomepage()
                .searchFor("s saad ad");
    }

    @Test
    public void test4(){
        new GoogleHomepage()
                .searchFor("sdafd d");
    }
}
