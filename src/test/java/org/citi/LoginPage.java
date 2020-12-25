package org.citi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {

    public WebDriver driver;
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(text(), 'Войти')]")
    private WebElement statusVoit;

    @FindBy(className = "AuthPopup")
    private WebElement showMenu;

    @FindBy(name ="login")
    private WebElement loginField;

    @FindBy(name="pass")
    private WebElement passwdField;

    @FindBy(className = "SignIn__action")
    private WebElement loginBtn;

    @FindBy(xpath = "//*[contains(text(), 'Алексей')]")
    private WebElement statusVoit1;

    @FindBy(className = "HeaderUserName")
    private WebElement usNme;

    @FindBy(xpath = "/html/body/div[3]/div[2]/header/div[2]/div[2]/div[2]/div/div[6]/div[1]/div/div[2]/div/ul/li[5]/a")
    private WebElement exi;



    public String statVoit() {
        return statusVoit.getText();
    }

    public void inputLogin(String login) {
        loginField.sendKeys(login); }

    public void showedMenu() {
        showMenu.click();
    }

    public String statVoit1(){
        return  statusVoit1.getText();
    }
    public void inputPasswd(String passwd) {
        passwdField.sendKeys(passwd); }

    public void exProf(){
        usNme.click();
    }
    public void exits(){
        exi.click();
    }

    public void clickLoginBtn() {
        loginBtn.click();}

}
