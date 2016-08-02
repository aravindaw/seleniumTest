package com.hms.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.junit.After;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;

/**
 * Created by Aravinda on 02-Aug-16.
 */
public class DropDownTest {

    private static WebDriver webDriver;

    @Before
    public static void openBrowser() {
        File path = new File("/usr/bin/chromedriver");
        System.setProperty("webdriver.chrome.driver", path.getAbsolutePath());
        webDriver = new ChromeDriver();
    }

    @Test
    public static void selectDropDdownMenu() {
        webDriver.get("https://www.wikipedia.org");
        WebElement ddm;
        ddm = webDriver.findElement(By.id("searchLanguage"));
        try {
            Thread.sleep(1000);
            ddm.click();
            Thread.sleep(1000);
            new Select(ddm).selectByValue("ca");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public static void closeTheDrive() {
        webDriver.quit();
        System.out.println("DONE...");
    }
}
