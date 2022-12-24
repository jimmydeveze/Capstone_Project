package Assertions;

import org.testng.Assert;

public class CustomAssertions extends Assert
{
    public static void isElementDisplayed (Boolean isElementDisplayed)
    {
        String errorMessage = "The element is not displayed ";
        Assert.assertTrue(isElementDisplayed, errorMessage);
    }

    public static void isTextSame(String actual, String expected)
    {
        String errorMMessage = "The expected text was" + actual;
        Assert.assertEquals(actual, expected, errorMMessage);
    }
}
