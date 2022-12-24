package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage
{
    @FindBy(how = How.XPATH, using = "//div[@class=\"col-lg-3\"]")
    private  WebElement lefDivLocator;

    @FindBy(how = How.LINK_TEXT, using = "CATEGORIES")
    private WebElement categorieslocator;

    @FindBy(how = How.LINK_TEXT, using = "Phones")
    private WebElement phonesLocator;

    @FindBy(how = How.LINK_TEXT, using = "Laptops")
    private  WebElement laptopsLocator;

    @FindBy(how = How.LINK_TEXT, using = "Monitors")
    private WebElement monitorsLocator;

    @FindBy(how = How.LINK_TEXT, using = "Samsung galaxy s6")
    private WebElement productLocator;

    @FindBy(how = How.LINK_TEXT, using = "Cart")
    private WebElement cartLinkLocator;

    public WebElement getCartLinkLocator()
    {
        return cartLinkLocator;
    }

    public WebElement getProductLocator()
    {
        return  productLocator;
    }

    public WebElement getLefDivLocator()
    {
        return lefDivLocator;
    }

    public WebElement getCategorieslocator()
    {
        return categorieslocator;
    }

    public WebElement getPhonesLocator()
    {
        return phonesLocator;
    }

    public WebElement getLaptopsLocator()
    {
        return laptopsLocator;
    }

    public WebElement getMonitorsLocator()
    {
        return monitorsLocator;
    }

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
}
