package org.citihvlynsk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileCityPage {
    public WebDriver driver;
    public ProfileCityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(className = "AuthPopup")
    private WebElement showMenu;

    @FindBy(name ="login")
    private WebElement loginField;

    @FindBy(name="pass")
    private WebElement passwdField;

    @FindBy(className = "SignIn__action")
    private WebElement loginBtn;

    @FindBy(className = "MainHeader__city")
    private WebElement nazGor;

    @FindBy(className = "HeaderUserName")
    private WebElement inMenu;

    @FindBy(className = "UserMenu__menu-link")
    private WebElement myMenu;

    @FindBy(className =  "MainHeader__city")
    private WebElement myCity;

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void showedMenu() {
        showMenu.click();
    }

    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public String sravGor() {return nazGor.getText();}

    public void nazhMenu() { inMenu.click();}

    public void nazhmyMenu() {myMenu.click();}

    public String myLoveCity() {return myCity.getText();}
}
