package com.hms.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

/**
 * Created by Aravinda on 02-Aug-16.
 */
public class SelectDropDownMenu {
    public static void selectDDM(){
        File path = new File("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        System.setProperty("webdriver.chrome.driver", path.getAbsolutePath());
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.w3schools.com/howto/howto_css_dropdown.asp");
        WebElement ddm;
        ddm = webDriver.findElement(By.className("dropbtn"));
        ddm.click();
        System.out.println("DONE");
    }
}
