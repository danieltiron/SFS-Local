package tests;


import framework.GoogleHomepage;
import org.testng.annotations.*;


/**
 * Created by TironM on 17-Jun-16.
 */

public class SmokeTests extends TestBase{
    @Test
    public void test1(){
        new GoogleHomepage()
                .openPage()
                .refreshAiurea()
                .searchFor("sad");
    }

    @Test
    public void test2(){
        new GoogleHomepage()
                .openSolution()
                .refreshAiurea()
                .searchFor("dasdsad");
    }

    @Test
    public void test3(){
        new GoogleHomepage()
                .openPage()
                .refreshAiurea()
                .searchFor("s saad ad");
    }
}
