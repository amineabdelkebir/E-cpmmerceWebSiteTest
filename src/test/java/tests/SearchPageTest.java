package tests;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class SearchPageTest extends BaseTest{


      String productname="Apple MacBook Pro 13-inch";
        SearchPage searchobject;
        ProductDetailsPage detailsobject;
        HomePage homeobject;
        @Test
        public void usercansearchproduct() throws InterruptedException {
           searchobject = new SearchPage(driver);
           searchobject.usersearchproduct(productname);
           detailsobject = new ProductDetailsPage(driver);
           searchobject.opendetailspage();
            Assert.assertTrue(detailsobject.productname.getText().equalsIgnoreCase(productname));
        driver.quit();
        }

    }


