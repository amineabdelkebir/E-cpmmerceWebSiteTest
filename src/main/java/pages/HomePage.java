package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {

        super(driver);
        action = new Actions(driver);
    }

    @FindBy(linkText = "Register")
    WebElement rgisterlink;

    @FindBy(css = "a.ico-login")
    public WebElement loginlink;

    @FindBy(linkText = "My Account")
    WebElement myaccountlink;


    @FindBy(linkText = "Contact us")
    WebElement contactuslink;

    @FindBy(id="customerCurrency")
    WebElement customerCurrency;

    @FindBy(xpath= "/html/body/div[6]/div[2]/ul[1]/li[1]/a")
    public   WebElement computermenu;

    @FindBy(linkText = "Notebooks")
    WebElement notebookmenue;



    public void openregistrationpage()
    {
        clickbutton(rgisterlink);
    }

    public void openloginpage()
    {
        clickbutton(loginlink);
    }

public void opencontactus()
{
    //scrolltobottom();
    clickbutton(contactuslink);
}
    public void changecurrency()
    {
        select = new Select(customerCurrency);
        select.selectByVisibleText("Euro");
    }

    public void selectnoteboxmenu()
    {
        action.moveToElement(computermenu).moveToElement(notebookmenue)
                .click()
                .build()
                .perform();
    }
}