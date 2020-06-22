package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.RegestrationPage;

public class MyAccountTest extends BaseTest{

    Faker fakedata= new Faker();
    String firstname= fakedata.name().firstName();
    String lastname= fakedata.name().lastName();
    String email= fakedata.internet().emailAddress();
    String password= fakedata.number().digits(8).toString();
    String newpassword= fakedata.number().digits(8).toString();

    HomePage homeobject;
    RegestrationPage registrationobject;
    MyAccountPage accountobject;
    LoginPage loginobject;

    @Test(priority = 0)
    public void usercanregistersuccessfuly() throws InterruptedException {
        homeobject =new HomePage(driver);
        registrationobject = new RegestrationPage(driver);
        homeobject.openregistrationpage();
        registrationobject.userregestration(firstname,lastname,email,password);
Thread.sleep(3000);
        //  Assert.assertTrue(registrationobject.notifsuccess.getText().contains("Your registration completed"));
        // Assert.assertTrue(registrationobject.logoutlink.getText().contains("Log out"));

    }
    @Test(priority = 1)
    public void uuserchangepassword()
    {
        homeobject = new HomePage(driver);
        registrationobject.myaccount();
        accountobject = new MyAccountPage(driver);
        accountobject.userchagepassword(password,newpassword,newpassword);
        registrationobject.userlogout();
    }
@Test(priority = 2)
    public void usercanloginwithnewdata()
    {
        homeobject =new HomePage(driver);
        loginobject = new LoginPage(driver);
        homeobject.openloginpage();
        loginobject.userlogin(email,newpassword);

    }
}
