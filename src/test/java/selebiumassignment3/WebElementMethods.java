package selebiumassignment3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElementMethods {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        /* driver.findElement(By.id("firstName")).sendKeys("Roznin");
        driver.findElement(By.id("lastName")).sendKeys("Ferdawsi");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Ferdawsi"); */
        WebElement webElement = driver.findElement(By.id("firstName"));
        webElement.sendKeys("Ferdawsi");
        webElement.clear();
        webElement.sendKeys("Roznin");
        WebElement webElement1 = driver.findElement(By.id("lastName"));
        webElement1.sendKeys("Ferdawsi");
        WebElement radioButton = driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
        radioButton.click();
        WebElement checkBox = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
        System.out.println(checkBox.isDisplayed());
        checkBox.click();
        System.out.println(checkBox.isSelected());
        System.out.println("getTagName :" + checkBox.getTagName());
        System.out.println("getTagName :" + checkBox.getRect().height);
        System.out.println("Font-family :" + checkBox.getCssValue("font-family"));
        System.out.println("getText :" + checkBox.getText());
    }
}
