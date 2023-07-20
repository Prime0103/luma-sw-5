package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class OvernightDufflePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    By verifyName;
    // By verifyName = By.xpath("//span[@class='base']");
    //*******Change Qty 3
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement changeNumber;

    //********Click on ‘Add to Cart’ Button.
    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement clickOnButton;

    //********Verify the text‘You added Overnight Duffle to your shopping cart.’
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    By verifyTextOnPage;

    //***** Click on ‘shopping cart’ Link into message
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement cartLink;


    //******* Verify the text ‘Overnight Duffle’
    public String verifyProduceName() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Verify Product Name " + verifyName.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Product Name" + verifyName);
        return getTextFromElement(verifyName);
    }

    //Change Qty 3
    public void changeQuantity(String quantity) throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Enter quantity " + quantity + " to quantity field" + changeNumber.toString());
        //CustomListeners.test.log(Status.PASS, "Change quantity " + changeNumber);
        sendTextToElement(changeNumber, quantity);
    }

    //Click on ‘Add to Cart’ Button.
    public void clickOnAddCartButton() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Add On cart " + clickOnButton.toString());
        //CustomListeners.test.log(Status.PASS, "Click On Add On Cart" + clickOnButton);
        clickOnElement(clickOnButton);
    }

    //Verify the text‘You added Overnight Duffle to your shopping cart.’
    public String verifyTheBagShoppingCartText() throws InterruptedException {
        Thread.sleep(200);
        Reporter.log("Verify Shopping Cart Text " + verifyTextOnPage.toString());
        //CustomListeners.test.log(Status.PASS, "Verify Shopping Cart text" + verifyTextOnPage);
        return getTextFromElement(verifyTextOnPage);
    }

    // Click on ‘shopping cart’ Link into message
    public void clickOnBagShoppingCartLink() {
        Reporter.log("Click On Shopping Cart Link " + cartLink.toString());
        //CustomListeners.test.log(Status.PASS, "User Successfully Click On Shopping Cart" + cartLink);
        clickOnElement(cartLink);
    }
}
