package Tests;

import Assertions.CustomAssertions;
import Steps.CartSteps;
import Steps.HomeSteps;
import Steps.ProductSteps;
import org.testng.annotations.Test;

public class CartTest extends BaseTest
{
    HomeSteps homeSteps = new HomeSteps(driver);
    ProductSteps productSteps = new ProductSteps(driver);
    CartSteps cartSteps= new CartSteps(driver);

    @Test(description = "Scenario 4: Elements ara displayed in de Cart page")
    public void addProduct()
    {
        visit("https://www.demoblaze.com/");
        productSteps.waitTime(3);

        homeSteps.clickProduct();
        productSteps.waitTime(5);

        productSteps.clickAddProductButton();

        productSteps.pressOkAlert();

        homeSteps.clickCart();
        productSteps.waitTime(5);

        CustomAssertions.isElementDisplayed(cartSteps.isListDisplayed());
        CustomAssertions.isElementDisplayed(cartSteps.isImageDisplayed());
        CustomAssertions.isElementDisplayed(cartSteps.isDeleteDisplayed());

        CustomAssertions.isTextSame(cartSteps.getTitleText(), "Samsung galaxy s6");
        CustomAssertions.isTextSame(cartSteps.getPriceText(), "360");
        CustomAssertions.isTextSame(cartSteps.getTotalText(), "360");
    }
}
