import org.example.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;

public class Test {
    WebDriver myBrowser = new ChromeDriver();
    LoginPage login;
    DashBoard dashBoard;
    AdminPage admin;
    RecruitmentPage recruitment;
    LeavePage Leave;


    @BeforeClass
    public void setUp() throws InterruptedException {

        // Navigating Webpage
        myBrowser.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        myBrowser.manage().window().maximize();
        Thread.sleep(6000);

        // Initialize page objects
        login = new LoginPage();
        dashBoard = new DashBoard();
        admin = new AdminPage();
        recruitment = new RecruitmentPage();
    }

    @AfterClass
    public void tearDown() {
        myBrowser.quit();
    }


    // 1. Login Page
    @org.testng.annotations.Test(priority = 1, testName = "ValidLogin")
    public void validLogin() throws InterruptedException {
        login.UsernameField(myBrowser).sendKeys("Admin");
        login.PasswordField(myBrowser).sendKeys("admin123");
        login.SubmitButton(myBrowser).click();
        Thread.sleep(2000);


        // Assert on login page title
        Assert.assertEquals(myBrowser.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");

        // Assert on Navigation Bar
        String actualResult = dashBoard.DashBoardText(myBrowser).getText();
        Assert.assertTrue(actualResult.contains("Dashboard"));
    }

    // 2. Admin Page
    @org.testng.annotations.Test(dependsOnMethods = "validLogin", priority = 2, testName = "navigateToAdminMenu")
    public void navigateToAdminMenu() throws InterruptedException {
        Thread.sleep(1500);

        dashBoard.AdminTap(myBrowser).click();
        Thread.sleep(1500);

        // Assert on Admin menu
        Assert.assertTrue(myBrowser.getCurrentUrl().contains("/admin"));

        Assert.assertTrue(admin.SystemUserText(myBrowser).getText().contains("System Users"));
    }

    @org.testng.annotations.Test(dependsOnMethods = "navigateToAdminMenu", priority = 3, testName = "createUser")
    public void createUser() throws InterruptedException {
        admin.getAddButton(myBrowser).click();
        Thread.sleep(1500);

        admin.getUserRole(myBrowser).click();
        Thread.sleep(1500);
        admin.getDropDownOption(myBrowser).click();

        admin.getUserStatus(myBrowser).click();
        Thread.sleep(1500);
        admin.getDropDownOption2(myBrowser).click();

        admin.getEmployeeSearch(myBrowser).sendKeys("a");
        Thread.sleep(4000);
        admin.getEmployeeOption(myBrowser).click();

        admin.getUsername(myBrowser).sendKeys("Tahoun");
        admin.getNewPassword(myBrowser).sendKeys("User123");
        admin.getConfirmPassword(myBrowser).sendKeys("User123");
        admin.getSaveButton(myBrowser).click();
        Thread.sleep(10000);

        // Searching for the created user
        admin.SearchField(myBrowser).sendKeys("Tahoun");
        admin.SearchButton(myBrowser).click();
        Thread.sleep(2000);

        // Assert on Creating Admin user
        String actualResult2 = admin.ResultFound(myBrowser).getText();
        Assert.assertTrue(actualResult2.contains("(1) Record Found"));
    }

    @org.testng.annotations.Test(dependsOnMethods = "createUser", priority = 4, testName = "DeleteTheUser")
    public void DeleteTheUser() throws InterruptedException {
        admin.RemoveIcon(myBrowser).click();
        Thread.sleep(1000);
        admin.ConfirmRemoveButton(myBrowser).click();
        Thread.sleep(5000);

        // Searching for the removed user
        admin.SearchButton(myBrowser).click();
        Thread.sleep(2000);

        // Assert on removing the user
        String actualResult3 = admin.ResultFound(myBrowser).getText();
        Assert.assertTrue(actualResult3.contains("No Records Found"));
    }

    // 3. Recruitment Page
    @org.testng.annotations.Test(priority = 5, testName = "navigateToRecruitmentMenu")

    public void navigateToRecruitmentMenu() throws InterruptedException {
        Thread.sleep(3000);

        dashBoard.RecruitmentTap(myBrowser).click();
        Thread.sleep(3000);

    }

    @org.testng.annotations.Test(dependsOnMethods = "navigateToRecruitmentMenu", priority = 6, testName = "SearchForPayrollAdministratorVacancy")
    public void SearchForVacancy() throws InterruptedException {
        Thread.sleep(3000);

        recruitment.VacanciesField(myBrowser).click();
        Thread.sleep(6000);

        recruitment.JobTitle(myBrowser).click();
        Thread.sleep(3000);

        recruitment.JobTitleOption1(myBrowser).click();
        Thread.sleep(3000);


        recruitment.Vacancy(myBrowser).click();
        Thread.sleep(3000);

        recruitment.VacancyOption(myBrowser).click();
        Thread.sleep(3000);

        recruitment.StatusField(myBrowser).click();
        Thread.sleep(3000);

        recruitment.getStatusOption(myBrowser).click();
        Thread.sleep(3000);

        recruitment.getSearchButton(myBrowser).click();
        Thread.sleep(6000);

        // Assert on Vacancy Search result
        String actualResult4 = recruitment.SearchResult1(myBrowser).getText();
        Assert.assertTrue(actualResult4.contains("(1) Record Found"));

        String actualResult5 = recruitment.SearchResult2(myBrowser).getText();
        Assert.assertTrue(actualResult5.contains("Deleted"));

        Thread.sleep(3000);
    }

    // 4. Leave Page
    @org.testng.annotations.Test(dependsOnMethods = "SearchForVacancy", priority = 7, testName = "testAddLeaveEntitlement")
    public void testAddLeaveEntitlement() throws InterruptedException {
        Leave = new LeavePage();

        // Navigate to the Leave Entitlement page
        Thread.sleep(3000);
        Leave.leaveMenu(myBrowser).click();

        Thread.sleep(3000);
        Leave.entitlementsMenu(myBrowser).click();

        Thread.sleep(3000);
        Leave.addEntitlement(myBrowser).click();

        // Fill in the form
        Thread.sleep(3000);
        Leave.employeeNameField(myBrowser).sendKeys("d");

        Thread.sleep(3000);
        Leave.employeeOption(myBrowser).click();

        Thread.sleep(3000);
        Leave.leaveTypeDropdown(myBrowser).click();

        Thread.sleep(3000);
        Leave.leaveTypeOption(myBrowser).click();

        Thread.sleep(3000);
        Leave.entitlementField(myBrowser).sendKeys("10");

        // Submit the form
        Thread.sleep(3000);
        Leave.saveButton(myBrowser).click();

        Thread.sleep(3000);
        Leave.confirmButton(myBrowser).click();

        Thread.sleep(8000);

        // Assert on the
        String actualResult = Leave.Result(myBrowser).getText();
        Assert.assertTrue(actualResult.contains("Added"));
    }

}
