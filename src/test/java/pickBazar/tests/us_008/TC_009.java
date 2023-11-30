package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_009 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Name alanına ""Tester"" yazar
4-Kullanıcı Email alanına ""nenopey862@frandin.com"" yazar
5-Kullanıcı Description alanına ""TestSteps"" yazar
6-Kullanıcı Submit Butonuna tıklar
7-Kullanıcı Subject alanının altında ""What subject do you want to discuss with us?"" uyarı mesajının geldiğini doğrular
"


*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        homePage.getContactPage();
        contactPage.nameTextAlani.sendKeys("Tester");
        contactPage.emailTextAlani.sendKeys("nenopey862@frandin.com");

        contactPage.descriptionTextAlani.sendKeys("TestSteps");
        contactPage.submitButon.click();
        String expectedUyariMesaji = "What subject do you want to discuss with us?";
        ReusableMethods.waitFor(3);
        Assert.assertTrue(contactPage.subjectUyariMesaji.isDisplayed(),"Uyarı mesajı çıkmadı");
        Assert.assertEquals(contactPage.subjectUyariMesaji.getText(), expectedUyariMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
