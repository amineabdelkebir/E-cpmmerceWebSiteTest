package tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pages.HomePage;
import pages.LoginPage;
import pages.RegestrationPage;


public class UserRegistrationTestwithDDTandEXCELfile extends BaseTest {


    HomePage homeobject;
    RegestrationPage registerobject;
    LoginPage loginObject;

    @DataProvider(name="excelfile")


    public Object[][] userregisterdata() throws IOException
    //Object[][]
    {

        ExcelReader ER =new ExcelReader();
        return ER.getExcelData();

    }


    @Test(dataProvider = "excelfile")
    public void usercanregistersuccssfuly(String fname,String lname,String email,String password)
    {
        homeobject = new HomePage(driver);
        homeobject.openregistrationpage();
        registerobject = new RegestrationPage(driver);
        System.out.println("je suis la");
        registerobject.userregestration(fname,lname,email,password);
        Assert.assertTrue(registerobject.notifsuccess.getText().contains("Your registration completed"));
        registerobject.userlogout();
        homeobject.openloginpage();
        loginObject = new LoginPage(driver);
        loginObject.userlogin(email, password);
        Assert.assertTrue(registerobject.logoutlink.getText().equals("Log out"));

    }

}
