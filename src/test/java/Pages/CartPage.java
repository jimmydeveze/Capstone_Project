package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage extends BasePage
{
    @FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div/div[2]/button")
    private WebElement placeOrderButtonLocator;

    @FindBy(how = How.ID, using = "totalp")
    private WebElement totalLocator;

    @FindBy(how = How.ID, using = "tbodyid")
    private WebElement listLocator;

    @FindBy(how = How.XPATH, using = "//img[@src=\"imgs/galaxy_s6.jpg\"]")
    private WebElement imageLocator;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tbodyid\"]/tr[1]/td[2]")
    private WebElement productNameLocator;

    @FindBy(how = How.XPATH, using = "//*[@id=\"tbodyid\"]/tr[1]/td[3]")
    private WebElement priceLocator;

    @FindBy(how = How.LINK_TEXT, using = "Delete")
    private WebElement deleteLinkLocator;

    public WebElement getDeleteLinkLocator()
    {
        return deleteLinkLocator;
    }

    public WebElement getPriceLocator()
    {
        return priceLocator;
    }

    public WebElement getProductNameLocator()
    {
        return  productNameLocator;
    }

    public WebElement getImageLocator()
    {
        return imageLocator;
    }

    public WebElement getListLocator()
    {
        return listLocator;
    }

    public WebElement getTotalLocator()
    {
        return totalLocator;
    }

    public WebElement getPlaceOrderButtonLocator()
    {
        return placeOrderButtonLocator;
    }

    public CartPage(WebDriver driver)
    {
        super(driver);
    }
}
