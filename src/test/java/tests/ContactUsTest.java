package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;

public class ContactUsTest extends BaseTest
{
    Faker fakedata= new Faker();
    String lastname= fakedata.name().lastName();
    String email= fakedata.internet().emailAddress();
    String message= fakedata.hobbit().toString();

    HomePage homeobject;
    ContactUsPage contactusobject;


    @Test(priority = 0)
    public void usercontactus() throws InterruptedException {
        homeobject =new HomePage(driver);
        homeobject.opencontactus();
        contactusobject = new ContactUsPage(driver);
        contactusobject.userdocontactus(lastname,email,message);

    }
}
