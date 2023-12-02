package pickBazar.tests.us_009;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_004 {
    /*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı text alanına ""apple"" yazar
4-Kullanıcı ""Search"" butonuna tıklar
5-Kullanıcı ""apple"" ile ilgili ürünlerin geldiğini doğrular "


    * */

    @Test
    public void test4(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.waitFor(3);
        groceryPage.searchBox.sendKeys("apple");
        ReusableMethods.waitFor(3);
        groceryPage.searchButton.click();
        for (WebElement e : groceryPage.urunIsimListesi      ) {
            Assert.assertTrue(e.getText().toLowerCase().contains("apple"));
        }
        Driver.closeDriver();
    }
}
