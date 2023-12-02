package pickBazar.tests.us_009;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_012 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı Grocery ile ilgili ürünlerin geldiğini doğrular
5-Kullanıcı ürünlerin fiyat bilgisinin geldiğini doğrular
"

    * */

    @Test
    public void test12(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.scrollDownByJS();
        Assert.assertTrue(groceryPage.urunIsimListesi.size()>0);
        for (WebElement e : groceryPage.urunFiyatListesi    ) {
            Assert.assertTrue(e.isDisplayed());
        }
        Driver.closeDriver();
    }
}
