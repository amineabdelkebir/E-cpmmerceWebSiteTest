package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "add-to-cart-button-4")
    WebElement addtocartbtn;

    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addtowishlistbtn;

    @FindBy(css = "input.button-2.add-to-compare-list-button")
    WebElement addtocomparelistbtn;

    @FindBy(css = "input.button-2.email-a-friend-button")
    WebElement emailtofriendbtn;

    @FindBy(css = "div.product-name")
    public WebElement productname;

    @FindBy(linkText = "Add your review")
    WebElement addtoreviewlink;

    @FindBy(id="product_enteredQuantity_4")
    public WebElement quantity;


    public void addproducttoreview()
    {
clickbutton(addtoreviewlink);
    }
 public void addtowishlist()
 {
     clickbutton(addtowishlistbtn);
 }
 public void registredusersendemailtofriend()
 {
     clickbutton(emailtofriendbtn);
 }
 public void useraddproducttocomparelist()
 {
     clickbutton(addtocomparelistbtn);
 }

 public void changequantity(String qty)
 {
     cleartext(quantity);
     settext(quantity,qty);
 }
 public void useraddproducttocart()
 {
     clickbutton(addtocartbtn);
 }
}