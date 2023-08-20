package mandatoryHomeWork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

import static org.testng.Assert.assertEquals;

public class makemytrip {

    public static void main(String[] args) throws InterruptedException {

        String url = "https://www.makemytrip.com/";
        ChromeOptions chrOpt = new ChromeOptions();
        chrOpt.addArguments("--remote-allow-origins=*");
        chrOpt.addArguments("--start-maximized");
        chrOpt.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chrOpt);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.className("menu_Flights")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='From']"))).click();
        driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Chennai");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Chennai, India']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='To']"))).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Goa");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Goa - Dabolim Airport, India']"))).click();
//		Date date = new Date();
//		DateFormat formatter = new SimpleDateFormat("dd");
//		String date1= formatter.format(date);
//		System.out.println(date);
        driver.findElement(By.xpath("//div[@class='dateInnerCell']/p[text()='7']")).click();
        driver.findElement(By.xpath("//span[text()='Return']")).click();
        driver.findElement(By.xpath("//div[@class='dateInnerCell']/p[text()='10']")).click();
        driver.findElement(By.xpath("//span[text()='Travellers & Class']")).click();
        driver.findElement(By.xpath("//li[@data-cy= 'adults-2']")).click();
        driver.findElement(By.xpath("//button[text()= 'APPLY']")).click();
        driver.findElement(By.xpath("//a[text()= 'Search']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='OKAY, GOT IT!']"))).click();
        String title = driver.findElement(By.xpath("//p[contains(@class,'journey-title')]")).getText();
        String output = "Flights from Chennai to Goa - Dabolim Airport, and back";
        assertEquals(title, output);

        String mainWindowHandle = driver.getWindowHandle();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Book Now']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Continue']"))).click();

        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }



        WebElement ele = driver.findElement(By.xpath("//div[@class='travelinsuranceTop']//h2[1]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);

        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();


        Thread.sleep(5000);

    }
}
