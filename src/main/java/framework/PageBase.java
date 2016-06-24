package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import tests.WebDriverManager;

/**
 * Created by TironM on 22-Jun-16.
 */
public class PageBase {
    WebDriver driver = WebDriverManager.getDriver();
    PageBase(){
        PageFactory.initElements(driver, this);
    }
}
