package selebiumassignment3;
//index,value,text

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectTest {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php?authuser=0");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Select select = new Select(driver.findElement(By.name("country")));
        select.selectByIndex(3);
        //Thread.sleep(2000);
        select.selectByValue("AMERICAN SAMOA");
       // Thread.sleep(2000);
        select.selectByVisibleText("AMERICAN SAMOA");
        for (WebElement webElement : select.getOptions()){
            System.out.println(webElement.getText());
        }
       // driver.quit();
    }
}
