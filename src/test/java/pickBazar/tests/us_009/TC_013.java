package pickBazar.tests.us_009;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_013 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı  ekranin sol tarafinda ""Fruits & Vegetables"" dropdown menu button olduğunu doğrular
5-Kullanıcı  ""Fruits & Vegetables"" dropdown menu buttona tıklar
6-Kullanıcı  ""Fruits"" ve ""Vegetables"" alt basliklarin göründüğünü doğrular
7-Kullanıcı sırasıyla alt başlıklara tıklar
8-Eğer alt başlığa ait ürünler yoksa kullanıcı ""Sorry, No Product Found :("" yazısının geldiğini doğrular
9-Eğer alt başlığa ait ürünler varsa ürünlerin geldiğini doğrular
10-Kullanıcı ürün kartlarına tıklabildiğini doğrular
"

    * */

    @Test
    public void test13(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.scrollDownByJS();
        Assert.assertTrue(groceryPage.groceryAltKategoriList.get(0).isEnabled());
        groceryPage.groceryAltKategoriList.get(0).click();
        Assert.assertEquals(groceryPage.fruitsButon.getText(),"Fruits");
        Assert.assertEquals(groceryPage.vegetablesButon.getText(),"Vegetables");
        groceryPage.altKategorideUrunKontrolu(groceryPage.fruitsButon);
        groceryPage.altKategorideUrunKontrolu(groceryPage.vegetablesButon);

        Driver.closeDriver();
    }
}
