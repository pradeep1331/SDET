package mandatoryHomeWork.selenium;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class cheapair {

    public static void main(String[] args) throws InterruptedException {
        String url = "https://www.cheapoair.com/air/listing?&d1=PBJ&r1=HNL&dt1=08/14/2023&tripType=ONEWAYTRIP&cl=ECONOMY&ad=1&se=0&ch=0&infs=0&infl=0";
        ChromeOptions chrOpt = new ChromeOptions();
        chrOpt.addArguments("--remote-allow-origins=*");
        chrOpt.addArguments("--start-maximized");
        WebDriver driver = new ChromeDriver(chrOpt);
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        WebElement ele = driver.findElement(By.xpath("//div[@class='modal-close-icon']"));
//
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].click();", ele);
//        driver.findElement(By.xpath("//label[text()='One Way']")).click();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
////        WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-close-icon']")));
////        ele.click();
//        driver.findElement(By.xpath("//input[@value='Anywhere']")).click();
//        driver.findElement(By.xpath("//input[@value='Anywhere']")).sendKeys("Bangalore");
//
//        WebElement ele1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-suggestion='BLR']")));
//        ele1.click();
//        Thread.sleep(2000);
//
//        SimpleDateFormat smpl = new SimpleDateFormat("dd");
//        String todayDate = smpl.format(new Date());
//        System.out.println((Integer.parseInt(todayDate)));
//
//        driver.findElement(By.xpath("(//a[@data-date='"+(Integer.parseInt(todayDate))+"'])[1]")).click();
//        driver.findElement(By.id("travellerButton")).click();
//        driver.findElement(By.id("addadults")).click();
//        driver.findElement(By.xpath("//button[text()='Done']")).click();
//        driver.findElement(By.id("searchNow")).click();
//        driver.findElement(By.xpath("//a[@class='close-icon']")).click();
//        Thread.sleep(3000);
//
       List<WebElement> flights =  driver.findElements(By.xpath("//span[@class='trip__airline--name']"));

        List<WebElement> time =  driver.findElements(By.xpath("//time[@class='is--flight-time notranslate']"));

        List<WebElement> price =  driver.findElements(By.xpath("//span[@class='currency ']"));

//
//        for (int i = 0; i < flights.size() ; i++) {
//
//            System.out.println(flights.get(i).getText());
//            System.out.println(time.get(i).getText());
//            System.out.println(price.get(i).getText());
//
//        }

         Map<String,Double> hmap = new HashMap<>();

        for (int i = 0; i < flights.size() ; i++) {
            String fname = flights.get(i).getText();
            String ftime = time.get(i).getText();
            String  prc = price.get(i).getText();
            String mapkey = fname + ftime;
            double priceind = Double.parseDouble(prc);
            hmap.put(mapkey,priceind);
        }

      Map.Entry<String ,Double> orElse = hmap.entrySet().stream().min(Map.Entry.comparingByValue()).orElse(null);

        String lfli = orElse.getKey();
        Double lvalue = orElse.getValue();
        System.out.println(lfli +" " +lvalue);

    }
}


