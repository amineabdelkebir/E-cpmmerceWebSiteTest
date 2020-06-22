package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Email")
  public  WebElement emailtextbox;
    @FindBy(id = "Password")
   public WebElement passwordtextbox;
    @FindBy(css="input.button-1.login-button")
   public WebElement loginbtn;


public void userlogin(String email,String password)
{
    settext(emailtextbox,email);
    settext(passwordtextbox,password);
    clickbutton(loginbtn);
}}
