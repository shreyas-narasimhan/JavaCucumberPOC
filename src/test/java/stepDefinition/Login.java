package stepDefinition;

import org.openqa.selenium.By;

import static utility.BrowserDriver.driver;

public class Login {

    public static String username_xpath = "";

    public static String password_xpath = "";

    public static String login_btn_xpath = "";

    public static void sendkeys_username(){
        driver.findElement(By.xpath(username_xpath)).sendKeys("");
    }

    public static void sendkeys_password(){
        driver.findElement(By.xpath(password_xpath)).sendKeys("");
    }

    public static void click_login_btn(){
        driver.findElement(By.xpath(login_btn_xpath)).click();
    }
}
