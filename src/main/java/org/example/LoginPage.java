package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage {


    public WebElement UsernameField(WebDriver myBrowser){
        By username = By.name("username");
        WebElement UserNameElement = myBrowser.findElement(username);

        return UserNameElement;
    }

    public WebElement PasswordField(WebDriver myBrowser){
        By password = By.cssSelector("input[name='password']");
        WebElement PasswordElement = myBrowser.findElement(password);

        return PasswordElement;
    }

    public WebElement SubmitButton(WebDriver myBrowser){
        By Submit = By.cssSelector("button[type='submit']");
        WebElement SubmitElement = myBrowser.findElement(Submit);

        return SubmitElement;
    }




}
