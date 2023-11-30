package pickBazar.tests.us_019;

import org.testng.annotations.Test;
import pickBazar.pages.HomePage;
import pickBazar.utilities.ConfigReader;
import pickBazar.utilities.Driver;

public class TC_001 {

    /*
     USER STORY 19 :
     Anasayfa Sepet;
     1- Eger secilen en az 1 ürün varsa, sag tarafta sepet bilgisi cikmalidir. Olmasi gereken bilgiler;
    - ürün miktari(1 items seklinde)
    - toplam fiyat
     2- Anasayfada kücük görüntüdeki sepet bilgileri ürün eklenip cikarildiginda dogru bir sekilde güncellenmelidir.
     3- Anasayfadaki sepet bilgisi tiklanarak sepet ekrani daha büyük bir görüntüde acilabilmeli. "Checkout" secenegi butonu gelmeli.

    Daily Needs ekraninda;
    1- Daily Needs ekraninda sepet ikonu gelmelidir.
    2- Daily Needs ekraninda sepet ikonu tiklandiginda sepet ekrani sagda acilabilmeli. "Checkout" secenegi butonu gelmeli.
    */

    @Test
    public void testSepetBilgisiGoruntulenmeli() throws InterruptedException {
        HomePage homePage = new HomePage();
        Driver.getDriver().get(ConfigReader.getProperty("pickBazarUrl"));
        Thread.sleep(3000);

        // Ürünü sepete ekle



    }


}




