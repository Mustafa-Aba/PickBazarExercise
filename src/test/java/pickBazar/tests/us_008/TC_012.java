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
