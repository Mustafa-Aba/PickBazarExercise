package pickBazar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.Assert;
import pickBazar.utilities.Driver;

import java.util.List;

public class GroceryPage {
    public GroceryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//h1/parent::div")
    public WebElement groceryPageText;
    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//button[contains(@class,'min-w-[143px]')]")
    public WebElement searchButton;


    @FindBy(xpath = "//h3[contains(@class,'truncate')]")
    public List<WebElement> urunIsimListesi;
    @FindBy(xpath = "//span[contains(@class,'md:text-base')]")
    public List<WebElement> urunFiyatListesi;
    @FindBy(className = "rounded-md py-1")
    public List<WebElement> groceryAltKategoriList;
    @FindBy(xpath = "//article/div")
    public List<WebElement> urunKartListesi;


    @FindBy(xpath = "//h3[contains(@class,'w-full')]")
    public WebElement noProductText;

    @FindBy(xpath = "(//img[@class='w-full h-auto'])[1]")
    public WebElement expressDeliveryFrame;
    @FindBy(xpath = "(//img[@class='w-full h-auto'])[2]")
    public WebElement cashOnDeliveryFrame;
    @FindBy(xpath = "(//img[@class='w-full h-auto'])[3]")
    public WebElement giftVoucherFrame;

    @FindBy(xpath = "//button[.='Fruits']")
    public WebElement fruitsButon;
    @FindBy(xpath = "//button[.='Vegetables']")
    public WebElement vegetablesButon;

    @FindBy(xpath = "//button[.='Fresh Fish']")
    public WebElement freshFishButon;
    @FindBy(xpath = "//button[.='Meat']")
    public WebElement meatButon;

    @FindBy(xpath = "//button[.='Nuts & Biscuits']")
    public WebElement nutsButon;
    @FindBy(xpath = "//button[.='Chocolates']")
    public WebElement chocolatesButon;
    @FindBy(xpath = "//button[.='Crisps']")
    public WebElement crispsButon;
    @FindBy(xpath = "//button[.='Noodles & Pasta']")
    public WebElement noodlesButon;











    public void altKategorideUrunKontrolu(WebElement element) {
        element.click();
        if (urunKartListesi.size() == 0) {
            Assert.assertTrue(noProductText.isDisplayed());
        } else {
            Assert.assertTrue(urunIsimListesi.size() > 0);
            for (WebElement urunKart : urunKartListesi) {
                Assert.assertTrue(urunKart.isEnabled());
            }
        }
    }


}
