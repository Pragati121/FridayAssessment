package test;
import org.testng.annotations.Test;
import pages.PageFactory;
import java.io.IOException;
public class VerifyBookPage extends BaseTest {
    @Test(priority = 0)
    public void Honestest() throws IOException, InterruptedException {
        pageFactory.getHomeVerify().HomeUser();
    }
    @Test(priority = 1)
    public void checkoutFromCart() throws IOException {
        pageFactory.getComputer().User();
    }
    @Test(priority = 2)
    public void BookPage() throws IOException,InterruptedException {
        pageFactory.getBook().BookUser();
       // pageFactory.getBook().login();
    }
}