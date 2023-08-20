package mandatoryHomeWork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class createChatter {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://login.salesforce.com/";
        ChromeOptions chrOpt = new ChromeOptions();
        chrOpt.addArguments("--remote-allow-origins=*");
        chrOpt.addArguments("--start-maximized");
        chrOpt.addArguments("--disable-notifications");
        WebDriver driver = new ChromeDriver(chrOpt);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.id("username")).sendKeys("muthsubr@sdet.testleaf.com");
        driver.findElement(By.id("password")).sendKeys("TestLeaf@1012");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//div[@role='navigation']//button[1]")).click();
        driver.findElement(By.xpath("//p[text()='Service']")).click();
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//span[text()='Cases']"));
        jsExecutor.executeScript("arguments[0].click();", element);
        driver.findElement(By.xpath("//div[@title='New']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Search Contacts...']")).click();
        Thread.sleep(2000);
        WebElement element1 =  driver.findElement(By.xpath("//span[text()='New Contact']"));
        jsExecutor.executeScript("arguments[0].click();", element1);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@class='select']")).click();
        driver.findElement(By.xpath("//a[@title='Mr.']")).click();
        driver.findElement(By.xpath("//input[contains(@class,'lastName compoundBLRadius')]")).sendKeys("Saravanan");
       driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();

    }
}
