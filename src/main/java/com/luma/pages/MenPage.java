package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class MenPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement hooverPantSize;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-size-143-item-175']")
    By pantSize;

    //******** Mouse Hover on product name Cronus Yoga Pant and click on colour Black.
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement hooverPantColour;
    @CacheLookup
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    By pantColour;

    //******** Mouse Hover on product name Cronus Yoga Pant and click on ‘Add To Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement mouseHooverToBoth;
    // By mouseHooverToBoth = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Add to Cart']")
    By addToCart;

    //******** Verify the text You added Cronus Yoga Pant to your shopping cart.
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    By verifyShoppingCart;

    //********** Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;


    public void clickOnPantSize() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click on Pant Size " + pantSize.toString());
        //CustomListeners.test.log(Status.PASS, "User Successfully Click on Pant Size" + pantSize);
        mouseHoverToElement(hooverPantSize);
        mouseHoverToElementAndClick(pantSize);
    }

    public void clickOnPantColour() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click on Pant Colour " + pantColour.toString());
        //CustomListeners.test.log(Status.PASS, "User Successfully Click on Pant Colour" + pantColour);
        mouseHoverToElement(hooverPantColour);
        mouseHoverToElementAndClick(pantColour);
    }

    public void clickOnAddToCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Add To Cart " + addToCart.toString());
        //CustomListeners.test.log(Status.PASS, "User Successfully Click on Add To Cart " + addToCart);
        mouseHoverToElement(mouseHooverToBoth);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyAddedItemToTheShoppingCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Add Items " + verifyShoppingCart.toString());
        //CustomListeners.test.log(Status.PASS, "User Successfully Verify Added Items To The ShoppingCart " + verifyShoppingCart);
        return getTextFromElement(verifyShoppingCart);
    }

    public void shoppingCartLink() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Shopping Cart Link " + shoppingCart.toString());
        //CustomListeners.test.log(Status.PASS, "User Successfully Click Shopping Cart " + shoppingCart);
        clickOnElement(shoppingCart);
    }
}
