package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage{
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="FullName")
    WebElement fullnametxtbox;

    @FindBy(id="Email")
    WebElement emailtxtbox;

    @FindBy(id="Enquiry")
    WebElement Enquirytxtbox;

    @FindBy(css="input.button-1.contact-us-button")
    WebElement submitbtn;

    public void userdocontactus(String fname,String email,String message)
    {
        settext(fullnametxtbox,fname);
        settext(emailtxtbox,email);
        settext(Enquirytxtbox,message);
        clickbutton(submitbtn);
    }
}
