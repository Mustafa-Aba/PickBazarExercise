package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_008 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Name alanına ""Tester"" yazar
4-Kullanıcı Email alanına ""nenopey862@frandin"" yazar
5-Kullanıcı Subject alanına ""TestCase1"" yazar
6-Kullanıcı Description alanına ""TestSteps"" yazar
7-Kullanıcı Submit Butonuna tıklar
8-Kullanıcı Email alanının altında""The provided email address format is not valid"" uyarı mesajının geldiğini doğrular
"

*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        contactPage.nameTextAlani.sendKeys("Tester");
        contactPage.emailTextAlani.sendKeys("nenopey862@frandin");
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
