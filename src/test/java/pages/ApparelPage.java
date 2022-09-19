package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ApparelPage {
        WebDriver driver;
        By Apparel = By.xpath("//a[text()='Apparel '][1]");
        By Cart   = By.xpath("//a[text()=' Clothing ']");
         By Wishlist = By.xpath("//button[contains(@type,'button')][3]");

        public ApparelPage(WebDriver driver){
            this.driver = driver;
        }
        public void getApparelUser(){
            driver.findElement(Apparel).click();
            driver.findElement(Cart).click();
            driver.findElement(Wishlist).click();
        }
    }
