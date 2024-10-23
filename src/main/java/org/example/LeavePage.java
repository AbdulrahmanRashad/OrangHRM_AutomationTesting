package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeavePage {

    // Navigate to the Leave Entitlement page
    public WebElement leaveMenu(WebDriver driver) {
        return driver.findElement(By.xpath("//span[text()='Leave']"));
    }


    public WebElement entitlementsMenu(WebDriver driver) {
        return driver.findElement(By.xpath("//span[@class='oxd-topbar-body-nav-tab-item'][contains(.,'Entitlements')]"));
    }

    public WebElement addEntitlement(WebDriver driver) {
        return driver.findElement(By.xpath("//a[@href='#'][contains(.,'Add Entitlements')]"));
    }
    // Fill in the form
    public WebElement employeeNameField(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@placeholder='Type for hints...']"));
    }

    public WebElement employeeOption(WebDriver driver) {
        return driver.findElement(By.xpath("(//div[contains(@role,'option')])[1]"));
    }

    public WebElement leaveTypeDropdown(WebDriver driver) {
        return driver.findElement(By.xpath("//div[contains(@class, 'oxd-select-text')]"));
    }

    public WebElement leaveTypeOption(WebDriver driver) {
        return driver.findElement(By.xpath("//span[text()='CAN - Bereavement']"));
    }

    public WebElement entitlementField(WebDriver driver) {
        return driver.findElement(By.xpath("(//INPUT[@data-v-1f99f73c=''])[2]"));
    }

    // Submit the form
    public WebElement saveButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@type='submit']"));
    }

    public WebElement confirmButton(WebDriver driver) {
        return driver.findElement(By.xpath("//button[@type='button'][contains(.,'Confirm')]"));
    }

    public WebElement Result(WebDriver driver) {
        return driver.findElement(By.xpath("(//div[contains(.,'Added')])[13]"));
    }

}
