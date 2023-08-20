package mandatoryHomeWork.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class createLeadSales {

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
        driver.findElement(By.xpath("//p[text()='Marketing']")).click();
        Thread.sleep(2000);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.xpath("//span[text()='Leads']"));
        jsExecutor.executeScript("arguments[0].click();", element);

        driver.findElement(By.xpath("//div[@title='New']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'slds-combobox__input slds-input_faux')]")).click();
        driver.findElement(By.xpath("//span[text()='Mr.']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Saravanan");
        driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("fiser");
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@name='Convert']")).click();
        Thread.sleep(2000);
//        driver.findElement(By.xpath("(//button[@class='slds-button transparentButton'])[3]")).click();
//        driver.findElement(By.xpath("(//button[@class='slds-button transparentButton'])[3]")).clear();
//        driver.findElement(By.xpath("(//button[@class='slds-button transparentButton'])[3]")).sendKeys("fis");
        WebElement element1 = driver.findElement(By.xpath("//button[text()='Convert']"));
        jsExecutor.executeScript("arguments[0].click();", element1);

    }
}
