import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by julia on 08.04.2017.
 */
public class ScriptA {
    public static void main(String[] args)
    {
        String property = System.getProperty("user.dir")+"/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",property);
        WebDriver driver = new ChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement input_email = driver.findElement(By.name("email"));
        input_email.sendKeys("webinar.test@gmail.com");

        WebElement input_pass = driver.findElement(By.name("passwd"));
        input_pass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement btn = driver.findElement(By.name("submitLogin"));
        btn.click();

        WebDriverWait wait1 = new WebDriverWait(driver,60);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("employee_infos")));

        WebElement avatar = driver.findElement(By.id("employee_infos"));

        WebDriverWait wait = new WebDriverWait(driver,60);
        avatar.click();
        WebElement exit = driver.findElement(By.id("header_logout"));
        exit.click();
        driver.quit();
    }
}
