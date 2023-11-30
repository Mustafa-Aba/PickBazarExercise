package pickBazar.tests.us_003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;
import pickBazar.utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

public class TC_004  {
    /*

"1-Kullanıcı ana sayfaya gider
 2-Kullanıcı Shelf dropdown menu tıklar
 3-Kullanıcı aşağıdaki seceneklerin geldiği doğrular
  -Grocery
 - Bakery
 - MakeUp
 - Bags
 - Clothing
 - Furniture
 - Daily Needs
 4-Kullanıcı herbir secenek için sublinke geciş yapıldığını doğrular"*/
    @Test
    public void test4() {
        HomePage homePage = new HomePage();
        Driver.getDriver().navigate().to(ConfigReader.getProperty("pickBazarUrl"));

        List<String> expectedUrlList=new ArrayList<String>();
        expectedUrlList.add(ConfigReader.getProperty("groceryUrl"));
        expectedUrlList.add(ConfigReader.getProperty("bakeryUrl"));
        expectedUrlList.add(ConfigReader.getProperty("makeupUrl"));
        expectedUrlList.add(ConfigReader.getProperty("bagsUrl"));
        expectedUrlList.add(ConfigReader.getProperty("clothingUrl"));
        expectedUrlList.add(ConfigReader.getProperty("furnitureUrl"));
        expectedUrlList.add(ConfigReader.getProperty("dailyNeedsUrl"));
        expectedUrlList.add(ConfigReader.getProperty("booksUrl"));

        List<String> actualUrlList = new ArrayList<String>();
        homePage.pickBazarButon.click();
        homePage.menuButton.click();

        for (int i = 0; i < homePage.shelfDropDownMenuList.size()-1; i++) {
            ReusableMethods.waitFor(3);
            homePage.shelfDropDownMenuList.get(i).click();
            actualUrlList.add(Driver.getDriver().getCurrentUrl());
        }
        ReusableMethods.waitFor(3);
        homePage.pickBazarButon.click();
        homePage.menuButton.click();
        ReusableMethods.waitFor(3);
        homePage.menuBooksButton.click();
        ReusableMethods.waitFor(5);
        actualUrlList.add(Driver.getDriver().getCurrentUrl());
        Assert.assertEquals(actualUrlList, expectedUrlList);
        Driver.closeDriver();



    }

}
