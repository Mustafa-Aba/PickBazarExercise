package pickBazar.tests.us_008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_002 {
/*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Contact butonuna tıklar
3-Kullanıcı ""Questions, Comments, Or Concerns?"" bölümününde ;
-Name
-Email
-Subject
-Description
-Submit butonu
 görüntelendiğini doğrular"

*/
    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        ContactPage contactPage = new ContactPage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        homePage.contactButon.click();
        Assert.assertTrue(contactPage.questionsCommentsConcernsText.isDisplayed());
        Assert.assertTrue(contactPage.nameTextAlani.isDisplayed());
        Assert.assertTrue(contactPage.emailTextAlani.isDisplayed());
        Assert.assertTrue(contactPage.subjectTextAlani.isDisplayed());
        Assert.assertTrue(contactPage.descriptionTextAlani.isDisplayed());
        Assert.assertTrue(contactPage.submitButon.isDisplayed());
        Assert.assertTrue(contactPage.submitButon.isEnabled());


    }


}
