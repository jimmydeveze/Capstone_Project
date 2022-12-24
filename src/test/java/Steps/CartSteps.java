package Steps;

import Pages.CartPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartSteps extends BaseSteps
{
    CartPage cartPage = PageFactory.initElements(driver, CartPage.class);

    public Boolean isListDisplayed()
    {
        return cartPage.getListLocator().isDisplayed();
    }

    public Boolean isImageDisplayed()
    {
        return cartPage.getImageLocator().isDisplayed();
    }

    public Boolean IsPlaceOrderDisplayed()
    {
        return  cartPage.getPlaceOrderButtonLocator().isDisplayed();
    }

    public String getTitleText()
    {
        return cartPage.getProductNameLocator().getText();
    }

    public String getPriceText()
    {
        return cartPage.getPriceLocator().getText();
    }

    public String getTotalText()
    {
        return cartPage.getTotalLocator().getText();
    }

    public Boolean isDeleteDisplayed()
    {
        return  cartPage.getDeleteLinkLocator().isDisplayed();
    }

    public CartSteps(WebDriver driver)
    {
        super(driver);
    }
}
