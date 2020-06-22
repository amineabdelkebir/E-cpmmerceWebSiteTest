package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddWishlistPage extends BasePage {
    public AddWishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name ="removefromcart")
    WebElement rmvfromlistcheckbox;

    @FindBy(css = "input.button-2.update-wishlist-button")
    WebElement updatewishlist;

    @FindBy(css="input.button-2.wishlist-add-to-cart-button")
    WebElement addtocard;

    public void userupdatewishlist()

    {
    clickbutton(rmvfromlistcheckbox);
    clickbutton(updatewishlist);
    }
}
