package Steps;

import Pages.ProductPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductSteps extends BaseSteps
{
    ProductPage productPage = PageFactory.initElements(driver, ProductPage.class);

    public Boolean isImageDisplayed()
    {
        return isDisplayed(productPage.getProductImageLocator());
    }

    public Boolean osButtonDisplayed()
    {
        return isDisplayed(productPage.getAddCarrButton());
    }

    public String getPriceText()
    {
        return getText(productPage.getPriceLocator());
    }

    public String getDescription()
    {
        return  getText(productPage.getProductDescriptionLocator());
    }

    public String getProductName()
    {
        return  getText(productPage.getProductNameLocator());
    }

    public void clickAddProductButton()
    {
        productPage.getAddCarrButton().click();
    }

    public ProductSteps(WebDriver driver)
    {
        super(driver);
    }

    public String getTextAlert()
    {
        return waitAlert().getText();
    }

    public void pressOkAlert()
    {
        waitAlert().accept();
    }
}
