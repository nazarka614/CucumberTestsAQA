package steps;

import configuretions.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.PageFactory;
import pageobject.FootbollPageObject;
import pageobject.RozetkaPageObject;

import static configuretions.BaseClass.driver;

public class footbollSteps extends BaseClass {
    static FootbollPageObject footbollPageObject = PageFactory.initElements(driver, FootbollPageObject.class);
    @And("Click log button")
    public void clickLogButton() {
        footbollPageObject.clickButtonLog();
    }

    @And("Enter mail {string}")
    public void enterMail(String mail) {
        footbollPageObject.EnterMail(mail);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        footbollPageObject.EnterPassword(password);
    }

    @Then("Click enter button")
    public void clickEnterButton() {
        footbollPageObject.clickButtonEnter();
    }
}
