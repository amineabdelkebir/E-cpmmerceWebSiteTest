package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderDetailsPage extends BasePage{
    public OrderDetailsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a.button-2.pdf-invoice-button")
  public  WebElement saveorderbtn;

    @FindBy(css="a.button-2.print-order-button")
    public WebElement printorderbtn;

    public void saveandprintorder()
    {
        clickbutton(saveorderbtn);
        clickbutton(printorderbtn);
    }
}
