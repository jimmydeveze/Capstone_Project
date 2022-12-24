package Steps;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeSteps extends BaseSteps
{
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);

    public Boolean isLisDisplayed()
    {
        return  homePage.getLefDivLocator().isDisplayed();
    }

    public Boolean isCategoriesDisplayed()
    {
        return isDisplayed(homePage.getCategorieslocator());
    }

    public Boolean isPhonesDisplayed()
    {
        return isDisplayed(homePage.getPhonesLocator());
    }

    public Boolean isLaptopsDisplayed()
    {
        return isDisplayed(homePage.getLaptopsLocator());
    }

    public Boolean isMonitorDisplayed()
    {
        return isDisplayed(homePage.getMonitorsLocator());
    }

    public void clickProduct()
    {
        homePage.getProductLocator().click();
    }

    public void clickCart()
    {
        homePage.getCartLinkLocator().click();
    }

    public HomeSteps(WebDriver driver)
    {
        super(driver);
    }
}
