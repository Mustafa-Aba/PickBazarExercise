package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_013 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ekranin sol tarafinda  -Website  görüntülendiğini doğrular
4-Kullanıcı ekranin sol tarafinda  ""Visit this Site"" butonu görüntülendiğini doğrular

"


*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        Assert.assertTrue(contactPage.websiteBolumu.getText().contains("Website"));
        Assert.assertTrue(contactPage.visitThisSiteLink.isDisplayed(),"'Visit this Site' butonu görüntülenemedi");
        Driver.closeDriver();

    }


}
