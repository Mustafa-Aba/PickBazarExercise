package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

import java.util.Set;

public class TC_016 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ekranin sol tarafinda ""Facebook"" link butonuna tıklar
4-Kullanıcı yenisekmede ""https://www.facebook.com/"" sitesine gittiğini doğrular
5-Kullanıcı ekranin sol tarafinda ""Twitter"" link butonuna tıklar
6-Kullanıcı yenisekmede ""https://twitter.com/"" sitesine gittiğini doğrular
7-Kullanıcı ekranin sol tarafinda ""Instagram"" link butonuna tıklar
8-Kullanıcı yenisekmede ""https://www.instagram.com/"" sitesine gittiğini doğrular

"


*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        String contactPageTitle=Driver.getDriver().getTitle();
        Assert.assertTrue(contactPage.facebookIcon.isEnabled(),"'Facebook' link butonu tıklanabilir değil");
        contactPage.facebookIcon.click();
        String facebookWindowTitle=Driver.getDriver().getTitle();
        contactPage.switchToWindow(facebookWindowTitle);
        String currentURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(currentURL, "https://www.facebook.com/", "Link eşleşmedi");
        contactPage.switchToWindow(contactPageTitle);
//        Assert.assertTrue(contactPage.twitterIcon.isEnabled(),"'Twitter' link butonu tıklanabilir değil");
//        Assert.assertTrue(contactPage.instagramIcon.isEnabled(),"'Instagram' link butonu tıklanabilir değil");
//
//        contactPage.linkWindowHandle(contactPage.facebookIcon,"https://www.facebook.com/");
//        contactPage.linkWindowHandle(contactPage.twitterIcon,"https://twitter.com/");
//        contactPage.linkWindowHandle(contactPage.instagramIcon,"https://www.instagram.com/");
        Driver.closeDriver();
    }


}
