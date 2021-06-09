package com.nopcommerce.demo.topemenu;

import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class TopMenuTest extends TestBase {

    TopMenuPage topMenuPage = new TopMenuPage();


    //1.3. create the @Test method name verifyPageNavigation.use selectMenu method to select the
    // Menu and click on it and verify the page navigation.


    @Test
    public void verifyPagenavigation() throws InterruptedException {

        Thread.sleep(1000);
        topMenuPage.selectMenu("Computers");
        String expectedPagetext = "Computers";
        String actualPagetext = topMenuPage.verifycomputerPageNavigation();
        Assert.assertEquals(actualPagetext, expectedPagetext);


        topMenuPage.selectMenu("Electronics");
        String expectedMessage1 = "Electronics";
        String actualMessage1 = topMenuPage.verifyElectronicsPageNavigation();
        Assert.assertEquals(actualMessage1, expectedMessage1);

        topMenuPage.selectMenu("Apparel");
        String expectedMessage2 = "Apparel";
        String actualMessage2 = topMenuPage.verifyapparelPageNavigation();
        Assert.assertEquals(actualMessage2, expectedMessage2);


        topMenuPage.selectMenu("Digital downloads");
        String expectedMessage3 = "Digital downloads";
        String actualMessage3 = topMenuPage.verifydigitalDownloadsPageNavigation();
        Assert.assertEquals(actualMessage3, expectedMessage3);

        topMenuPage.selectMenu("Books");
        String expectedMessage4 = "Books";
        String actualMessage4 = topMenuPage.verifybooksPageNavigation();
        Assert.assertEquals(actualMessage4, expectedMessage4);

        topMenuPage.selectMenu("Jewelry");
        String expectedMessage5 = "Jewelry";
        String actualMessage5 = topMenuPage.verifyJewelryPageNavigation();
        Assert.assertEquals(actualMessage5, expectedMessage5);


        topMenuPage.selectMenu("Gift Cards");
        String expectedMessage6 = "Gift Cards";
        String actualMessage6 = topMenuPage.verifyGiftCardsPageNavigation();
        Assert.assertEquals(actualMessage6, expectedMessage6);


    }

}
