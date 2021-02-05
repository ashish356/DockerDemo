package com.org.ashish.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Generic {

    public static WebDriver driver;


    public void enterValue(String inputText, By object)
    {

        highlightField(object);
        driver.findElement(object).sendKeys(inputText);
    }

    public void click(By object)
    {

        highlightField(object);
        driver.findElement(object).click();
    }



    protected  void highlightField(By object)
    {

        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        WebElement element=driver.findElement(object);
        javascriptExecutor.executeScript("arguments[0].style.border='4px groove green'",element );
        try
        {
            Thread.sleep(1000);
        }catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        javascriptExecutor.executeScript("arguments[0].style.border=''",element);
    }

}
