package org.citihvlynsk;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CityPage {
    public WebDriver driver;
    public CityPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(className = "MainHeader__city")
    private WebElement gorod;


    public String statGorod() {return gorod.getText();}

    public void showCities() {gorod.click();}


}
