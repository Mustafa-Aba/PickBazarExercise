package pickBazar.tests.us_009;

import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;

public class TC_025 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı gelen ürünlerden ilk ürüne tıklar
5-Kullanıcı  açılan ürün altkartında ürün bilgisi yazısının altında ""Read more"" butonu olduğunu doğrular
6-Kullanıcı ""Read more"" butonuna tıklar
7-Kullanıcı ürün bilgisinin arttığını doğrular
8-Kullanıcı  ürün bilgisi yazısının altında ""Less"" butonu olduğunu doğrular
9-Kullanıcı ""Less"" butonuna tıklar
10-Kullanıcı ürün bilgisinin azaldığını doğrular"

    * */

    @Test
    public void test2(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();

        Driver.closeDriver();
    }
}
