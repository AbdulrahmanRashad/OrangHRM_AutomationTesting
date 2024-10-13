import org.example.AdminPage;
import org.example.DashBoard;
import org.example.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static org.example.Main.*;


public class Test {

    WebDriver myBrowser = new ChromeDriver();
    LoginPage login;
    DashBoard dashBoard;
    AdminPage admin;

    @BeforeClass
    public void setUp() throws InterruptedException {
        // Navigating Webpage
        myBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        myBrowser.manage().window().maximize();
        Thread.sleep(3000);
    }

    @AfterClass
    public void tearDown() {
        myBrowser.quit();

    }


//    1. test case for Login Page

    @org.testng.annotations.Test(priority = 1, testName = "ValidLogin")
    public void validLogin() throws InterruptedException {

        login = new LoginPage();

        login.UsernameField(myBrowser).sendKeys("Admin");
        login.PasswordField(myBrowser).sendKeys("admin123");
        login.SubmitButton(myBrowser).click();
        Thread.sleep(3000);

        // Assert URL after login
        Assert.assertEquals(myBrowser.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

        //Second Assertion
        String actualResult = login.DashBoardText(myBrowser).getText();
        Assert.assertTrue(actualResult.contains("Dashboard"));

    }

//    2. test cases for Admin Page

    @org.testng.annotations.Test(dependsOnMethods = "validLogin", priority = 2, testName = "navigateToAdminMenu")
    public void navigateToAdminMenu() throws InterruptedException {
        dashBoard = new DashBoard();


        dashBoard.AdminTap(myBrowser).click();
        Thread.sleep(2000);

        // Assert URL after navigating to Admin menu
        Assert.assertTrue(myBrowser.getCurrentUrl().contains("/admin"));

        //Assert User System Text
        Assert.assertTrue(dashBoard.SystemUserText(myBrowser).getText().contains("System Users"));

    }

    @org.testng.annotations.Test(dependsOnMethods = "navigateToAdminMenu")
    public void createUser() throws InterruptedException {
        admin = new AdminPage();

        admin.getAddButton(myBrowser).click();
        Thread.sleep(2000);

        admin.getUserRole(myBrowser).click();
        Thread.sleep(1500);
        admin.getDropDownOption(myBrowser).click();

        admin.getUserStatus(myBrowser).click();
        Thread.sleep(1500);
        admin.getDropDownOption2(myBrowser).click();

        admin.getEmployeeSearch(myBrowser).sendKeys("m");
        Thread.sleep(3000);
        admin.getEmployeeOption(myBrowser).click();

        admin.getUsername(myBrowser).sendKeys("Abdulrahman32");
        admin.getNewPassword(myBrowser).sendKeys("User123");
        admin.getConfirmPassword(myBrowser).sendKeys("User123");
        admin.getSaveButton(myBrowser).click();
        Thread.sleep(6000);

        // Navigate for search result
        admin.SearchField(myBrowser).sendKeys("Abdulrahman32");
        admin.SearchButton(myBrowser).click();

        Thread.sleep(2000);
        // Assert Creating Admin user
        String actualResult = admin.ResultFound(myBrowser).getText();
        Assert.assertTrue(actualResult.contains("(1) Record Found"));

    }
}