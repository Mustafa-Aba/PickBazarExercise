package pickBazar.tests.us_008;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_011 {
/*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı Name alanına ""Tester"" yazar
4-Kullanıcı Email alanına ""nenopey862@frandin.com"" yazar
5-Kullanıcı Subject alanına ""TestCase1"" yazar
6-Kullanıcı Description alanına ""TestSteps"" yazar
7-Kullanıcı Submit Butonuna tıklar
8-Kullanıcı sağ üst köşede ""Thank you for contacting us. We will get back to you soon."" onay mesajının geldiğini doğrular
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
        contactPage.descriptionTextAlani.sendKeys("TestSteps");
        contactPage.submitButon.click();
        String expectedOnayMesaji = "Thank you for contacting us. We will get back to you soon.";

        Actions action =new Actions(Driver.getDriver());
        action.moveToElement(contactPage.onayMesaji).perform();// mouse ile uzerine gelindi. Onay mesajı gorunumu kısa olduğu için
        ReusableMethods.waitFor(3);
        Assert.assertTrue(contactPage.onayMesaji.isDisplayed(),"Onay mesajı çıkmadı");
        Assert.assertEquals(contactPage.onayMesaji.getText(), expectedOnayMesaji,"Uyarı mesajı eşleşmedi");
        Driver.closeDriver();

    }


}
