package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search_Amazon {
    ChromeDriver driver;


    public void browserlaunch() {
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
    public void Amazon() throws InterruptedException{


        //Nevigate to google
        driver.get("https://www.google.com");

        //Enter text in google search
        WebElement searchbox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        Thread.sleep(2000);
        searchbox.sendKeys("amazon");
        Thread.sleep(3000);
        //click on google search
        driver.findElement(By.xpath("(//input[@aria-label='Google Search'])[1]")).click();
        Thread.sleep(3000);
        // geeting text Amazon.in

        WebElement getresult =  driver.findElement(By.xpath("//h3[text()='Amazon.in']"));
        System.out.println("Title of Amazon Page "+ getresult.getText());


    }
}