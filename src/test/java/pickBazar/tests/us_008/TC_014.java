package pickBazar.tests.us_008;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

import java.util.Set;

public class TC_014 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ekranin sol tarafinda ""Visit this Site"" butonuna tıklar
4-Kullanıcı yenisekmede ""https://redq.io/"" sitesine gittiğini doğrular

"


*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        Assert.assertTrue(contactPage.visitThisSiteLink.isEnabled(),"'Visit this Site' butonu tıklanamadı");
        String mainWindowHandle = Driver.getDriver().getWindowHandle();
        contactPage.visitThisSiteLink.click();
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        String newWindowHandle = "";
        for (String handle : allWindowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                newWindowHandle = handle;
                break;
            }
        }
        Driver.getDriver().switchTo().window(newWindowHandle);
        Assert.assertEquals(Driver.getDriver().getCurrentUrl(),"https://redq.io/");
        Driver.getDriver().switchTo().window(mainWindowHandle);
        Driver.closeDriver();
    }

}
