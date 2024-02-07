package seleniumassignment1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FindElementsTest {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com");
        driver.manage().window().maximize();
        driver.findElement(By.name("username")).sendKeys("Tonny");
        driver.findElement(By.name("password")).sendKeys("1234ab");
        driver.findElement(By.cssSelector("input.button")).click();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        // Thread.sleep(600);
    }
}
