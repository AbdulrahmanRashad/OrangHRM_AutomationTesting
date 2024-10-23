package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RecruitmentPage {
    // 1- Navigate to  "Vacancies Field"

    public WebElement VacanciesField(WebDriver myBrowser) {
        By xpath = By.xpath("//A[@class='oxd-topbar-body-nav-tab-item'][text()='Vacancies']");
        WebElement VacanciesFieldElement = myBrowser.findElement(xpath);

        return VacanciesFieldElement;
    }
    // 2- Navigate to the "Job Title" dropdown menu
    public static WebElement JobTitle(WebDriver myBrowser) {
        return myBrowser.findElement(By.cssSelector("i[class='oxd-icon bi-caret-down-fill oxd-select-text--arrow']"));
    }
    public static WebElement JobTitleOption1(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//div[contains(@role,'option')])[2]"));
    }

    // 3- Navigate to the "Vacancy" dropdown menu
    public static WebElement Vacancy(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//I[@data-v-bddebfba=''])[8]"));
    }

    public static WebElement VacancyOption(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//div[contains(@role,'option')])[2]"));
    }

    // 4- Navigate to the "Hiring Manager" dropdown menu
    public static WebElement hiringManager(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//DIV[@data-v-67d2aedf=''])[7]"));
    }

    public static WebElement HiringManagerOption(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//div[@role='option'])[2]"));
    }

    // 5- Navigate to the "Status" dropdown menu
    public static WebElement StatusField(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//DIV[@data-v-67d2aedf=''])[10]"));
    }

    public static WebElement getStatusOption(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//div[@role='option'])[2]"));
    }

    // 6- Navigate to the "Search" Button

    public static WebElement getSearchButton(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//BUTTON[@data-v-10d463b7=''])[2]"));
    }

    // 7- Navigate to the "the search record"
    public static WebElement SearchResult1(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span'])[1]"));

    }

    public static WebElement SearchResult2(WebDriver myBrowser) {
        return myBrowser.findElement(By.xpath("//DIV[@data-v-6c07a142=''][text()=' (Deleted)']"));

    }

}



