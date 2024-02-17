package testng;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class MethodAnnotation extends BaseMethodTest{
    @Test
    public void LonginShouldSucceed(){
        driver.findElement(By.id("react-burger-menu-btn")).click();
        String login = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(login, "Logout");
    }
    @Test
    public void CheckedFirstProducttitle(){
        String ProductTitle = driver.findElement(By.className("inventory_item_name")).getText().trim();
        Assert.assertEquals(ProductTitle, "Sauce Labs Backpack");
    }
}
