package pageobject.herokuapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import utilities.SeleniumHelpers;

public class LoginPO {
    WebDriver driver;
    SeleniumHelpers selenium;
    public LoginPO(WebDriver driver) {
        this.driver = driver;
        selenium = new SeleniumHelpers(driver);

        //This initElements method will create all WebElements
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }
    @FindBy(id = "username")
    private WebElement usernameField;

    @FindBy(id = "password")
    private WebElement passwordField;

    @FindBy(xpath= "//*[@class='radius']")
    private WebElement loginButton;

    @FindBy(id = "flash-messages")
    private WebElement successMessage;

    /**
     * Enter username
     * @param username
     */
    public void enterUsername(String username) {
        selenium.enterText(usernameField, username, true);
    }

    /**
     * Enter password
     * @param password
     */
    public void enterPassword(String password) {
        selenium.enterText(passwordField, password, true);
    }

    /**
     * click on login button
     * @throws InterruptedException
     */

    public void clickOnLoginButton() throws InterruptedException {
        selenium.clickOn(loginButton);
    }

    /**
     * Verify success login message after inputting valid credentials
     */

    public boolean verifySuccessMessage() throws InterruptedException {
        return selenium.isElementAppeared(successMessage);
    }
}

