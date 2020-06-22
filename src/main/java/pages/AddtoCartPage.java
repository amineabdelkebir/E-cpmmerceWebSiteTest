package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AddtoCartPage extends BasePage{
    public AddtoCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="button-2.update-cart-button")
    WebElement updatebtn;

    @FindBy(id="removefromcart11215")
    WebElement removecheckbox;

    @FindBy(id="checkout_attribute_1")
    WebElement giftopt;

    @FindBy(id="termsofservice")
    WebElement termsconfirm;

    @FindBy(id="checkout")
    WebElement checkoutbtn;

    @FindBy(id = "itemquantity11218")
   public  WebElement quantityprod;

    public void updatequantity(String qtyproduct)
    {

        clickbutton(updatebtn);

    }

    public void usercheckoutproduct()
    {
        select = new Select(giftopt);
        select.selectByVisibleText("Yes [+$10.00]");
        clickbutton(termsconfirm);
        clickbutton(checkoutbtn);
    }
}
