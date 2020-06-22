package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="small-searchterms")
    WebElement searchtextbox;

    @FindBy(id="ui-id-1")
    List<WebElement> productlist;

    @FindBy( css = "input.button-1.search-box-button")
  public   WebElement searchbtn;

    @FindBy(partialLinkText ="Apple MacBook Pro 13-inch")
  public   WebElement producttitle;


    public void usersearchproduct(String productname)
    {
        settext(searchtextbox,productname);
        clickbutton(searchbtn);

    }
    public void opendetailspage()
    {
        clickbutton(producttitle);
    }
    public void searchproductusingautosuggest(String searchtxt) throws InterruptedException
    {
        settext(searchtextbox, searchtxt);
        Thread.sleep(3000);
        productlist.get(0).click();
    }

}
