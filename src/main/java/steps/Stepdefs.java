package steps;

import configuretions.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageobject.YoutubePageObject;

public class Stepdefs extends BaseClass {

    static YoutubePageObject youtubePageObject = PageFactory.initElements(driver, YoutubePageObject.class);

    @When("i open page {string}")
    public void iOpenPage(String str) {
        driver.get(str);
    }

    @And("Accept coocies")
    public void acceptCookies() {
        youtubePageObject.setAccept();
    }

    @And("Enter keys {string} in search field")
    public void enterKeysInSearchField(String str) {
        youtubePageObject.sendkey(str);
    }


    @Then("Get All links")
    public void getAllLinks() {
        youtubePageObject.getAllLinks();
    }
}
