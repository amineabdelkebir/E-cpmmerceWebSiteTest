package tests;

        import java.io.FileNotFoundException;
        import java.io.IOException;
        import java.text.ParseException;


        import org.testng.Assert;
        import org.testng.annotations.Test;

        import data.JsonDataReader;
        import pages.HomePage;
        import pages.LoginPage;
        import pages.RegestrationPage;


public class RegistrationTestUsingJasonFile extends BaseTest{


    HomePage homeobject;
    RegestrationPage registerobject;
    LoginPage loginObject;

    @Test(priority = 1,alwaysRun = true)
    public void usercanregistersuccssfuly() throws FileNotFoundException, IOException, ParseException
    { JsonDataReader jsonReader = new JsonDataReader();

        try {
            jsonReader.jsonreader();
        } catch (org.json.simple.parser.ParseException e) {
            e.printStackTrace();
        }

        homeobject = new HomePage(driver);
        homeobject.openregistrationpage();
        registerobject = new RegestrationPage(driver);
        registerobject.userregestration(jsonReader.firstname,jsonReader.lastname,jsonReader.email,jsonReader.password);
        Assert.assertTrue(registerobject.notifsuccess.getText().contains("Your registration completed"));
        registerobject.userlogout();

        loginObject = new LoginPage(driver);
        homeobject.openloginpage();

        loginObject.userlogin(jsonReader.email,jsonReader.password);
        Assert.assertTrue(registerobject.logoutlink.getText().equals("Log out"));

    }

}
