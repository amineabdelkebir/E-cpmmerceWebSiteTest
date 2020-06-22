package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AddWishlistPage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

import static java.lang.Thread.*;

public class AddWishlistTestandupda extends BaseTest {

    String keyword="MacBook";
    SearchPage searchobject;
    ProductDetailsPage detailsobject;
    AddWishlistPage wishlistobject;
    HomePage homeobject;
    @Test(priority = 0)
    public void usercansearchproduct() throws InterruptedException {
        homeobject = new HomePage(driver);
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword));
    }
    @Test(priority = 1)

    public void useraddandupdatewishlist() throws InterruptedException {
        detailsobject= new ProductDetailsPage(driver);
        detailsobject.addtowishlist();
        driver.navigate().to("https://demo.nopcommerce.com/wishlist");
        sleep(5000);

    }
    @Test(priority = 2)
    public void userremovewishlist() throws InterruptedException {
        wishlistobject =new AddWishlistPage(driver);
        wishlistobject.userupdatewishlist();
        sleep(3000);
    }}
