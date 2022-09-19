package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCard {
        WebDriver driver;
        By GiftCard = By.xpath("//a[text()='Gift Cards '][1]");
        By Cart     = By.xpath("//button[@type='button'][1]");
        public GiftCard(WebDriver driver){
            this.driver = driver;
        }
        public void getGift1(){
            driver.findElement(GiftCard).click();
            driver.findElement(Cart).click();
        }
    }

