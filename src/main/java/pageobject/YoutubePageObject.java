package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YoutubePageObject {
    @FindBy(xpath = "//input[@id='search']")
    WebElement searchField;
    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[6]/div[1]/ytd-button-renderer[2]/yt-button-shape/button")
    WebElement accept;
    @FindBy(xpath = "//div[@id=\"contents\" and contains(@class, \"ytd-section-list-renderer\")]")
    WebElement scopeLink;

    public void setAccept(){
        this.accept.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void sendkey(String str){
        this.searchField.sendKeys(str);
        this.searchField.submit();
    }

    public void getAllLinks(){
        List<WebElement> listUrl = scopeLink.findElements(By.xpath("//a[@id=\"thumbnail\"]"));
        for (WebElement l: listUrl){
            System.out.println(l.getAttribute("href"));
        }
    }
}

