package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddtoreviewPage extends BasePage {
    public AddtoreviewPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "AddProductReview_Title")
    WebElement reviewtitle;

    @FindBy(id="AddProductReview_ReviewText")
    WebElement reviewtext;

    @FindBy(id="addproductrating_1")
    WebElement ratingbtn;

    @FindBy(name="add-review")
    WebElement addreviewbtn;



public void useraddreiew(String titelreview,String textreview)
{
settext(reviewtitle,titelreview);
settext(reviewtext,textreview);
clickbutton(ratingbtn);
clickbutton(addreviewbtn);
}
}