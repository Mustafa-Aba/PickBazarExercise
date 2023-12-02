package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_014 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı  ekranin sol tarafinda ""Meat & Fish"" dropdown menu button olduğunu doğrular
5-Kullanıcı  ""Meat & Fish""  dropdown menu buttona tıklar
6-Kullanıcı  ""Fresh Fish"" ve ""Meat"" alt basliklarin göründüğünü doğrular
7-Kullanıcı sırasıyla alt başlıklara tıklar
8-Eğer alt başlığa ait ürünler yoksa kullanıcı ""Sorry, No Product Found :("" yazısının geldiğini doğrular
9-Eğer alt başlığa ait ürünler varsa ürünlerin geldiğini doğrular
10-Kullanıcı ürün kartlarına tıklabildiğini doğrular"

    * */

    @Test
    public void test14(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        ReusableMethods.scrollDownByJS();
        Assert.assertTrue(groceryPage.groceryAltKategoriList.get(1).isEnabled());
        groceryPage.groceryAltKategoriList.get(1).click();
        Assert.assertEquals(groceryPage.freshFishButon.getText(),"Fresh Fish");
        Assert.assertEquals(groceryPage.meatButon.getText(),"Meat");
        groceryPage.altKategorideUrunKontrolu(groceryPage.freshFishButon);
        groceryPage.altKategorideUrunKontrolu(groceryPage.meatButon);

        Driver.closeDriver();
    }
}
