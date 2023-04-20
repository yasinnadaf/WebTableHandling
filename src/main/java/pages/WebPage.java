package pages;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class WebPage extends BaseClass {
    public WebDriver driver;
    @FindBy (xpath = "//table/tbody/tr[3]/td[3]")
    WebElement getThirdData;

    public WebPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void handleTable(){
        String getData = getThirdData.getText();
        System.out.println("getting data third row third column: "+ getData);

        ArrayList<WebElement> trSize = (ArrayList<WebElement>) driver.findElements(By.xpath("//table/tbody/tr"));
        int totalRows = trSize.size();
        System.out.println("Total rows: "+totalRows);
        System.out.println("1st index data"+trSize.get(1).getText());
    }
}
