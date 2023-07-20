package com.luma.testsuite;

import com.luma.pages.HomePage;
import com.luma.pages.WomenPage;
import com.luma.utilities.Utility;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WomenTest extends Utility
{
    HomePage homePage;
    WomenPage womenPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        womenPage = new WomenPage();
    }

    @Test(groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() throws InterruptedException {

        //Mouse Hover on Women Menu
        homePage.mouserHooverToWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHooverToTopMenu();
        //Click on Jackets
        homePage.clickOnJacket();

        Assert.assertEquals(womenPage.productListAfterSorting(),womenPage.productListBeforeSorting());
    }
    @Test(groups = {"smoke", "regression"})

    public void verifyTheSortByPriceFilter() throws InterruptedException {
        //Mouse Hover on Women Menu
        homePage.mouserHooverToWomenMenu();
        //Mouse Hover on Tops
        homePage.mouseHooverToTopMenu();
        //Click on Jackets
        homePage.clickOnJacket();

        Assert.assertEquals(womenPage.priceListAfterSorting(),womenPage.priceListBeforeSorting());

    }
}
