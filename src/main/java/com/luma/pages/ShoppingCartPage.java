package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    By verifyText;

    //************ Verify the product name ‘Cronus Yoga Pant’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    By verifyName;

    //************ Verify the product size ‘32’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    By verifySize;

    //************ Verify the product colour ‘Black’
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    By verifyColour;

    //************ Verify the product name ‘Overnight Duffle’
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Overnight Duffle']")
    By verifyBagName;

    // ************ Verify the Qty is ‘3’
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    By verifyQty;


    // ************ Verify the product price ‘$135.00’
    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']")
    By verifyThePrice;

    //************ Change Qty to ‘5’
    @CacheLookup
    @FindBy(xpath = "//input[@title='Qty']")
    WebElement changeQty;
    //************ Click on ‘Update Shopping Cart’ button
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement clickUpdate;

    // ************ Verify the product price ‘$225.00’
    @CacheLookup
    @FindBy(xpath = "(//span[@class='cart-price']//span)[2]")
    By verifyLastPrice;

    //************ Verify the text ‘Shopping Cart.'
    public String verifyTextMessage() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Text Message " + verifyText.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Text Message" + verifyText);
        return getTextFromElement(verifyText);
    }

    // Verify the product name ‘Cronus Yoga Pant’
    public String verifyProductName() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Name " + verifyName.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Name" + verifyName);
        return getTextFromElement(verifyName);
    }

    // Verify the product size ‘32’
    public String verifyProductSize() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Size " + verifySize.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Size" + verifySize);
        return getTextFromElement(verifySize);
    }

    // Verify the product colour ‘Black’
    public String verifyProductColour() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Colour " + verifyColour.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Colour" + verifyColour);
        return getTextFromElement(verifyColour);
    }

    //Verify the product name ‘Overnight Duffle’
    public String verifyTheBagName() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Bag Name " + verifyBagName.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Bag Name" + verifyBagName);
        return getTextFromElement(verifyBagName);
    }

    //Verify the Qty is ‘3’
    public String verifyTheQuantityNumber() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Quantity " + verifyQty.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Quantity" + verifyQty);
        return getTextFromElement(verifyQty);
    }


    //Verify the product price ‘$135.00’
    public String verifyTheProductPriceInCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Price In Cart" + verifyThePrice.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Price In Cart" + verifyThePrice);
        return getTextFromElement(verifyThePrice);
    }

    // Change Qty to '5'
    public void changeQuantity5() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Change Quantity" + changeQty.toString());
        // CustomListeners.test.log(Status.PASS, "Change Quantity" + changeQty);
        sendTextToElement(changeQty, "5");
    }

    // Click on ‘Update Shopping Cart’ button
    public void clickOnUpdateShoppingCart() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Update shopping Cart" + clickUpdate.toString());
        // CustomListeners.test.log(Status.PASS, "Click On Update shopping Cart" + clickUpdate);
        clickOnElement(clickUpdate);
    }

    // Verify the product price ‘$225.00’
    public String verifyTheUpdateCartPrice() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Verify The Update CartPrice" + verifyLastPrice.toString());
        //CustomListeners.test.log(Status.PASS, "Verify The Update CartPrice" + verifyLastPrice);
        return getTextFromElement(verifyLastPrice);

    }
}
