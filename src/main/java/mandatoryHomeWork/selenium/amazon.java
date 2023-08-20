package mandatoryHomeWork.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class amazon {

    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions chrOpt = new ChromeOptions();
        chrOpt.addArguments("--remote-allow-origins=*");
        chrOpt.addArguments("--start-maximized");
        chrOpt.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chrOpt);
        driver.get("https://www.amazon.in/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement search = driver.findElement(By.xpath("//label[text()='Search Amazon.in']/following::input"));
        search.sendKeys("oneplus 9 pro");
        search.sendKeys(Keys.ENTER);

        WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]"));
        String textPrice = price.getText();
        System.out.println("Price: " + textPrice);

        String noOfRatings = driver
                .findElement(By.xpath("//img[@class='s-image']/following::span[@class='a-size-base s-underline-text']"))
                .getText();
        System.out.println("Ratings : " + noOfRatings);

        driver.findElement(By.xpath("//img[@data-image-index='1']")).click();
        String currentHandle = driver.getWindowHandle();
        Set<String> windowHandles = driver.getWindowHandles();
        for (String actual : windowHandles) {
            if (!actual.equalsIgnoreCase(currentHandle)) {
                driver.switchTo().window(actual);
            }
        }


        TakesScreenshot scrShot = ((TakesScreenshot) driver);

        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

        File DestFile = new File("C:\\Users\\jothe\\OneDrive\\Documents\\capture.jpg");

        FileUtils.copyFile(SrcFile, DestFile);
        driver.findElement(By.name("submit.add-to-cart")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")));
        driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']/span[1]/input[1]")).click();
        String subTotal = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']//span")).getText();
        System.out.println(subTotal);
        Thread.sleep(5000);
        driver.quit();
    }
}
