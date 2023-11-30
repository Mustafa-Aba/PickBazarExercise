package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_005 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Name alanına "" "" yazar(space tuşuna basar)
4-Kullanıcı Email alanına ""nenopey862@frandin.com"" yazar
5-Kullanıcı Subject alanına ""TestCase1"" yazar
6-Kullanıcı Description alanına ""TestSteps"" yazar
7-Kullanıcı Submit Butonuna tıklar
8-Kullanıcı Name alanının altında ""The provided name format is not valid"" uyarı mesajı geldiğini doğrular
"

*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.contactButon.click();
        contactPage.nameTextAlani.sendKeys(" ");
        contactPage.emailTextAlani.sendKeys("nenopey862@frandin.com");
        contactPage.subjectTextAlani.sendKeys("TestCase1");
        contactPage.descriptionTextAlani.sendKeys("TestSteps");
        contactPage.submitButon.click();
        String expectedUyariMesaji = "The provided name format is not valid";
        Assert.assertTrue(contactPage.nameUyariMesaji.isDisplayed(),"Uyarı mesajı çıkmadı");
        Assert.assertEquals(contactPage.nameUyariMesaji.getText(), expectedUyariMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
