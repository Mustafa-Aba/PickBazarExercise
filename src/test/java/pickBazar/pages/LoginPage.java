package pickBazar.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import pickBazar.utilities.Driver;

public class LoginPage {


    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[.='Join']")// ana ekran login olma butonu
    public WebElement joinButton;

    @FindBy(xpath = "//input[@id='email']")// login ekranı email giriş
    public WebElement emailLogin;
    @FindBy(xpath = "//input[@id='password']")// login ekranı password giriş
    public WebElement passwordLogin;
    @FindBy(xpath = "//button[.='Login']")// login ekranı login butonu
    public WebElement loginButton;
    @FindBy(xpath = "//button[.='Login with Google']")// login ekranı google login olma butonu
    public WebElement loginWithGoogleButton;
    @FindBy(xpath = "//button[.='Login with Mobile number']")// login ekranı numara ile login olma butonu
    public WebElement loginWithNumberButton;
    @FindBy(xpath = "//img[@alt='user name']")// login olduktan sonra gelen kullanıcı resmi
    public WebElement personİmage;
    @FindBy(xpath = "//button[.='Forgot password?']")// login ekranı forgot password seçeneği
    public WebElement forgotPasswordButton;
    @FindBy(xpath = "//button[.='Submit Email']")// login ekranı submit email password seçeneği
    public WebElement submitEmailButton;

}
