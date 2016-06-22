package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.DriverManager;

/**
 * Created by TironM on 17-Jun-16.
 */

public class GoogleHomepage extends PageBase{
    @FindBy(name = "q")
    private WebElement searchInput;

    public GoogleHomepage searchFor(String text){
        searchInput.sendKeys(text);
        searchInput.submit();
        return this;
    }
}
