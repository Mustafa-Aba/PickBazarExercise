package pickBazar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pickBazar.utilities.Driver;

import java.util.List;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h1[contains(text(),'Questions')]")//""Questions, Comments, Or Concerns?"" bölümü
    public WebElement questionsCommentsConcernsText;
    @FindBy(id = "name")//Name bölümü
    public WebElement nameTextAlani;
    @FindBy(id = "email")//email bölümü
    public WebElement emailTextAlani;
    @FindBy(id = "subject")//subject bölümü
    public WebElement subjectTextAlani;
    @FindBy(id = "description")//description bölümü
    public WebElement descriptionTextAlani;
    @FindBy(xpath = "//button[.='Submit']")//Submit butonu
    public WebElement submitButon;
    @FindBy(xpath = "//input[@id='name']/following-sibling::p")//nameUyariMesaji
    public WebElement nameUyariMesaji;
    @FindBy(xpath = "//input[@id='email']/following-sibling::p")//emailUyariMesaji
    public WebElement emailUyariMesaji;
    @FindBy(xpath = "//input[@id='subject']/following-sibling::p")//subjectUyariMesaji
    public WebElement subjectUyariMesaji;
    @FindBy(xpath = "//input[@id='description']/following-sibling::p")//descriptionUyariMesaji
    public WebElement descriptionUyariMesaji;

    @FindBy(xpath = "//div/p")//uyariMesajlariList
    public List<WebElement> uyariMesajlariList;

    @FindBy(xpath = "//div[@role='alert']")//onayMesaji
    public WebElement onayMesaji;





}
