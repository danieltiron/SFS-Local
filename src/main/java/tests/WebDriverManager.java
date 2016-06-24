package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by TironM on 22-Jun-16.
 */

public class WebDriverManager {
    public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static WebDriver d;

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void setDriver(WebDriver d) {
            driver.set(d);
    }

    public static WebDriver chooseDriver(String browserName){
        if (browserName.contains("firefox")){
            d = new FirefoxDriver();
            return d;
        }
        if (browserName.contains("chrome")){
            d = new ChromeDriver();
            return d;
        }
        return d;
    }
}
