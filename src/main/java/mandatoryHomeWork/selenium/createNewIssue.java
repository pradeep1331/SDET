package mandatoryHomeWork.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class createNewIssue {

    public static void main(String[] args) throws InterruptedException {


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
        WebElement projectBacklogLink = driver.findElement(By.id("project-backlog-link"));
        projectBacklogLink.click();
        WebElement newSprintButton = driver.findElement(By.id("new-sprint-button"));
        newSprintButton.click();
        WebElement storiesInput = driver.findElement(By.id("stories-input"));
        storiesInput.sendKeys("2");
        WebElement startSprintButton = driver.findElement(By.id("start-sprint-button"));
        startSprintButton.click();
        WebElement inProgressButton = driver.findElement(By.id("in-progress-button"));
        inProgressButton.click();
        WebElement completeSprintButton = driver.findElement(By.id("complete-sprint-button"));
        completeSprintButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("createGlobalItem")));
        WebElement existingIssues = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("existing-issues")));
        WebElement createIssueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("create-issue-button")));
        createIssueButton.click();
        WebElement placeholderText = driver.findElement(By.id("issue-name-input"));
        WebElement jiraTypeIcon = driver.findElement(By.id("jira-type-icon"));
        jiraTypeIcon.click();
        WebElement manageIssueTypesButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("manage-issue-types-button")));
        manageIssueTypesButton.click();
        WebElement issueTypesScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("issue-types-screen")));
        WebElement addIssueTypeButton = driver.findElement(By.id("add-issue-type-button"));
        addIssueTypeButton.click();
        WebElement createButton = driver.findElement(By.id("create-button"));
        boolean isCreateButtonEnabled = createButton.isEnabled();
        WebElement nameField = driver.findElement(By.id("name-field"));
        nameField.sendKeys("Issue Name");
        nameField.clear();  // Delete the entered text
        WebElement errorMessage = driver.findElement(By.id("error-message"));
        boolean isErrorMessageDisplayed = errorMessage.isDisplayed();
        nameField.sendKeys("Issue Name");
        WebElement changeIcon = driver.findElement(By.id("change-icon"));
        changeIcon.click();
        WebElement iconOption = driver.findElement(By.id("icon-option"));
        iconOption.click();
        WebElement selectButton = driver.findElement(By.id("select-button"));
        selectButton.click();
        driver.navigate().back();
        WebElement createIssueButton1 = driver.findElement(By.id("create-issue-button"));
        createIssueButton1.click();
        String newIssueKey = "Project_Id_JIRA_NUMBER_JIRA_NAME";
    }
}
