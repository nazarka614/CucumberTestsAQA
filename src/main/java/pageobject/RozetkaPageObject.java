package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class RozetkaPageObject {
    @FindBy(xpath = "//ul[contains(@class, \"menu-categories\") and contains(@class, \"menu-categories_type_main\")]")
    WebElement menuPanel;

    public void getUrlPanel(){
        List<WebElement> listUrl = menuPanel.findElements(By.xpath("//a[contains(@class, \"menu-categories__link\") and contains(@class, \"js-menu-categories__link\")]"));
        for (WebElement l: listUrl){
            System.out.println(l.getAttribute("href"));
        }
    }

    public void getUrlText(){
        List<WebElement> listText = menuPanel.findElements(By.xpath("//a[contains(@class, \"menu-categories__link\")]"));
        for (WebElement l: listText){
            System.out.println(l.getText());
        }
    }

    public String randomURL(){
        List<WebElement> listUrl = menuPanel.findElements(By.xpath("//a[contains(@class, \"menu-categories__link\") and contains(@class, \"js-menu-categories__link\")]"));
        return listUrl.get(new Random().nextInt(listUrl.size())).getAttribute("href");
    }
}
