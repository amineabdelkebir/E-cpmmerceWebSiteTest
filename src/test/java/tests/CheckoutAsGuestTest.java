package tests;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutAsGuestTest extends BaseTest {


    Faker fakedata= new Faker();
    String firstname= fakedata.name().firstName();
    String lastname= fakedata.name().lastName();
    String email= fakedata.internet().emailAddress();
    String phone= fakedata.number().digits(8).toString();
    String city= fakedata.address().cityName().toString();
    String zipcode =fakedata.address().zipCode().toString();
    String adresse = fakedata.address().citySuffix().toString();

    String keyword="MacBook";
    SearchPage searchobject;
    OrderDetailsPage orderobject;
    ProductDetailsPage detailsobject;
    AddtoCartPage cartobject;
    CheckOutAsGuestPage checkoutobject;
    HomePage homeobject;

    @Test(priority = 0)
    public void usercansearchproduct() throws InterruptedException {
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword));

    }
    @Test(priority = 1)
    public void useraddaddtocard() throws InterruptedException {
        detailsobject = new ProductDetailsPage(driver);
        detailsobject.changequantity("5");
        detailsobject.useraddproducttocart();
        Thread.sleep(3000);
        cartobject = new AddtoCartPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/cart");
    }

    @Test(priority = 2)
    public void checkoutasguest() throws InterruptedException {
        cartobject.usercheckoutproduct();
        checkoutobject = new CheckOutAsGuestPage(driver);
        checkoutobject.buildingadresse(lastname,firstname,email,city,adresse,zipcode,phone);
        checkoutobject.chooseshippingandmethodpaymentandconfirm();
        Thread.sleep(3000);
        orderobject = new OrderDetailsPage(driver);
        orderobject.saveandprintorder();
        Thread.sleep(3000);
    }

}
