package seleniumassigmnet2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SelectorTest extends LocatorTest{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        // Thread.sleep(600);
        //Xpath
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("rumpa");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234t");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        //LinkText
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(2000);
        //partial LinkText
        driver.findElement(By.partialLinkText("in info?")).click();
        Thread.sleep(2000);
        //CSS Selector
        driver.findElement(By.cssSelector("input[id='firstName']")).sendKeys("testing");
        //tagName
        List<WebElement> webElements = driver.findElements(By.tagName("a"));
        for (WebElement webElement : webElements) {
            System.out.println(webElement.getTagName()+ " " + webElement.getAttribute("href"));
        }

    }
}
