package Tests;

import Assertions.CustomAssertions;
import Steps.HomeSteps;
import Steps.ProductSteps;
import org.testng.annotations.Test;

public class ProductTest extends BaseTest
{
    HomeSteps homeSteps = new HomeSteps(driver);
    ProductSteps productSteps = new ProductSteps(driver);

    @Test(description = "Scenario 2: All elements of the product are displayed")
    public void elementsIsDisplayed()
    {
        visit("https://www.demoblaze.com/");
        productSteps.waitTime(3);

        homeSteps.clickProduct();
        productSteps.waitTime(5);

        CustomAssertions.isTextSame(productSteps.getProductName(),"Samsung galaxy s6");
        CustomAssertions.isTextSame(productSteps.getDescription(), "The Samsung Galaxy S6 is powered by 1.5GHz " +
                "octa-core Samsung Exynos 7420 processor and it comes with 3GB of RAM. The phone packs 32GB of internal " +
                "storage cannot be expanded.");
        CustomAssertions.isTextSame(productSteps.getPriceText(), "$360 *includes tax");
        CustomAssertions.isElementDisplayed(productSteps.isImageDisplayed());
        CustomAssertions.isElementDisplayed(productSteps.osButtonDisplayed());
    }

    @Test(description = "Scenario 3: Add product and browser alert display")
    public void addProduct()
    {
        visit("https://www.demoblaze.com/");
        productSteps.waitTime(3);

        homeSteps.clickProduct();
        productSteps.waitTime(5);

        productSteps.clickAddProductButton();
        CustomAssertions.isTextSame(productSteps.getTextAlert(), "Product added");
        productSteps.waitTime(5);
        productSteps.pressOkAlert();
    }
}
