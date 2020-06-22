package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RegestrationPage extends BasePage {
    public RegestrationPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    WebElement genderradiobtn;
    @FindBy(id = "FirstName")
    WebElement firstnametextbox;
    @FindBy(id = "LastName")
    WebElement lastnametextbox;
    @FindBy(id = "Email")
    WebElement emailtextbox;
    @FindBy(id = "Password")
    WebElement passwordtextbox;
    @FindBy(id="ConfirmPassword")
    WebElement confirmpassordtextbox;
    @FindBy(id ="register-button")
    WebElement registerbtn;
    @FindBy(linkText = "Log out")
   public  WebElement logoutlink;
    @FindBy(className = "div.result")
   public WebElement notifsuccess;
    @FindBy(linkText = "My account")
    public WebElement myaccountlink;

    public void userregestration(String firstname,String lastname,String email,String password)
    {
        clickbutton(genderradiobtn);
        settext(firstnametextbox,firstname);
        settext(lastnametextbox,lastname);
        settext(emailtextbox,email);
        settext(passwordtextbox,password);
        settext(confirmpassordtextbox,password);
        clickbutton(registerbtn);

    }

    public void myaccount()
    {
        clickbutton(myaccountlink);
    }

    public void userlogout()
    {
        clickbutton(logoutlink);
    }

}
