package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductPage extends BasePage
{
    @FindBy(how = How.LINK_TEXT, using = "Add to cart")
    private WebElement addCarrButton;

    @FindBy(how = How.XPATH, using = "//*[@id=\"more-information\"]/p")
    private WebElement productDescriptionLocator;

    @FindBy(how = How.CLASS_NAME, using = "price-container")
    private WebElement priceLocator;

    @FindBy(how = How.CLASS_NAME, using = "name")
    private  WebElement productNameLocator;

    @FindBy(how = How.XPATH, using = "//img[@width=\"400\"]")
    private WebElement productImageLocator;

    public WebElement getProductImageLocator()
    {
        return  productImageLocator;
    }

    public WebElement getProductNameLocator()
    {
        return productNameLocator;
    }

    public WebElement getPriceLocator()
    {
        return  priceLocator;
    }

    public WebElement getProductDescriptionLocator()
    {
        return productDescriptionLocator;
    }

    public WebElement getAddCarrButton()
    {
        return addCarrButton;
    }

    public ProductPage(WebDriver driver)
    {
        super(driver);
    }
}
