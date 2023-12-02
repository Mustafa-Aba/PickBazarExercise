package pickBazar.tests.us_009;

import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;

public class TC_015 {
    /*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı  ekranin sol tarafinda ""Snacks"" dropdown menu button olduğunu doğrular
5-Kullanıcı  ""Snacks"" dropdown menu buttona tıklar
6-Kullanıcı  ""Nuts&Biscuits"", ""Chocolates"", ""Crisps"", ""Noodles&Pasta"", ""Sauce"" ve ""Soup"" alt basliklarin göründüğünü doğrular
7-Kullanıcı sırasıyla alt başlıklara tıklar
8-Eğer alt başlığa ait ürünler yoksa kullanıcı ""Sorry, No Product Found :("" yazısının geldiğini doğrular
9-Eğer alt başlığa ait ürünler varsa ürünlerin geldiğini doğrular
10-Kullanıcı ürün kartlarına tıklabildiğini doğrular"


    * */

    @Test
    public void test15(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();

        Driver.closeDriver();
    }
}
