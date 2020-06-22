package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AddtoCartPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddtoCardTest extends BaseTest {

    String keyword="MacBook";
    SearchPage searchobject;
    ProductDetailsPage detailsobject;
    AddtoCartPage cartobject;
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
    public void updatcartpage() throws InterruptedException {

        cartobject.usercheckoutproduct();
    }
}
