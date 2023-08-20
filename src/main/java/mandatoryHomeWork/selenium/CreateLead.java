package mandatoryHomeWork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class CreateLead {

    public static void main(String[] args) throws InterruptedException {
        String url = "http://leaftaps.com/opentaps/control/login";

        ChromeOptions chrOpt = new ChromeOptions();
        chrOpt.addArguments("--remote-allow-origins=*");
        chrOpt.addArguments("--start-maximized");
        chrOpt.addArguments("--incognito");
        WebDriver driver = new ChromeDriver(chrOpt);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        String company = "random";
        String phNo = "1231234233";

        driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.linkText("CRM/SFA")).click();
        Thread.sleep(2000);

        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Pradeep");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sara");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("random");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("random");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("spradeep1331@gmail.com");
        WebElement generalSta = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        new Select(generalSta).selectByValue("NY");

        driver.findElement(By.name("submitButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("updates@mail.com");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();

        Thread.sleep(5000);
    }
}
