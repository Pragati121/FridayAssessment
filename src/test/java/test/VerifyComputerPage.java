package test;

import org.testng.annotations.Test;

import java.io.IOException;
class VerifyComputerPage extends BaseTest {
    @Test
    public void Honestest() throws IOException, InterruptedException {
        pageFactory.getHomeVerify().HomeUser();
    }
    @Test(dependsOnMethods = "Honestest")
    public void checkoutFromCart() throws IOException {
            pageFactory.getComputer().User();
        }
    }

