package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CheckOutAsGuestPage extends BasePage {
    public CheckOutAsGuestPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css="input.button-1.checkout-as-guest-button")
    WebElement checkasguestbtn;

    @FindBy(id="BillingNewAddress_FirstName")
    WebElement firstnametxbox;

    @FindBy(id="BillingNewAddress_LastName")
    WebElement lastnametxtbox;

    @FindBy(id="BillingNewAddress_Email")
    WebElement emailtxtbox;

    @FindBy(xpath="//*[@id=\"BillingNewAddress_CountryId\"]")
    WebElement country ;

    @FindBy(id="BillingNewAddress_StateProvinceId")
   public WebElement state;

    @FindBy(id="BillingNewAddress_City")
    WebElement citytxtbox;

    @FindBy(id="BillingNewAddress_Address1")
    WebElement adressetxtbox;

    @FindBy(id="BillingNewAddress_ZipPostalCode")
    WebElement zipcodetxtbox;

    @FindBy(id="BillingNewAddress_PhoneNumber")
    WebElement phonenumbertxtbox;

    @FindBy(id="billing-buttons-container")
    WebElement continuetoshippingbtn;

    @FindBy(id="shippingoption_0")
    WebElement radiogroundbtn;

    @FindBy(css="input.button-1.shipping-method-next-step-button")
    WebElement continueshippingmethodbtn;

    @FindBy(id="paymentmethod_0")
    WebElement radiobtnpay;

    @FindBy(css="input.button-1.payment-method-next-step-button")
    WebElement continuepayinfobtn;

    @FindBy(css="input.button-1.payment-info-next-step-button")
    WebElement continueconfirm;

    @FindBy(css="input.button-1.confirm-order-next-step-button")
    WebElement confirmbtn;

    @FindBy(css="div.title")
  public  WebElement confirmationcommand;

    @FindBy(linkText = "Click here for order details.")
    WebElement detailsorderbtn;

    public void buildingadresse(String fname,String lname,String email,String city,
                                String adresse,String zipcode,String phone)
    {
        clickbutton(checkasguestbtn);
    settext(firstnametxbox,fname);
    settext(lastnametxtbox,lname);
    settext(emailtxtbox,email);
        select = new Select(country);
        select.selectByVisibleText("United States");
     //   select2 = new Select(state);
       // select2.selectByIndex(5);


        settext(citytxtbox,city);
    settext(adressetxtbox,adresse);
    settext(zipcodetxtbox,zipcode);
    settext(phonenumbertxtbox,phone);
    clickbutton(continuetoshippingbtn);


    }

    public void chooseshippingandmethodpaymentandconfirm()
    {
        clickbutton(radiogroundbtn);
        clickbutton(continueshippingmethodbtn);
        clickbutton(radiobtnpay);
        clickbutton(continuepayinfobtn);
        clickbutton(continueconfirm);
        clickbutton(confirmbtn);
        clickbutton(detailsorderbtn);
    }
}
