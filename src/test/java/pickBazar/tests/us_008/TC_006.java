package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_006 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Name alanına ""Tester"" yazar
4-Kullanıcı Subject alanına ""TestCase1"" yazar
5-Kullanıcı Description alanına ""TestSteps"" yazar
6-Kullanıcı Submit Butonuna tıklar
7-Kullanıcı Email alanının altında ""You must need to provide your email address"" uyarı mesajının geldiğini doğrular
"

*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.contactButon.click();
        contactPage.nameTextAlani.sendKeys("Tester");
        //contactPage.emailTextAlani.sendKeys("nenopey862@frandin.com");
        contactPage.subjectTextAlani.sendKeys("TestCase1");
        contactPage.descriptionTextAlani.sendKeys("TestSteps");
        contactPage.submitButon.click();
        String expectedUyariMesaji = "You must need to provide your email address";
        ReusableMethods.waitFor(3);
        Assert.assertTrue(contactPage.emailUyariMesaji.isDisplayed(),"Uyarı mesajı çıkmadı");
        Assert.assertEquals(contactPage.emailUyariMesaji.getText(), expectedUyariMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
