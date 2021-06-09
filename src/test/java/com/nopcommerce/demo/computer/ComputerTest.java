package com.nopcommerce.demo.computer;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.testng.Assert.*;

public class ComputerTest extends TestBase {

    ComputerPage computerPage = new ComputerPage();


    @Test

    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {

        // 1.1 Click on Computer Menu.

        computerPage.clickonComputerlink();
        Thread.sleep(1000);

        //1.2 Click on Desktop
        computerPage.clickonDesktopLink();

        //1.3 Select Sort By position "Name: Z to A"

        computerPage.setSelectposition();

        //1.4 Verify the Product will arrange in Descending order.

        Thread.sleep(2000);
        List<WebElement> deskTopList;
        deskTopList = getListfromElements(By.xpath("//h2[@class='product-title']"));
        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }
        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);
        Collections.sort(tempList, Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);

    }


}
