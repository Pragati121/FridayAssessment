package pages;

import org.openqa.selenium.WebDriver;
public class PageFactory {
    WebDriver driver;
    private HomePage Home;
    private ComputerPage Computer;
    private BookPage Book;
    private ElectronicsPage Jewell;
    private ApparelPage Apparel;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomeVerify() {
        if (Home == null) {
            Home = new HomePage(driver);
        }
        return Home;
    }

    public ComputerPage getComputer() {
        if (Computer == null) {
            Computer = new ComputerPage(driver);
        }
        return Computer;
    }
    public  BookPage getBook() {
        if (Book == null) {
            Book = new BookPage(driver);
        }
        return Book;
    }
    public ElectronicsPage getJewelleryUser()
    {
        if (Jewell == null) {
            Jewell = new ElectronicsPage(driver);
        }
        return Jewell;

    }
    public ApparelPage getApparel()
    {
        if(Apparel==null)
        {
            Apparel=new ApparelPage(driver);
        }
        return Apparel;
    }
}