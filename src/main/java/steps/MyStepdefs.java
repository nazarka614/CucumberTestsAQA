package steps;

import configuretions.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pageobject.RozetkaPageObject;
import pageobject.YoutubePageObject;

public class MyStepdefs extends BaseClass {
    static RozetkaPageObject rozetkaPageObject = PageFactory.initElements(driver, RozetkaPageObject.class);

    @Then("Get All links in menu and print in consol")
    public void getAllLinksInMenuAndPrintInConsol() {
        rozetkaPageObject.getUrlPanel();
    }

    @And("Get all summery panel text in consol")
    public void getAllSummeryPanelTextInConsol() {
        rozetkaPageObject.getUrlText();
    }

    @When("Open random get link")
    public void openRandomGetLink() {
        driver.get(rozetkaPageObject.randomURL());

    }

    @And("Get Title")
    public void getTitle() {
        System.out.println(driver.getTitle());
    }
}
