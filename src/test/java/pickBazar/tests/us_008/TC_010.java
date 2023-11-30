package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_010 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Name alanına ""Tester"" yazar
4-Kullanıcı Email alanına ""nenopey862@frandin.com"" yazar
5-Kullanıcı Subject alanına ""TestCase1"" yazar
6-Kullanıcı Submit Butonuna tıklar
7-Kullanıcı Description alanının altında ""Tell us more about it"" uyarı mesajının geldiğini doğrular
"


*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        contactPage.nameTextAlani.sendKeys("Tester");
        contactPage.emailTextAlani.sendKeys("nenopey862@frandin.com");
        contactPage.subjectTextAlani.sendKeys("TestCase1");
        contactPage.submitButon.click();
        String expectedUyariMesaji = "Tell us more about it";
        ReusableMethods.waitFor(3);
        Assert.assertTrue(contactPage.descriptionUyariMesaji.isDisplayed(),"Uyarı mesajı çıkmadı");
        Assert.assertEquals(contactPage.descriptionUyariMesaji.getText(), expectedUyariMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
