package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard {

    public static WebElement AdminTap(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("span[class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
    }



    public static WebElement DashBoardText(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("h6[class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']"));
    }
}
