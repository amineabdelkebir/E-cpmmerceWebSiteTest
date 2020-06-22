package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailtofriendPage extends BasePage {
    public EmailtofriendPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id="FriendEmail")
    WebElement friendemail;

    @FindBy(id="YourEmailAddress")
    WebElement myemail;

    @FindBy(id="PersonalMessage")
    WebElement message;

    @FindBy(css="input.button-1.send-email-a-friend-button")
    WebElement sendemailbtn;

    @FindBy(css ="div.result")
    public WebElement confirmation;

    public void usersendemailtofreind(String femail,String text)
    {
        settext(friendemail,femail);
        settext(message,text);
        clickbutton(sendemailbtn);

    }

}
