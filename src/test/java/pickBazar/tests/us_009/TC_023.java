package pickBazar.tests.us_009;

import org.testng.annotations.Test;
import pickBazar.pages.ContactPage;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;

public class TC_023 {
    /*
"1-Kullanıcı ana sayfaya gider
2-Kullanıcı ""Grocery"" sayfasına gider
3-Kullanıcı scroll down yapar
4-Kullanıcı Grocery ile ilgili gelen ürünlerin maksimum 30 adet olduğunu doğrular
"

    * */

    @Test
    public void test2(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();

        Driver.closeDriver();
    }
}
