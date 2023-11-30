package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

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
        contactPage.nameTextAlani.sendKeys("Tester");
        contactPage.emailTextAlani.sendKeys("nenopey862frandin.com");
        contactPage.subjectTextAlani.sendKeys("TestCase1");
        contactPage.descriptionTextAlani.sendKeys("TestSteps");
        contactPage.submitButon.click();
        String expectedUyariMesaji = "The provided email address format is not valid";
        ReusableMethods.waitFor(3);
        Assert.assertTrue(contactPage.emailUyariMesaji.isDisplayed(),"Uyarı mesajı çıkmadı");
        Assert.assertEquals(contactPage.emailUyariMesaji.getText(), expectedUyariMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
