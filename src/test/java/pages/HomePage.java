package pages;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.io.IOException;

public class HomePage {
    WebDriver driver;
    By WelcomeText  =By.xpath("//h2[contains(text(),'Welcome to our store')]");
    public HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    public void HomeUser() throws IOException, InterruptedException
    {driver.findElement(WelcomeText).click();
        Thread.sleep(2000);
        String actual = driver.findElement(WelcomeText).getText();
        Assert.isTrue(actual.equals("Welcome to our store"), "Expected result does not match with actual result");
    }
}
