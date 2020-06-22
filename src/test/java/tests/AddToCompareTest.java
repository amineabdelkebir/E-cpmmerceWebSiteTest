package tests;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.AddComparePage;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class AddToCompareTest extends BaseTest{

    String keyword1="MacBook";
    String keyword2="Asus";
    SearchPage searchobject;
    ProductDetailsPage detailsobject;
    HomePage homeobject;
   AddComparePage compareobject;


    @Test(priority = 0)
    public void usercansearchproductandaddtocomparelist() throws InterruptedException {
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword1);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword1));
        detailsobject.useraddproducttocomparelist();
        Thread.sleep(3000);
        searchobject = new SearchPage(driver);
        detailsobject = new ProductDetailsPage(driver);
        searchobject.searchproductusingautosuggest(keyword2);
        Assert.assertTrue(detailsobject.productname.getText().contains(keyword2));
        detailsobject.useraddproducttocomparelist();
        Thread.sleep(3000);


    }
@Test(priority = 1)
    public void checkcomparelistandclearit() throws InterruptedException {
        compareobject = new AddComparePage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
    Assert.assertTrue(compareobject.product1.getText().contains("Apple MacBook Pro 13-inch"));
    Assert.assertTrue(compareobject.product2.getText().contains("Asus N551JK-XO076H Laptop"));
    Thread.sleep(6000);
        compareobject.userclearcmparepage();
    Thread.sleep(3000);


    }
}
