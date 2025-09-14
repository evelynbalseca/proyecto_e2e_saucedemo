package com.saucedemo.configs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;
import java.util.Map;

public class WebDriverManager {

    public static WebDriver driver;

    public static WebDriver getDriver()
    {


        if(driver == null)
        {
            System.setProperty("webdriver.edge.driver","src\\test\\resources\\webdrivers\\msedgedriver.exe");
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--start-maximized");




            driver = new EdgeDriver(options);

        }
        return driver;


    }

}
