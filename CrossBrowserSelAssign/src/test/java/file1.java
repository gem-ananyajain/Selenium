import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class file1 {
    WebDriver driver;
    @Test
    @Parameters("ananya")
    public void browserLaunch(String browserName) throws Exception {
        //Checking for chrome browser here

         if(browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\an.jain2\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver =new ChromeDriver();
        }

//Checking for firefox browser here
        else if(browserName.equalsIgnoreCase("Firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\Users\\an.jain2\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
            driver =new FirefoxDriver();
        }

        else{
            throw new Exception("Browser not found");
        }

        driver.manage().window().maximize();
        driver.get("https://www.geminisolutions.com/");
    }

}