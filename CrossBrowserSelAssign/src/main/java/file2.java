import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class file2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\an.jain2\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://techtuts.in/");
        driver.manage().window().maximize();

        //Count number of iFrames here
        List<WebElement> li = driver.findElements(By.tagName("iframe"));
        System.out.println(li.size());


        //Switch to different iFrames here
        for(int i=0;i< li.size();i++){
            driver.switchTo().frame(i);
            driver.switchTo().defaultContent();
        }

        //Switch is not working
        driver.switchTo().frame("google_esf");
        driver.findElement(By.tagName("body")).click();


        driver.switchTo().defaultContent();
        driver.switchTo().frame(li.size()-1);
        driver.findElement(By.tagName("body")).click();
    }
}