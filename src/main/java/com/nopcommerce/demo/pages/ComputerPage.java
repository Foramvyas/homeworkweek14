package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {

    By computerlink = By.linkText("Computers");

    By desktoplink = By.linkText("Desktops");

    By selectposition = By.xpath("//select[@id='products-orderby']");

    //1.1 Click on Computer Menu.

    public void clickonComputerlink() {
     //waitUntilvisibilityofElementLocated(clickOnElement(computerlink), 1);
        clickOnElement(computerlink);
    }

    //1.2 Click on Desktop
      public void clickonDesktopLink() {
       // waitUntilvisibilityofElementLocated(clickOnElement(desktoplink),3);
        clickOnElement(desktoplink);
    }

    //1.3 Select Sort By position "Name: Z to A"
      public void setSelectposition() {
        //waitUntilvisibilityofElementLocated(selectByIndexFromDropDown(selectposition,2),2);
        selectByIndexFromDropDown(selectposition, 2);
    }

    }


