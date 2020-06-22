package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class BaseTest {


    public static WebDriver driver;
    public static String downloadpath = System.getProperty("user.dir") + "/download";

    public static ChromeOptions chromeOption()
    {
        ChromeOptions options = new ChromeOptions();
        HashMap<String, Object> chromeprefs = new HashMap<String, Object>();
        chromeprefs.put("profile.default.content_settings.popus",0);
        chromeprefs.put("profile.default_directory", downloadpath);
        options.setExperimentalOption("prefs", chromeprefs);
        options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return options;

    }
    @BeforeSuite
    public void starDriver() {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        driver = new ChromeDriver(chromeOption());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");

    }

    @AfterSuite
    public void stopdriver()
    {
        driver.quit();
    }
}