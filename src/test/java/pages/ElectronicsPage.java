package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElectronicsPage {
        WebDriver driver;
        By Electronics = By.xpath("//a[text()='Electronics '][1]");
    By cameraSubMenuOption = By.xpath("//a[text()=' Camera & photo ']");
    By Wishlist     = By.xpath("//button[text()='Add to wishlist'][1]");

    public ElectronicsPage(WebDriver driver){
            this.driver = driver;
        }

        public void JewelleryUser(){
            driver.findElement(Electronics).click();
            driver.findElement(cameraSubMenuOption).click();
            driver.findElement(Wishlist).click();
        }
    }