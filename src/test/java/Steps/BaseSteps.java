package Steps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseSteps
{
    WebDriver driver;


    public BaseSteps(WebDriver driver)
    {
        this.driver = driver;
    }

    public String getText(WebElement locator)
    {
        return locator.getText();
    }

    public Boolean isDisplayed(WebElement locator)
    {
        try
        {
            return  locator.isDisplayed();
        }catch (NoSuchElementException e)
        {
            return false;
        }
    }

    public void waitTime(int seconds)
    {
        driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
    }

    public Alert waitAlert()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        return alert;
    }
}
