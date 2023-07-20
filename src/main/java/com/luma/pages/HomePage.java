package com.luma.pages;

import com.luma.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility
{
    //Mouse Hoover on WomenLink
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenLink;

    // Mouse Hover on Tops
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement topLink;

    //click on jacket menu
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    By jacketLink;

    //Mouse Hoover on MenLink

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Men']")
    WebElement menLink;

    // Mouse hoover Bottoms
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-18']")
    WebElement bottomLink;

    //click on pants
    @CacheLookup
    @FindBy(xpath = "//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    By pantsLink;

    // Mouse Hoover on GearLink
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Gear']")
    WebElement gearLink;

    // Click on Bags
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement bags;


    public void mouserHooverToWomenMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To WomenMenu " + womenLink.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Women Menu" + womenLink);
        mouseHoverToElement(womenLink);
    }

    public void mouseHooverToTopMenu() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Mouse Hoover To Top Menu " + topLink.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Top Menu Link" + topLink);
        mouseHoverToElement(topLink);
    }

    public void clickOnJacket() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Jacket Menu " + jacketLink.toString());
        // CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Jacket Menu Link" + jacketLink);
        mouseHoverToElementAndClick(jacketLink);
    }

    public void mouseHooverToMenMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Men Menu " + menLink.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Men Menu Link" + menLink);
        mouseHoverToElement(menLink);
    }

    public void mouseHooverToBottomsMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Bottom Menu " + bottomLink.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Bottom Menu Link" + bottomLink);
        mouseHoverToElement(bottomLink);
    }

    public void clickOnPants() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Click On Pants " + pantsLink.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Click On Pants" + pantsLink);
        mouseHoverToElementAndClick(pantsLink);
    }

    public void mouseHooverToGearMenu() throws InterruptedException {
        Thread.sleep(500);
        Reporter.log("Mouse Hoover To Gear Menu " + gearLink.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Mouse Hoover To Gear Menu Link" + gearLink);
        mouseHoverToElement(gearLink);
    }

    // Click on Bags
    public void clickOnBags() throws InterruptedException {
        Thread.sleep(1000);
        Reporter.log("Click On Bags " + bags.toString());
        //CustomListeners.test.log(Status.PASS, "User successful Click On Bags" + bags);
        clickOnElement(bags);
    }

}
