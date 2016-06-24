package tests;


import framework.GoogleHomepage;
import org.testng.annotations.*;


/**
 * Created by TironM on 17-Jun-16.
 */

public class SmokeTests extends TestBase{
    @Test(groups = "smoke")
    public void test1(){
        new GoogleHomepage()
                .refreshAiurea()
                .searchFor("sad");
    }

    @Test(groups = "smoke")
    public void test2(){
        new GoogleHomepage()
                .refreshAiurea()
                .searchFor("dasdsad");
    }

    @Test(groups = "smoke")
    public void test3(){
        new GoogleHomepage()
                .refreshAiurea()
                .searchFor("s saad ad");
    }
}
