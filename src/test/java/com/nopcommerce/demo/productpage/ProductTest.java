package com.nopcommerce.demo.productpage;

import com.nopcommerce.demo.pages.DesktopProductPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductTest extends TestBase {

    DesktopProductPage desktopProductPage = new DesktopProductPage();

    @Test

    public void verifyProductAddedToShoppingCartSucessFully() throws InterruptedException {
        // 2.1 Click on Computer Menu.
        desktopProductPage.clickonComputerlink();

        //2.2 Click on Desktop
        Thread.sleep(1000);
        desktopProductPage.clickonDesktopLink();

        //2.3 Select Sort By position "Name: A to Z"

        desktopProductPage.setSelectposition();

        //2.3.1 verify products arranged in alphabetical order

        List<WebElement> deskTopList;
        deskTopList = getListfromElements(By.xpath("//h2[@class='product-title']"));
        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);
        Collections.sort(tempList);
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);

        Thread.sleep(1000);
        //2.4 Click on "Add To Cart"
        desktopProductPage.clickonAddtoCartbutton();

        //2.5 Verify the Text "Build your own computer"
        String expectedMessage = "Build your own computer";
        String actualMessage = desktopProductPage.gettextmessage();
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
        //2.6Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        desktopProductPage.setSelectprocessor();

        //2.7.Select "8GB [+$60.00]" using Select class.
        desktopProductPage.setSelectRam();
        Thread.sleep(1000);
        //2.8 Select HDD radio "400 GB [+$100.00]"
        desktopProductPage.setSelectHdd();

        //2.9 Select OS radio "Vista Premium [+$60.00]"
        desktopProductPage.setSelectOs();
        Thread.sleep(2000);
        //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]
        desktopProductPage.setSelectSoftware();

        //2.10 select secondsoftware

        desktopProductPage.setSelectSecondSoftware();
        Thread.sleep(1000);
        //2.11 Verify the price "$1,475.00"

        String expectedPrice = "$1,475.00";
        String actualPrice = desktopProductPage.verifyPrice();
        Assert.assertEquals(actualPrice, expectedPrice);

        //2.12 Click on "ADD TO CARD" Button.

        desktopProductPage.setClickAddCart();

        //2.13Verify the Message "The product has been added to your shopping cart" on Top green Bar
        Thread.sleep(1000);
        String expectedMessage2 = "The product has been added to your shopping cart";
        String actualMessage2 = desktopProductPage.verifyshoppingcart();
        Assert.assertEquals(actualMessage2, expectedMessage2);

    }

}
