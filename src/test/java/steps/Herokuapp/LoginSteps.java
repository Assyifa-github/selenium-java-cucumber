package steps.Herokuapp;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageobject.herokuapp.LoginPO;
import utilities.ThreadManager;

public class LoginSteps {
    private WebDriver driver = ThreadManager.getDriver();
    private LoginPO login = new LoginPO(driver);

    @When("user input username {string}")
    public void user_input_username(String username) {
        login.enterUsername(username);
    }
    @When("user input password {string}")
    public void user_input_password(String email) {
        login.enterPassword(email);
    }

    @And("user click login button")
    public void user_click_login_button() throws InterruptedException {
        login.clickOnLoginButton();
    }

    @Then("user can see success message")
    public void user_can_see_success_message() throws InterruptedException {
        Assert.assertTrue("No success message after valid login", login.verifySuccessMessage());
    }

}
