package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.WebDriverManager;

/**
 * Created by TironM on 22-Jun-16.
 */

class PageBase {
    WebDriver driver = WebDriverManager.getDriver();
    String pageUrl = "/";

    PageBase(){
        PageFactory.initElements(driver, this);
    }

    PageBase openSolution(){
        WebDriverManager.openSolution();
        return this;
    }

    PageBase openPage(){
        WebDriverManager.openPage(pageUrl);
        return this;
    }
}
