package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuPage extends Utility {


    By computerslink = By.linkText("Computers");
    By verifycomputerPageNavigation = By.partialLinkText("Compute");
    By electronicslink = By.linkText("Electronics");
    By verifyelectronicPageNavigation = By.partialLinkText("Electroni");
    By apparellink = By.linkText("Apparel");
    By verifyapprelPageNavigation = By.partialLinkText("Appar");
    By digitaldownloadslink = By.linkText("Digital downloads");
    By verifydigitaldownloadPageNavigation = By.partialLinkText("Digital downloa");
    By bookslink = By.linkText("Books");
    By verifybooksPageNavigation = By.partialLinkText("Books");
    By jewelrylink = By.linkText("Jewelry");
    By verifyjewelryPageNavigation = By.partialLinkText("Jewel");
    By giftcardlink = By.linkText("Gift Cards");
    By verifygiftCardPageNavigation = By.partialLinkText("Gift Car");

    //1.1 create method with name "selectMenu" it has one parameter name "menu" of  type string

    //1.2 This method should click on the menu whatever name is passed as parameter.

    public void selectMenu(String menu) throws InterruptedException {
        Thread.sleep(1000);
        if (menu == "Computers") {
            clickOnElement(computerslink);

        } else if (menu == "Electronics") {
            clickOnElement(electronicslink);

        } else if (menu == "Apparel") {
            clickOnElement(apparellink);

        } else if (menu == "Digital downloads") {
            clickOnElement(digitaldownloadslink);

        } else if (menu == "Books") {
            clickOnElement(bookslink);

        } else if (menu == "Jewelry") {
            clickOnElement(jewelrylink);

        } else if (menu == "Gift Cards") {
            clickOnElement(giftcardlink);

        }
    }

    public String verifycomputerPageNavigation() {

        return getTextFromElement(verifycomputerPageNavigation);
    }
    public String verifyElectronicsPageNavigation() {
        return getTextFromElement(verifyelectronicPageNavigation);
    }

    public String verifyapparelPageNavigation() {
        return getTextFromElement(verifyapprelPageNavigation);
    }

    public String verifydigitalDownloadsPageNavigation() {
        return getTextFromElement(verifydigitaldownloadPageNavigation);
    }

    public String verifybooksPageNavigation() {
        return getTextFromElement(verifybooksPageNavigation);
    }

    public String verifyJewelryPageNavigation() {
        return getTextFromElement(verifyjewelryPageNavigation);
    }

    public String verifyGiftCardsPageNavigation() {
        return getTextFromElement(verifygiftCardPageNavigation);
    }

}





