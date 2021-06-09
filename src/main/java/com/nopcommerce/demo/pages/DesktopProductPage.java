package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopProductPage extends Utility {

    By computerlink = By.linkText("Computers");
    By desktoplink = By.linkText("Desktops");
    By selectposition = By.xpath("//select[@id='products-orderby']");
    By addtoCartbutton = By.xpath("//div[@class='item-box'][1]//button[text()='Add to cart']");
    By verifythetextMessage = By.xpath("//h1[contains(text(),'Build your own computer')]");
    By selectprocessor = By.xpath("//select[@id='product_attribute_1']");
    By selectRam = By.xpath("//select[@id='product_attribute_2']");
    By selectHdd = By.xpath("//dd[@id='product_attribute_input_3']//label[text()='400 GB [+$100.00]']");
    By selectOs = By.xpath("//input[@id='product_attribute_4_9']");
    By selectSoftware = By.xpath("//input[@id='product_attribute_5_10']");
    By selectSecondSoftware = By.xpath("//input[@name='product_attribute_5' and @id='product_attribute_5_12']");
    By verifyamount = By.xpath("//span[@class='price-value-1' and @id='price-value-1']");
    By clickAddCart = By.xpath("//button[@id='add-to-cart-button-1']");
    By verifyShoppingCart = By.xpath("//p[text()='The product has been added to your ']");


    //2.1 Click on Computer Menu.
    public void clickonComputerlink() {

        clickOnElement(computerlink);
    }

    //2.2 Click on Desktop
    public void clickonDesktopLink() {

        clickOnElement(desktoplink);
    }

    //2.3 Select Sort By position "Name: A to Z"

    public void setSelectposition() {

        selectByIndexFromDropDown(selectposition, 1);
    }

    //2.4 Click on "Add To Cart"
    public void clickonAddtoCartbutton() {

        clickOnElement(addtoCartbutton);
    }

    //2.5 Verify the Text "Build your own computer"
    public String gettextmessage() {

        return getTextFromElement(verifythetextMessage);
    }
    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class

    public void setSelectprocessor() {

        selectByIndexFromDropDown(selectprocessor, 1);
    }

    //2.7.Select "8GB [+$60.00]" using Select class.

    public void setSelectRam() {

        selectByIndexFromDropDown(selectRam, 3);
    }

    //2.8 Select HDD radio "400 GB [+$100.00]"

    public void setSelectHdd() {

        clickOnElement(selectHdd);
    }

    //2.9 Select OS radio "Vista Premium [+$60.00]"
    public void setSelectOs() {

        clickOnElement(selectOs);
    }

    //	2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]

    public void setSelectSoftware() {

        clickOnElement(selectSoftware);
        clickOnElement(selectSoftware);
    }

    //Total Commander [+$5.00]
    public void setSelectSecondSoftware() {

        clickOnElement(selectSecondSoftware);
    }

    // 2.11 Verify the price "$1,475.00"
    public String verifyPrice() {

        return getTextFromElement(verifyamount);
    }

      //2.12 Click on "ADD TO CARD" Button.
      public void setClickAddCart(){

          clickOnElement(clickAddCart);
      }
      //Verify the Message "The product has been added to your shopping cart" on Top green Bar

      public String verifyshoppingcart(){
        return getTextFromElement(verifyShoppingCart);
    }
}

