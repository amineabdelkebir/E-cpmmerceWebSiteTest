package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.*;

public class AddtoreviewTest extends BaseTest{
    String keyword="MacBook";
    SearchPage searchobject;
    ProductDetailsPage detailsobject;

    Faker DataFaker = new Faker();
    String firstname= DataFaker.name().firstName();
    String lastname= DataFaker.name().lastName();
    String email= DataFaker.internet().emailAddress();
    String password= DataFaker.number().digits(8).toString();

    AddtoreviewPage reviewobject;
    HomePage homeobject;
    RegestrationPage registrationobject;


    String reviewtitle="About MAC";
    String reviewtext="This product is very good";

    @Test(priority = 0)
    public void usercanregistersuccessfuly() throws InterruptedException {
        homeobject =new HomePage(driver);
        registrationobject = new RegestrationPage(driver);
        homeobject.openregistrationpage();
        registrationobject.userregestration(firstname,lastname,email,password);

    }

    @Test(priority = 1)
    public void usercansearchproduct() throws InterruptedException {
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword));
          }

    @Test(priority = 2)
    public void registredsercanaddreview()
    {
        detailsobject.addproducttoreview();
        reviewobject = new AddtoreviewPage(driver);
        reviewobject.useraddreiew(reviewtitle,reviewtext);
    }
    @Test(priority = 3)
    public void registredusercanlogout()
    {
        registrationobject.userlogout();
    }
}
