package mandatoryHomeWork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Goibibo {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.goibibo.com/";

        ChromeOptions chrOpt = new ChromeOptions();
        chrOpt.addArguments("--remote-allow-origins=*");
        chrOpt.addArguments("--start-maximized");
        chrOpt.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chrOpt);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
        driver.findElement(By.xpath("//a[text()='Holidays']")).click();
        String mainWindowHandle = driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='hdsw_inner']//div")).click();

         driver.findElement(By.xpath("//li[text()='Chennai']")).click();
        driver.findElement(By.xpath("(//div[@class='hdsw_inner']//div)[2]")).click();
        driver.findElement(By.xpath("//div[text()='Kerala']")).click();
        //driver.findElement(By.xpath("//span[@data-cy='departureDate']")).click();
        Thread.sleep(1000);
      driver.findElement(By.xpath("(//p[text()='21'])[2]")).click();
      driver.findElement(By.xpath("//button[text()='APPLY']")).click();
        driver.findElement(By.xpath("//button[text()='APPLY']")).click();

        driver.findElement(By.id("search_button")).click();
        driver.findElement(By.xpath("//button[text()='SKIP']")).click();
        Thread.sleep(3000);
        WebElement elementToDrag = driver.findElement(By.xpath("//div[@role='slider']"));

        // Create an instance of the Actions class
        Actions actions = new Actions(driver);

        // Perform the click and drag action
        actions.clickAndHold(elementToDrag)
                .moveByOffset(40, 0) // Adjust the pixel values as needed
                .release()
                .build()
                .perform();

        Thread.sleep(5000);

       List<WebElement> options =  driver.findElements(By.xpath("//p[@data-testid='package-discounted-price']"));

        int lowestvalue = Integer.MAX_VALUE ;

        for (int i = 0; i < 3; i++) {

            String val = options.get(i).getText().substring(1).replaceAll(",","");
            System.out.println(val);

            lowestvalue = Math.min(lowestvalue ,Integer.parseInt(val));

        }
         // driver.findElement(By.xpath("//p[text()='₹"+lowestvalue+"']"));

        driver.findElement((By) options.get(1));

        }




    }

