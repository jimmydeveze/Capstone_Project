package Tests;

import Assertions.CustomAssertions;
import Steps.HomeSteps;
import org.testng.annotations.Test;

public class HomeTest extends BaseTest
{
    HomeSteps homeSteps = new HomeSteps(driver);

    @Test(description = "Scenario 1: Categories list displayed")
    public void categoriesListDisplayed()
    {
        visit("https://www.demoblaze.com/");

        CustomAssertions.isElementDisplayed(homeSteps.isLisDisplayed());
        CustomAssertions.isElementDisplayed(homeSteps.isCategoriesDisplayed());
        CustomAssertions.isElementDisplayed(homeSteps.isPhonesDisplayed());
        CustomAssertions.isElementDisplayed(homeSteps.isLaptopsDisplayed());
        CustomAssertions.isElementDisplayed(homeSteps.isMonitorDisplayed());
    }
}
