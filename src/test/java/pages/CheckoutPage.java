package pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import static utility.BrowserDriver.driver;

public class CheckoutPage {

    public static String product_one = "//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[1]/td[2]/a";
    public static String product_two = "//*[@id=\"maincontainer\"]/div/div[1]/div/div[2]/table[3]/tbody/tr[2]/td[2]/a";
    public static String checkout_button = "//button[@id=\"checkout_btn\"]";
    public static String ver_order_placed = "//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]/text()";// Your Order Has Been Processed!
    public static String account_btn = "//span[normalize-space(text())='Account']";
    public static String logout_btn = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[9]/a";
    public static String ver_logout = "//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]/text()";// Account Logout

    public void verify_product_in_checkout (){
        String product1 = driver.findElement(By.xpath(product_one)).getText();
        Assert.assertEquals(product1,AddingProduct.ProductName1);
        String product2 = driver.findElement(By.xpath(product_two)).getText();
        Assert.assertEquals(product2,AddingProduct.ProductName2);
    }

    public void click_checkout_btn(){
        driver.findElement(By.xpath(checkout_button)).click();
    }

    public void verify_order_placed(){

    }
}