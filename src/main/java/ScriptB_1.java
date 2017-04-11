import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by julia on 08.04.2017.
 */
public class ScriptB_1 {

    public static void MenuTest(WebDriver driver, String id_text, String title_text, boolean ById)
    {
        WebElement panel1;
        if (ById)
        {
             panel1 = driver.findElement(By.id(id_text));
        }
        else
            {
             panel1 = driver.findElement(By.linkText(id_text));
        }
        panel1.click();
        String msg = title_text;
        String q =   driver.getTitle();
        q.contains(msg);
        String url1 = driver.getCurrentUrl();
        driver.navigate().refresh();
        String Url1= driver.getCurrentUrl();
        url1.compareTo(Url1);
        System.out.println(driver.getTitle());
    }
    public static void main(String[] args)
    {
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

        MenuTest(driver,"subtab-AdminParentOrders","Заказы",true);

        MenuTest(driver,"subtab-AdminCatalog","товары",true);

        MenuTest(driver,"Клиенты","Управление клиентами",false);

        MenuTest(driver,"subtab-AdminParentCustomerThreads","Customer Service",true);

        MenuTest(driver,"subtab-AdminStats","Статистика",true);

        MenuTest(driver,"subtab-AdminParentModulesSf","Выбор модуля",true);

        MenuTest(driver,"Design","Шаблоны",false);

        MenuTest(driver,"Доставка","Перевозчики",false);

        MenuTest(driver,"subtab-AdminParentPayment","Payment Methods",true);

        MenuTest(driver,"subtab-AdminInternational","Локализация",true);

        MenuTest(driver,"subtab-ShopParameters","General",true);

        MenuTest(driver,"subtab-AdminAdvancedParameters","Information",true);

        driver.quit();
    }

}
