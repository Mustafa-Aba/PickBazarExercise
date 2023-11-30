package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_012 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ekranin sol tarafinda Address görüntülendiğini doğrular
4-Kullanıcı ekranin sol tarafinda Phone görüntülendiğini doğrular
"

*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        Assert.assertTrue(contactPage.addressBolumu.getText().contains("Address"));
        Assert.assertTrue(contactPage.phoneBolumu.getText().contains("Phone"));
        Driver.closeDriver();

    }


}
