import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SetupClass {

    public static WebDriver driver;


    @Before
    public static void setup() throws MalformedURLException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("incognito");


        //driver = new RemoteWebDriver(new URL("http://172.16.14.23:4444/wd/hub"),options);
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }


    //@After
    //public void embedScreenshot(Scenario scenario) {

       // if(scenario.isFailed()) {
        //    try {
       //         byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
        //        scenario.embed(screenshot, "image/png");
      //      } catch (WebDriverException noSupportScreenshot) {
        //        System.err.println(noSupportScreenshot.getMessage());
      //      }
       // }
       // driver.quit();
   // }
}

