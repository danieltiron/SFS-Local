package tests;


import framework.GoogleHomepage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

/**
 * Created by TironM on 17-Jun-16.
 */

public class SmokeTests{
    private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    @Parameters("url")
    @BeforeMethod
    public void setup(@Optional String url){
        driver.set(new FirefoxDriver());
        driver.get().get(url);
    }

    @AfterMethod
    public void close(){
        driver.get().close();
    }

    @Test(groups = "smoke")
    public void test1(){
        new GoogleHomepage(driver.get())
                .numaraAiurea()
                .searchFor("sad");
    }

    @Test(groups = "smoke")
    public void test2(){
        new GoogleHomepage(driver.get())
                .numaraAiurea()
                .searchFor("dasdsad");
    }

    @Test(groups = "smoke")
    public void test3(){
        new GoogleHomepage(driver.get())
                .numaraAiurea()
                .searchFor("s saad ad");
    }
//
//    @Test
//    public void test4(){
//        new GoogleHomepage()
//                .searchFor("sdafd d");
//    }
//
//    @Test
//    public void test5(){
//        new GoogleHomepage()
//                .searchFor("sdafd d");
//    }
//
//    @Test
//    public void test6(){
//        new GoogleHomepage()
//                .searchFor("sdafd d");
//    }
//
//    @Test
//    public void test7(){
//        new GoogleHomepage()
//                .searchFor("sdafd d");
//    }
//
//    @Test
//    public void test8(){
//        new GoogleHomepage()
//                .searchFor("sdafd d");
//    }
}
