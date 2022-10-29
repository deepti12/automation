package api.cucumber.Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class LoginPage {
    private WebDriver driver;
    public  By txt_username= By.id("name");
    public  By txt_password= By.id("password");

    public  By btn_login= By.id("login");
    public By txt_logout= By.id("logout");
    public LoginPage(WebDriver driver)
    {
        this.driver=driver;
        if(!driver.getTitle().equals("TestProject Demo"))
        {
            throw new IllegalStateException("this is not login page"+driver.getCurrentUrl());
        }

    }
    public void enterUsername(String username)
    {
        driver.findElement(txt_username).sendKeys(username);
    }
    public void enterPassword(String password)
    {
        driver.findElement(txt_password).sendKeys(password);
    }
    public void clickLogin()
    {
        driver.findElement(btn_login).click();
    }
  /*  public void loginValidUSer(String username,String password)
    {
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }*/

    public boolean checkLogOutidsDisplayed() {
        return driver.findElement(txt_logout).isDisplayed();
    }
}
