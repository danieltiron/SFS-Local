package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Stack;

/**
 * Created by TironM on 22-Jun-16.
 */

public class DriverManager {
    public static WebDriver driver = null;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver d) {
        if (driver == null) {
            driver = d;
        }
    }

    public static WebDriver chooseDriver(String browserName){
        if (browserName.contains("firefox")){
            driver = new FirefoxDriver();
            return driver;
        }
        if (browserName.contains("chrome")){
            driver = new ChromeDriver();
            return driver;
        }
        return driver;
    }
}
