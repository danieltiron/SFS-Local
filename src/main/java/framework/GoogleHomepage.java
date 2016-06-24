package framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by TironM on 17-Jun-16.
 */

public class GoogleHomepage extends PageBase{
    @FindBy(name = "q")
    private WebElement searchInput;

    public GoogleHomepage() {
        super();
        pageUrl = "/dsasadada";
    }

    @Override
    public GoogleHomepage openSolution() {
        super.openSolution();
        return this;
    }

    @Override
    public GoogleHomepage openPage() {
        super.openPage();
        return this;
    }

    public GoogleHomepage searchFor(String text){
        searchInput.sendKeys(text);
        searchInput.submit();
        return this;
    }

    public GoogleHomepage refreshAiurea(){
        for (int i = 0; i < 5; i++) {
            driver.navigate().refresh();
        }
        return this;
    }

    public String checkPageTitle(){
        return driver.getTitle();
    }
}
