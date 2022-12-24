package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class BaseTest
{
    WebDriver driver = StartDriver();
    @BeforeTest(alwaysRun = true)
    private WebDriver StartDriver()
    {
        System.setProperty("webdriver.chrome.driver", "/Users/jxd0522/Desktop/bootcamp/Other Stuff/Capstone_Project/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    @AfterClass(alwaysRun = true)
    public void exitDriver()
    {
        driver.close();
    }

    public void visit(String url)
    {
        driver.get(url);
    }
}
