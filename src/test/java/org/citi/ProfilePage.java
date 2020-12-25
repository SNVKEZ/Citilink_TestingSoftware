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
    @FindBy(xpath = "/html/body/div[3]/div[2]/header/div[2]/div[2]/div[2]/div/div[6]/div[1]/div/div[2]/div/ul/li[1]")
    public WebElement userMenu;
    /**
     * определение локатора кнопки выхода из аккаунта
     */
    @FindBy(xpath = "/html/body/div[3]/div[2]/header/div[2]/div[2]/div[2]/div/div[6]/div[1]/div/div[2]/div/ul/li[5]")
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
        logoutBtn.click(); } }