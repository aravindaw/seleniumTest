package com.hms.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Aravinda on 02-Aug-16.
 */
public class SelectDropDownMenu {
    public static void selectDDM(){
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://www.w3schools.com/howto/howto_css_dropdown.asp");
        WebElement ddm;
        ddm = webDriver.findElement(By.className("dropbtn"));
        ddm.click();
        System.out.println("DONE");
    }
}
