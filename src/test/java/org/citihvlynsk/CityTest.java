package org.citihvlynsk;
import org.citi.LoginPage;
import org.citi.ProfilePage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;
public class CityTest {

    public static CityPage cityPage;
    public static ProfileCityPage profileCityPage;
    public static WebDriver driver;


    @BeforeClass

    public static void setup()
    {
        System.setProperty("webdriver.gecko.driver", "C:/opt/gecko/geckodriver.exe");
        driver = new FirefoxDriver();
        cityPage = new CityPage(driver);
        profileCityPage = new ProfileCityPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.citilink.ru");
    }


    @Test
    public void CityTest() throws InterruptedException {
        String S = cityPage.statGorod();
        cityPage.showCities();
        Thread.sleep(10000);
        driver.get("https://www.citilink.ru");

        profileCityPage.showedMenu();
        profileCityPage.inputLogin("89030219119");
        profileCityPage.inputPasswd("velsar_123");
        Thread.sleep(15000);
        profileCityPage.clickLoginBtn();
        String Z = profileCityPage.sravGor();
        if(S == Z)
        {
            System.out.println("город успешно сменился");
        }
        else
        {
            System.out.println("город не был сменен либо был не найден");
        }
        profileCityPage.nazhMenu();
        profileCityPage.nazhmyMenu();
        if(Z!=profileCityPage.myLoveCity())
        {
            System.out.println("город меню и город доставки совпадают");
        }
        else
        {
            System.out.println("город меню и город доставки не совпадают");
        }



    }
}
