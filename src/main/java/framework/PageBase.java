package framework;

import org.openqa.selenium.support.PageFactory;
import tests.DriverManager;

/**
 * Created by TironM on 22-Jun-16.
 */
public class PageBase {
    public PageBase(){
        PageFactory.initElements(DriverManager.getDriver(), this);
    }
}
