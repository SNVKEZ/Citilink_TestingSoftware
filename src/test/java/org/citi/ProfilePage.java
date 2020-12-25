package org.citi;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ProfilePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора меню пользователя
     */
    @FindBy(className = "HeaderUserName")
    public WebElement userMenu;
    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(className = "UserMenu__menu-link_logout")
    public WebElement logoutBtn;
    /**
     * метод для получения имени пользователя из меню пользователя
     */

    public String getUserName() {
        String userName = userMenu.getText();
        return userName; }
    /**
     * метод для нажатия кнопки меню пользователя
     */
    public void entryMenu() {
        userMenu.click(); }
    /**
     * метод для нажатия кнопки выхода из аккаунта
     */
    public void userLogout() {
        logoutBtn.click(); }

}