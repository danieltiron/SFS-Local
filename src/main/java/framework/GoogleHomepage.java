package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by TironM on 17-Jun-16.
 */

public class GoogleHomepage{
    @FindBy(name = "q")
    private WebElement searchInput;

    private WebDriver driver;

    public GoogleHomepage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public GoogleHomepage searchFor(String text){
        searchInput.sendKeys(text);
        searchInput.submit();
        return this;
    }

    public GoogleHomepage numaraAiurea(){
        for (int i = 0; i < 5; i++) {
            driver.navigate().refresh();
        }
        return this;
    }

    public String checkPageTitle(){
        return driver.getTitle();

    }
}
