package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.RegestrationPage;
import tests.BaseTest;

public class RegestrationTest extends BaseTest {

    Faker fakedata= new Faker();
    String firstname= fakedata.name().firstName();
    String lastname= fakedata.name().lastName();
    String email= fakedata.internet().emailAddress();
    String password= fakedata.number().digits(8).toString();

    HomePage homeobject;
    RegestrationPage registrationobject;
    LoginPage loginobject;
@Test(priority = 0)
    public void usercanregistersuccessfuly() throws InterruptedException {
        homeobject =new HomePage(driver);
        registrationobject = new RegestrationPage(driver);
        homeobject.openregistrationpage();
        registrationobject.userregestration(firstname,lastname,email,password);
  //  Assert.assertTrue(registrationobject.notifsuccess.getText().contains("Your registration completed"));
   // Assert.assertTrue(registrationobject.logoutlink.getText().contains("Log out"));

    }
    @Test(priority = 1)
public  void registredusercanlogout()
{
    registrationobject.userlogout();
}
@Test(priority = 2)
public void usercanloginsuccessefuly()
{
    homeobject.openloginpage();
    loginobject = new LoginPage(driver);
    loginobject.userlogin(email,password);
   // Assert.assertTrue(registrationobject.logoutlink.getText().contains("Log out"));


}

}
