package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {

    public static WebElement AdminTap(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
    }

    public static WebElement SystemUserText(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("h5[class='oxd-text oxd-text--h5 oxd-table-filter-title']"));
    }
}
