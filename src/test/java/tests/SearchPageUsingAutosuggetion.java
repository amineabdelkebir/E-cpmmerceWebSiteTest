package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchPageUsingAutosuggetion extends BaseTest {

    String keyword="MacBook";
    SearchPage searchobject;
    ProductDetailsPage detailsobject;
        HomePage homeobject;
    @Test
    public void usercansearchproduct() throws InterruptedException {
        homeobject =new HomePage(driver);
        homeobject.changecurrency();
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword));

    }
}
