package pickBazar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pickBazar.utilities.Driver;

public class DailyNeedsPage {

    public DailyNeedsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[text()='Daily Needs']")
    public WebElement dailyNeedButton;

    @FindBy(id =  "//*[@id='headlessui-menu-button-1']")
    public WebElement clicktoDaily ;

}
