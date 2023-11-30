package pickBazar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import pickBazar.utilities.Driver;

import java.util.List;
import java.util.Set;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Questions')]")//""Questions, Comments, Or Concerns?"" bölümü
    public WebElement questionsCommentsConcernsText;
    @FindBy(id = "name")//Name bölümü
    public WebElement nameTextAlani;
    @FindBy(id = "email")//email bölümü
    public WebElement emailTextAlani;
    @FindBy(id = "subject")//subject bölümü
    public WebElement subjectTextAlani;
    @FindBy(id = "description")//description bölümü
    public WebElement descriptionTextAlani;
    @FindBy(xpath = "//button[.='Submit']")//Submit butonu
    public WebElement submitButon;
    @FindBy(xpath = "//input[@id='name']/following-sibling::p")//nameUyariMesaji
    public WebElement nameUyariMesaji;
    @FindBy(xpath = "//input[@id='email']/following-sibling::p")//emailUyariMesaji
    public WebElement emailUyariMesaji;
    @FindBy(xpath = "//input[@id='subject']/following-sibling::p")//subjectUyariMesaji
    public WebElement subjectUyariMesaji;
    @FindBy(xpath = "//input[@id='description']/following-sibling::p")//descriptionUyariMesaji
    public WebElement descriptionUyariMesaji;

    @FindBy(xpath = "//div/p")//uyariMesajlariList
    public List<WebElement> uyariMesajlariList;

    @FindBy(xpath = "//div[@role='alert']")//onayMesaji
    public WebElement onayMesaji;
    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[1]")//address bolumu
    public WebElement addressBolumu;
    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[2]")//phone bolumu
    public WebElement phoneBolumu;
    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[3]")//website bolumu
    public WebElement websiteBolumu;
    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[4]")//FollowUs bolumu
    public WebElement followUsBolumu;

    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[4]/div/a[1]")//facebook ikonu
    public WebElement facebookIcon;
    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[4]/div/a[2]")//twitter ikonu
    public WebElement twitterIcon;
    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[4]/div/a[3]")//instagram ikonu
    public WebElement instagramIcon;

    @FindBy(xpath = "(//div[@class='mb-8 flex flex-col'])[3]/div/a")//visitThisSiteLink
    public WebElement visitThisSiteLink;


    public void linkWindowHandle(WebElement elementLink, String expectedURL) {
        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        elementLink.click();
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        allWindowHandles.remove(mainWindowHandle);
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                Driver.getDriver().switchTo().window(handle);
                String currentURL = Driver.getDriver().getCurrentUrl();
                Assert.assertEquals(currentURL, expectedURL, "Link eşleşmedi");
                if (currentURL.equals(expectedURL)) {
                    Driver.getDriver().close();
                    Driver.getDriver().switchTo().window(mainWindowHandle);
                    return;
                }
                Driver.getDriver().close();
            }
        }
        Driver.getDriver().switchTo().window(mainWindowHandle);
    }
    public void switchToWindow(String targetTitle) {
        String origin =  Driver.getDriver().getWindowHandle();
        for (String handle :  Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if ( Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }


}
