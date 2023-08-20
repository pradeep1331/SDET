package mandatoryHomeWork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class jira {

    public static void main(String[] args) throws InterruptedException {

        String[] names = { "Pradeep", "asif", "Nawin", "ANIS", "asfi", "jotheesh kumar" };

        Random random = new Random();

        int ranInd = random.nextInt(names.length);

        String name = names[ranInd];

        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://id.atlassian.com/login");

        Thread.sleep(2000);

        driver.findElement(By.id("username")).sendKeys("spradeep1331@gmail.com");
        driver.findElement(By.id("login-submit")).click();

        driver.findElement(By.id("password")).sendKeys("Scsp1111");
        driver.findElement(By.id("login-submit")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Jira Work Management')]")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Projects')]")).click();
        driver.findElement(By.xpath("//span[@role='img']")).click();
        driver.findElement(By.xpath("//span[text()='Jira Software']")).click();
        driver.findElement(By.xpath("//span[contains(text(),'Automation')]")).click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createGlobalItem")));
        driver.findElement(By.id("createGlobalItem")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("summary-field")).sendKeys("Test Automation data");
        Thread.sleep(2000);
        WebElement ele = driver.findElement(By.id("assignee-field-label"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@id='assignee-field-label']/following::div[2]")).click();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//span[text()='" + name + "']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
        Thread.sleep(20000);
        driver.quit();

    }
}
