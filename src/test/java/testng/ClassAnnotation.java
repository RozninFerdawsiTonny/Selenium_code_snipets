package testng;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassAnnotation extends BaseClassMethod {
    @Test(priority = 1)
    public void LonginShouldSucceed(){
        String login = driver.findElement(By.id("logout_sidebar_link")).getText().trim();
        Assert.assertEquals(login, "Logout");
    }
    @Test(priority = 0)
    public void CheckedFirstProducttitle(){
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        driver.findElement(By.id("react-burger-menu-btn")).click();
        String ProductTitle = driver.findElement(By.className("inventory_item_name")).getText().trim();
        Assert.assertEquals(ProductTitle, "Sauce Labs Backpack");
    }
    @Test(priority = 2)
    public void CheckTitle(){
        Assert.assertEquals(driver.getTitle(),"Swag Labs");
    }

}
