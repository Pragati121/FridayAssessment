package test;

import org.testng.annotations.Test;

import java.io.IOException;

public class VerifyGiftCard extends BaseTest {
    @Test(priority = 0)
    public void Honestest() throws IOException, InterruptedException {
        pageFactory.getHomeVerify().HomeUser();
    }

    @Test(priority = 1)
    public void checkoutFromCart() throws IOException {
        pageFactory.getComputer().User();
    }

    @Test(priority = 2)
    public void BookPage() throws IOException, InterruptedException {
        pageFactory.getBook().BookUser();
    }

    @Test(priority = 3)
    public void Jeweellery() throws IOException, InterruptedException {
        pageFactory.getJewelleryUser().JewelleryUser();
    }

    @Test(priority = 4)
    public void GiftCard() throws IOException, InterruptedException {
        pageFactory.getGift().getGift1();
    }
}
