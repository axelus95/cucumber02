import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStepdefs {
    WebDriver driver = SetupClass.driver;

    public MyStepdefs(){
        PageFactory.initElements(driver, this);
    }


    @Given("I open authentication")
    public void iOpenAuthentification() {
        driver.get("https://www.saucedemo.com");
    }

    @When("I add username {string}")
    public void iAddUsername(String arg0) {
        driver.findElement(By.cssSelector("input.input_error.form_input#user-name")).sendKeys(arg0);

    }

    @And("I add password  {string}")
    public void iAddPassword(String arg0) {
        driver.findElement(By.cssSelector("input.input_error.form_input#password")).sendKeys(arg0);

    }
    @FindBy(css = "input#login-button.submit-button.btn_action")
    public WebElement connexionButton;
    @And("I click to validate")
    public void iClickToValidate() {
        connexionButton.click();

    }

    @Then("Im in homepage")
    public void imInHomepage() {
        String titlePage = "Swag Labs";

        WebElement searchResultTitle = driver.findElement(By.cssSelector("div.app_logo"));
        String realResult = searchResultTitle.getText();
        Assert.assertEquals(realResult,titlePage);

    }
}
