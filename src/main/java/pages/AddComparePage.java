package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddComparePage extends BasePage{
    public AddComparePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "a.clear-list")
    WebElement clearbtn;

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
   public WebElement product1;

    @FindBy(linkText = "Asus N551JK-XO076H Laptop")
    public WebElement product2;

    @FindBy(css="div.no-data")
   public WebElement confirmation;
public void userclearcmparepage()
{
    clickbutton(clearbtn);
}
}
