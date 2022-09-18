package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class ComputerPage {
    WebDriver driver;
    By ComputerHyperlink = By.xpath("//a[text()='Computers ']");
    By Notebook          = By.xpath("//a[text()=' Notebooks ']");
    By Product = By.xpath("//a[contains(text(),'Asus N551JK-XO076H Laptop')]");
    By Cart2             = By.xpath("//button[@id='add-to-cart-button-5']");
    By Shoppingcart      =  By.xpath("//a[@class='ico-cart']");
    By Checkbox          =  By.xpath("//input[contains(@name,'termsofservice')]");
    By Checkout          = By.xpath("//button[@name='checkout']");
    By REgisterButton    = By.xpath("//button[text()='Register']");
    By Gender            = By.xpath("//input[@id='gender-female']");
    By firstName = By.xpath("//input[@name='FirstName']");
    By lastName = By.xpath("//input[@name='LastName']");
    By email = By.xpath("//input[@name='Email']");
    By password = By.xpath("//input[@name='Password']");
    By confirmPassword= By.xpath("//input[@name='ConfirmPassword']");
    By registerNextPageButton = By.xpath("//button[contains(@class,'register-next-step-button')]");
    By continueButton = By.xpath("//a[contains(@class,'register-continue-button')]");
    By countryDropdown = By.xpath("//select[@name='BillingNewAddress.CountryId']");
    By countryOption = By.xpath("//*[contains(text(),'India')][@value='133']");
   By city1 = By.xpath("//input[@name='BillingNewAddress.City']");
   By address1 = By.xpath("//input[@name='BillingNewAddress.Address1']");
    By zipInput = By.xpath("//input[@name='BillingNewAddress.ZipPostalCode']");
    By phoneNumberInput = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
   By continueAfterAddressDetailsButton = By.xpath("//button[contains(@class,'new-address-next-step-button')][@name='save']");

    public ComputerPage(WebDriver driver){
        this.driver = driver;
    }

    public void User()
    {
        driver.findElement(ComputerHyperlink).click();
        driver.findElement(Notebook).click();
        driver.findElement(Product).click();
        driver.findElement(Cart2).click();
        driver.findElement(Shoppingcart).click();
        driver.findElement(Checkbox).click();
        driver.findElement(Checkout).click();
        driver.findElement(REgisterButton).click();
        driver.findElement(Gender).click();
        driver.findElement(firstName).sendKeys("Pragati");
        driver.findElement(lastName).sendKeys("Sharma");
        driver.findElement(email).clear();
        driver.findElement(email).sendKeys("sharma12345@gmail.com");
        driver.findElement(password).sendKeys("123456");
        driver.findElement(confirmPassword).sendKeys("123456");
        driver.findElement(registerNextPageButton).click();
        driver.findElement(continueButton).click();
        driver.findElement(countryDropdown).click();
        driver.findElement(countryOption).click();
        driver.findElement(city1).sendKeys("kangra");
        driver.findElement(address1).sendKeys("hhhhihsskljjkjjff");
        driver.findElement(zipInput).sendKeys("130071");
        driver.findElement(phoneNumberInput).sendKeys("9999999999");
        driver.findElement(continueAfterAddressDetailsButton).click();
    }
}
