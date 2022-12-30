package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FootbollPageObject {
    @FindBy(id = "loginemail")
    WebElement mailField;
    @FindBy(id = "loginpassword")
    WebElement passwordField;
    @FindBy(id = "enter-link")
    WebElement buttonLog;

    @FindBy(xpath = "//button[@class = 'submit' and contains(@onclick, \"Autorization\")]")
    WebElement buttonEnter;




    public void EnterPassword(String password) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.passwordField.sendKeys(password);

    }
    public void EnterMail(String mail) {

        this.mailField.sendKeys(mail);
    }

    public void clickButtonLog() {

        this.buttonLog.click();
    }
    public void clickButtonEnter() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.buttonEnter.click();
    }
}
