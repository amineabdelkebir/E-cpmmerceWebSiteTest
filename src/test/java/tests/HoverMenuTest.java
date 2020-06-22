package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class HoverMenuTest extends BaseTest {
    HomePage homeobject;

    @Test
    public void usercnselectsubcategoryfrommainmenu()
    {
        homeobject = new HomePage(driver);
        homeobject.selectnoteboxmenu();
        Assert.assertTrue(driver.getCurrentUrl().contains("notebook"));

    }
}
