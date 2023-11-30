package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_015 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ekranin sol tarafinda -Follow Us  görüntülendiğini doğrular
4-Kullanıcı ekranin sol tarafinda , ""Facebook, Twitter, Instagram"" link butonlari görüntülendiğini doğrular


*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        Assert.assertTrue(contactPage.followUsBolumu.getText().contains("Follow Us"));
        Assert.assertTrue(contactPage.facebookIcon.isDisplayed(),"'Facebook' link butonu görüntülenemedi");
        Assert.assertTrue(contactPage.twitterIcon.isDisplayed(),"'Twitter' link butonu görüntülenemedi");
        Assert.assertTrue(contactPage.instagramIcon.isDisplayed(),"'Instagram' link butonu görüntülenemedi");
        Driver.closeDriver();

    }


}
