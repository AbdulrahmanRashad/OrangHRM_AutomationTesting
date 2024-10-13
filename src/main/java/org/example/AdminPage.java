package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminPage {

    public static WebElement getAddButton(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--secondary']"));
    }

    public static WebElement getUserRole(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("div[class='oxd-select-text-input']"));
    }

    public static WebElement getDropDownOption(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("//div[@role='option'][contains(.,'Admin')]"));
    }

    public static WebElement getUserStatus(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]"));
    }

    public static WebElement getDropDownOption2(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("//div[@role='option'][contains(.,'Enabled')]"));
    }

    public static WebElement getEmployeeSearch(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("input[placeholder='Type for hints...']"));
    }

    public static WebElement getEmployeeOption(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("//div[@role='listbox']"));
    }

    public static WebElement getUsername(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[2]"));
    }

    public static WebElement getNewPassword(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[3]"));
    }

    public static WebElement getConfirmPassword(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[4]"));
    }

    public static WebElement getSaveButton(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("button[type='submit']"));
    }

    public static WebElement SearchField(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[2]"));
    }

    public static WebElement SearchButton(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//BUTTON[@data-v-10d463b7=''])[2]"));
    }

    public static WebElement SystemUserText(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("h5[class='oxd-text oxd-text--h5 oxd-table-filter-title']"));
    }

    public static WebElement ResultFound(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("span[class='oxd-text oxd-text--span']"));
    }

    public static WebElement RemoveIcon(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("button[class='oxd-icon-button oxd-table-cell-action-space']"));
    }

    public static WebElement ConfirmRemoveButton(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']"));
    }
}
