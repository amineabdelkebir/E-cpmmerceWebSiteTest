package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "div.title")
    WebElement accountpage;

    @FindBy(linkText = "Change password")
    WebElement changepassbtn;

    @FindBy(id="OldPassword")
    WebElement oldpasswordtxtbox;

    @FindBy(id="NewPassword")
    WebElement newpasswordtxtbox;

    @FindBy(id="ConfirmNewPassword")
    WebElement confirmpassordtxtbox;

    @FindBy(css="input.button-1.change-password-button")
    WebElement savechangebtn;

    public void userchagepassword(String oldpass,String newpass,String confirm)
    {
        clickbutton(changepassbtn);
        settext(oldpasswordtxtbox,oldpass);
        settext(newpasswordtxtbox,newpass);
        settext(confirmpassordtxtbox,confirm);
        clickbutton(savechangebtn);
    }
}
