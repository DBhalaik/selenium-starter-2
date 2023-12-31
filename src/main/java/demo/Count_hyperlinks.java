package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Count_hyperlinks {
    ChromeDriver driver;

    public void browserlaunch(){
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void endTest() {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }
    public void Count_hyperlinks() throws InterruptedException{
        //Navigate to bookmyshow url
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        //Using tagname with anchor
        List<WebElement> links = driver.findElements(By.tagName("a"));
        //print size

        System.out.println("The number of links is "  + links.size());


    }
}