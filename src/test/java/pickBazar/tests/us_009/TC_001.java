package pickBazar.tests.us_009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.GroceryPage;
import pickBazar.pages.HomePage;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

public class TC_001 {
    /*"1-Kullanıcı ana sayfaya gider
2-Kullanıcı Shelf dropdown menu görüntüler
3-Kullanıcı Shelf dropdown ""Grocery"" seçenegine tıklar
4-""Groceries Delivered in 90 Minute"" yazisinin görüntülendiğini doğrular
5-""Get your healthy foods & snacks delivered at your doorsteps all day everyday"" yazisinin görüntülendiğini doğrular"

    * */

    @Test
    public void test1(){
        HomePage homePage = new HomePage();
        GroceryPage groceryPage= new GroceryPage();
        homePage.getGroceryPage();
        Assert.assertTrue(groceryPage.groceryPageText.getText().contains("Groceries Delivered in 90 Minute"));
        Assert.assertTrue(groceryPage.groceryPageText.getText().contains("Get your healthy foods & snacks delivered at your doorsteps all day everyday"));
        ReusableMethods.scrollDownByJS();
        Driver.closeDriver();
    }
}
