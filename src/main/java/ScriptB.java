import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by julia on 08.04.2017.
 */
public class ScriptB {
    public static void main(String[] args) {
        String property = System.getProperty("user.dir") + "/driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new ChromeDriver();

        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        WebElement input_email = driver.findElement(By.name("email"));
        input_email.sendKeys("webinar.test@gmail.com");

        WebElement input_pass = driver.findElement(By.name("passwd"));
        input_pass.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement btn = driver.findElement(By.name("submitLogin"));
        btn.click();

        try
        {
            Thread.sleep(2000);
        }
        catch(InterruptedException e)
        {
        }
  //      WebDriverWait wait1 = new WebDriverWait(driver,20);
 //       wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("subtab-AdminParentOrders")));
        WebElement panel1 = driver.findElement(By.id("subtab-AdminParentOrders"));
        panel1.click();
        String msg = "Заказы";
        String q =   driver.getTitle();
        q.contains(msg);
        String url1 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url1= driver.getCurrentUrl();
        url1.compareTo(Url1);

        WebElement panel2 = driver.findElement(By.id("subtab-AdminCatalog"));
        panel2.click();
        String msg2 = "товары";
        String q2 =   driver.getTitle();
        q2.contains(msg2);
        String url2 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url2= driver.getCurrentUrl();
        url2.compareTo(Url2);

        WebElement panel3;
        panel3 = driver.findElement(By.linkText("Клиенты"));
        panel3.click();
        String msg3 = "Управление клиентами";
        String q3 =   driver.getTitle();
        q3.contains(msg3);
        String url3 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url3= driver.getCurrentUrl();
        url3.compareTo(Url3);

        WebElement panel4;
        panel4 = driver.findElement(By.id("subtab-AdminParentCustomerThreads"));
        panel4.click();
        String msg4 = "Customer Service";
        String q4 =   driver.getTitle();
        q4.contains(msg4);
        String url4 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url4= driver.getCurrentUrl();
        url4.compareTo(Url4);

        WebElement panel5 = driver.findElement(By.id("subtab-AdminStats"));
        panel5.click();
        String msg5 = "Статистика";
        String q5 =   driver.getTitle();
        q5.contains(msg5);
        String url5 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url5= driver.getCurrentUrl();
        url5.compareTo(Url5);

        WebElement panel6 = driver.findElement(By.id("subtab-AdminParentModulesSf"));
        panel6.click();
        String msg6 = "Выбор модуля";
        String q6 =   driver.getTitle();
        q6.contains(msg6);
        String url6 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url6= driver.getCurrentUrl();
        url6.compareTo(Url6);

        WebElement panel7 = driver.findElement(By.linkText("Design"));
        panel7.click();
        String msg7 = "Шаблоны";
        String q7 =   driver.getTitle();
        q7.contains(msg7);
        String url7 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url7= driver.getCurrentUrl();
        url7.compareTo(Url7);

        WebElement panel8 = driver.findElement(By.linkText("Доставка"));
        panel8.click();
        String msg8 = "Перевозчики";
        String q8 =   driver.getTitle();
        q8.contains(msg8);
        String url8 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url8= driver.getCurrentUrl();
        url8.compareTo(Url8);

        WebElement panel9 = driver.findElement(By.id("subtab-AdminParentPayment"));
        panel9.click();
        String msg9 = "Payment Methods";
        String q9 =   driver.getTitle();
        q9.contains(msg9);
        String url9 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url9= driver.getCurrentUrl();
        url9.compareTo(Url9);

        WebElement panel10 = driver.findElement(By.id("subtab-AdminInternational"));
        panel10.click();
        String msg10 = "Локализация";
        String q10 =   driver.getTitle();
        q10.contains(msg10);
        String url10 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url10= driver.getCurrentUrl();
        url10.compareTo(Url10);

        WebElement panel11 = driver.findElement(By.id("subtab-ShopParameters"));
        panel11.click();
        String msg11 = "General";
        String q11 =   driver.getTitle();
        q11.contains(msg11);
        String url11 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url11= driver.getCurrentUrl();
        url11.compareTo(Url11);

        WebElement panel12 = driver.findElement(By.id("subtab-AdminAdvancedParameters"));
        panel12.click();
        String msg12 = "Information";
        String q12 =   driver.getTitle();
        q12.contains(msg12);
        String url12 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url12= driver.getCurrentUrl();
        url12.compareTo(Url12);

        driver.quit();
    }
}
