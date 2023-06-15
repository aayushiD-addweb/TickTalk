package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class Hooks {
    public static WebDriver driver;
    @Before
    public void browser_setup() throws InterruptedException, IOException {
        System.setProperty("web-driver.chrome.driver", "/home/addweb/IdeaProjects/Contract/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        driver = new ChromeDriver(options); // Launch the Chrome browser with the configured options
        driver.manage().window().maximize();
        driver.get("https://ttstage.addwebprojects.com/");
        Thread.sleep(2000);
            TakesScreenshot login = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source0 = login.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source0, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/Login.png"));
            Thread.sleep(2000);
            System.out.println("Login Page Screenshot is captured");
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[1]/input[1]")).sendKeys("saurabhdhariwal.com@gmail.com");
        Thread.sleep(2000);
        //Password
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/div[1]/input")).sendKeys("addweb123");
        Thread.sleep(2000);
        //Login Button
        driver.findElement(By.xpath("/html/body/form/section/div/div/div/div/div[2]/button")).click();
        Thread.sleep(3000);
            TakesScreenshot Dashboard = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source1 = Dashboard.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source1, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/Dashboard.png"));
            Thread.sleep(2000);
            System.out.println("Dashboard Page Screenshot is captured");
        WebElement work = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/a"));
        work.click();
        Thread.sleep(2000);
        WebElement Contract = driver.findElement(By.xpath("/html/body/aside/div[2]/div[2]/ul/li[5]/div/a[1]"));
        Contract.click();
        Thread.sleep(2000);
            TakesScreenshot contract = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source2 = contract.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source2, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/contractpage.png"));
            Thread.sleep(2000);
            System.out.println("Contract Page Screenshot is captured");
        WebElement CreatContract = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[1]/div/a"));
        CreatContract.click();
        Thread.sleep(2000);
            TakesScreenshot contractform = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source3 = contractform.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source3, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/contractform.png"));
            Thread.sleep(2000);
            System.out.println("Login Page Screenshot is captured");
        WebElement Subjectfield = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input"));
        Subjectfield.click();
        Subjectfield.sendKeys("Test Ayushi.d");
        Thread.sleep(2000);
        WebElement StartDate = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[3]/div/input"));
        StartDate.click();
        StartDate.sendKeys("14-06-2023");
        Thread.sleep(2000);
        WebElement EndDate = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[4]/div/input"));
        EndDate.click();
        EndDate.sendKeys("14-06-2024");
        Thread.sleep(2000);
        WebElement ContractTypeDropdown = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]"));
        ContractTypeDropdown.click();
        WebElement Selectvalue = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[5]/div/div[1]/div/div[2]/ul/li[2]/a"));
        Selectvalue.click();
        Thread.sleep(2000);
        WebElement Contractvaluefield = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[6]/div/input"));
        Contractvaluefield.click();
        Contractvaluefield.sendKeys("100000");
        Thread.sleep(2000);
        WebElement Clientdropdown = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div/div[1]"));
        Clientdropdown.click();
        WebElement selectclient = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[2]/div[1]/div/div[1]/div/div[2]/ul/li[4]"));
        selectclient.click();
        Thread.sleep(2000);
        WebElement Savebutton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button"));
        Savebutton.click();
        Thread.sleep(4000);
            TakesScreenshot addedcontract = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source4 = addedcontract.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source4, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/contractdetail.png"));
            Thread.sleep(2000);
            System.out.println("Added contract is displayed on contract detail page Screenshot is captured");
        WebElement searchclient = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[2]/div/div"));
        searchclient.click();
        Thread.sleep(3000);
        WebElement searchclientname = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[2]/div/div/div/div[1]/input"));
        searchclientname.click();
        searchclientname.sendKeys("John_new");
        Thread.sleep(2000);
            TakesScreenshot searcheddetail = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source5 = searcheddetail.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source5, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/searcheddata.png"));
            Thread.sleep(2000);
            System.out.println("Searched detail is displayed in client search on contract Page Screenshot is captured");
        WebElement clcikonsearchname = driver.findElement(By.xpath("/html/body/div[1]/section/div[2]/form/div/div[2]/div/div/div/div[2]/ul/li/a"));
        clcikonsearchname.click();
        Thread.sleep(3000);
        WebElement clickonaction = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/div/a"));
        clickonaction.click();
        Thread.sleep(2000);
            TakesScreenshot datatable = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source6 = datatable.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source6, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/searcheddetails.png"));
            Thread.sleep(2000);
            System.out.println("Searched date ia displayed on contract detail Page Screenshot is captured");
            Thread.sleep(3000);
        WebElement Editcontract = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/div/div/a[4]"));
        Editcontract.click();
        Thread.sleep(4000);
            TakesScreenshot Editdetails = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source7 = Editdetails.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source7, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/Editform.png"));
            Thread.sleep(2000);
            System.out.println("Edit Page Screenshot is captured");
        WebElement SubjectfieldEdit = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[1]/div[1]/div/input"));
        SubjectfieldEdit.click();
        SubjectfieldEdit.sendKeys("Darji");
        Thread.sleep(4000);
        WebElement savebutton1 = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/form/div/div[3]/button"));
        savebutton1.click();
        Thread.sleep(4000);
        WebElement clickonaction1 = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/div/a"));
        clickonaction1.click();
        Thread.sleep(4000);
        WebElement deleteaction = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[8]/div/div/div/a[5]"));
        deleteaction.click();
        Thread.sleep(4000);
            TakesScreenshot Deletecontract = (TakesScreenshot) driver;
            Thread.sleep(2000);
            //Saving the screenshot in desired location
            File source8 = Deletecontract.getScreenshotAs(OutputType.FILE);
            Thread.sleep(2000);
            //Path to the location to save screenshot
            FileHandler.copy(source8, new File("/home/addweb/IdeaProjects/TickTalkContract/src/test/Screenshots/Deletecontract.png"));
            Thread.sleep(2000);
            System.out.println("Delete contract pop-up Screenshot is captured");
        WebElement confirmationdelete = driver.findElement(By.xpath("/html/body/div[8]/div/div[3]/button[1]"));
        confirmationdelete.click();
        Thread.sleep(3000);
        driver.quit();
    }
    @After
    public void Teardown()
    {
        driver.quit();
    }
    public WebDriver getDriver()
    {
        return driver;
    }
}

