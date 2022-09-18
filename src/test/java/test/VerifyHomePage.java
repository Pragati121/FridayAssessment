package test;

import org.testng.annotations.Test;

import java.io.IOException;
class VerifyHomePage extends BaseTest {

    @Test(priority=0)
    public void Hometest() throws InterruptedException, IOException {
        pageFactory.getHomeVerify().HomeUser();
    }
}
