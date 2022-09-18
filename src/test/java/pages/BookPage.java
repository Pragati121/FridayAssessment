package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookPage {
    WebDriver driver;
   By Booklink = By.xpath("//a[text()='Books ']");
   By AddCArt = By.xpath("//button[contains(@class,'button-2')][1]");
   By Shoppingcart = By.xpath("//a[@class='ico-cart']");
   By AgreeButton = By.xpath("//input[@id=\"termsofservice\"]");
   By Checkout = By.xpath("//button[@name='checkout']");
   By register = By.linkText("Register");
    By gender = By.xpath("//input[@id='gender-male']");
    By firstName = By.xpath("//input[@id='FirstName']");
    By lastName = By.xpath("//input[@id='LastName']");
    By dateOfBirth = By.xpath("//select[@name='DateOfBirthDay']");
    By date = By.xpath("//option[contains(text(),'15')]");
    By monthOfBirth = By.xpath("//select[@name='DateOfBirthMonth']");
    By month = By.xpath("//option[contains(text(),'May')]");
    By yearOfBirth = By.xpath("//select[@name='DateOfBirthYear']");
    By year = By.xpath("//option[contains(text(),'1991')]");
    By email = By.xpath("//input[@id='Email']");
    By company = By.xpath("//input[@id='Company']");
    By password = By.xpath("//input[@id='Password']");
    By confirmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By continueButton = By.xpath("//a[contains(text(),'Continue')]");
    By excillentRadio = By.xpath( "//input[@name='termsofservice'')]");
    By voteButton = By.xpath("//button[@id='vote-poll-1']");
  public BookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void BookUser() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(Booklink).click();
      driver.findElement(AddCArt).click();
        driver.findElement(Shoppingcart).click();
        driver.findElement(AgreeButton).click();
        driver.findElement(Checkout).click();
        driver.findElement(register).click();
        driver.findElement(gender).click();
        driver.findElement(firstName).sendKeys("jijojj");
        driver.findElement(lastName).sendKeys("jhhjii");
        driver.findElement(dateOfBirth).click();
        driver.findElement(date).click();
        driver.findElement(monthOfBirth).click();
        driver.findElement(month).click();
        driver.findElement(yearOfBirth).click();
        driver.findElement(year).click();
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("jihioii@gmail.com");
        driver.findElement(company).sendKeys("hhhh");
        driver.findElement(password).sendKeys("13445556");
        driver.findElement(confirmPassword).sendKeys("13445556");
        driver.findElement(registerButton).click();
        driver.findElement(continueButton).click();
        driver.findElement(excillentRadio).click();
        driver.findElement(voteButton).click();
    }
}
