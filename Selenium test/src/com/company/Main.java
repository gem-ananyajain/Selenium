package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","/Users/apple/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");

        WebElement searchbox  = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        searchbox.sendKeys("Text book");

WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
clickButton.click();

String firstBook = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).getText();
        System.out.println(firstBook);

    }
}
