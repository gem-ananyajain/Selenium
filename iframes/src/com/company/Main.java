package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/apple/Downloads/chromedriver");
        WebDriver driver=new ChromeDriver();
        String url="http://demo.automationtesting.in/Frames.html";
        driver.get(url);

        //Go To iframe within an iframe
        driver.findElement(By.xpath("//a[@href='#Multiple']")).click();//button click

        WebElement outerFrame=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
        driver.switchTo().frame(outerFrame); //First going inside outer iframe
        WebElement innerFrame=driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));

        driver.switchTo().frame(innerFrame); //Now going inside the inner iframe

        WebElement text=driver.findElement(By.xpath("//input[@type='text']"));
        text.sendKeys("Ananya");

        Thread.sleep(2000);
//        Switching Back To Main Page
        driver.switchTo().defaultContent();//All the frames are out

        //Going back again to single frame using @href attribute tag
        WebElement otherframe=driver.findElement(By.xpath("//a[@href='#Single']"));//button click
        otherframe.click();

        driver.switchTo().frame("singleframe");
        Thread.sleep(1000);
        WebElement input=driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Ananya");

        driver.switchTo().defaultContent();

        Thread.sleep(3000);
        driver.close();
    }
}