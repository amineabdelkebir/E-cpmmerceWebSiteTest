package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.*;

public class EmailtofriendTest extends BaseTest {
    Faker fakedata = new Faker();
    String firstname = fakedata.name().firstName();
    String lastname = fakedata.name().lastName();
    String email = fakedata.internet().emailAddress();
    String friendemail = fakedata.internet().emailAddress();
    String password = fakedata.number().digits(8).toString();
    EmailtofriendPage emailtofriendobject;
    HomePage homeobject;
    RegestrationPage registrationobject;
    LoginPage loginobject;
    String keyword="MacBook";
    SearchPage searchobject;
    ProductDetailsPage detailsobject;
    String messagetest="This product is very important to success your project";

    @Test(priority = 0,alwaysRun = true)
    public void usercanregistersuccessfuly() throws InterruptedException {
        homeobject = new HomePage(driver);
        registrationobject = new RegestrationPage(driver);
        homeobject.openregistrationpage();
        registrationobject.userregestration(firstname, lastname, email, password);

    }
    @Test(priority = 1)
    public void usercansearchproduct() throws InterruptedException {
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword));

    }
    @Test(priority = 2)
    public void usercansendemailtofreind()

    {
        detailsobject = new ProductDetailsPage(driver);
        detailsobject.registredusersendemailtofriend();
        emailtofriendobject = new EmailtofriendPage(driver);
        emailtofriendobject.usersendemailtofreind(friendemail,messagetest);
        Assert.assertTrue(emailtofriendobject.confirmation.getText().equalsIgnoreCase("Your message has been sent."));
    }
}