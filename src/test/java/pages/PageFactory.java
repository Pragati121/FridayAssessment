package pages;

import org.openqa.selenium.WebDriver;
public class PageFactory {
    WebDriver driver;
    private HomePage Home;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }
    public HomePage getHomeVerify() {
        if (Home == null) {
            Home= new HomePage(driver);
        }
        return Home;
    }
}