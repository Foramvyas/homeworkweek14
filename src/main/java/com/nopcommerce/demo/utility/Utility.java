package com.nopcommerce.demo.utility;

import com.nopcommerce.demo.basepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;

public class Utility extends BasePage {


    public void clickOnElement(WebElement element) {

        element.click();
    }

    public By clickOnElement(By by) {

        driver.findElement(by).click();
        return by;
    }
    public String getTextFromElement(WebElement element) {
        //String text=driver.findElement(by).getText();// another way to write next line
        return element.getText();
    }
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public void sendTextToElement(By by, String text) {

        driver.findElement(by).sendKeys(text);

    }

    public void sendTextToElement(WebElement element, String text) {

        element.sendKeys();
    }

    public void selectByValueFromDropDown(WebElement element, String value) {
        Select select = new Select (element);
        select.selectByValue(value);
    }

    public <value> void selectByValueFromDropDown(By by ,String value) {

        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public void selectByVisibleTextFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectByVisibleTextFromDropDown(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(value);
    }


    public void selectByIndexFromDropDown(WebElement element, int value) {
        Select select = new Select(element);
        select.selectByIndex(value);
    }

    public By selectByIndexFromDropDown(By by, int value) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
        return by;
    }

        public void mouseHover(WebElement element) {
        Actions actions = new Actions(driver);
        WebElement target = element;
        actions.moveToElement(target).build().perform();
    }

    public void mouseHover(By by) {
        Actions actions = new Actions(driver);
        WebElement target = driver.findElement(by);
        actions.moveToElement(target).build().perform();

    }

    public void clear(WebElement element) {
        element.clear();
    }

    public void clear(By by) {
        driver.findElement(by).clear();

    }
    public Random randomGenerator = new Random();
    public int randomInt = randomGenerator.nextInt(1000);


    public WebElement waitUntilvisibilityofElementLocated(By by, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return element;

    }
    public <BY, attribute> String getAttributefromelement(By by, String value){
        return driver.findElement(by).getAttribute("value");

    }

    public List getListfromElements(By by){
        return driver.findElements(by);

    }


}