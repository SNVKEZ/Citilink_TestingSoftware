package org.citi;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class

LoginTest {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;
    public static WebDriver driver;


    @BeforeClass

    public static void setup()
    {
        System.setProperty("webdriver.gecko.driver", "C:/opt/gecko/geckodriver.exe");
        driver = new FirefoxDriver();
        loginPage = new LoginPage(driver);
        profilePage = new ProfilePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.citilink.ru");
    }


    @Test
    public void loginTest() throws InterruptedException {
        String s = loginPage.statVoit();
        loginPage.showedMenu();
        loginPage.inputLogin("89030219119");
        loginPage.inputPasswd("velsar_123");
        Thread.sleep(15000);
        loginPage.clickLoginBtn();
        if (s!=loginPage.statVoit1())
        {
            loginPage.exProf();
            loginPage.exits();
            System.out.println("кнопка “Войти в аккаунт” сменилась на “Мой профиль”");
        }
    }

}
