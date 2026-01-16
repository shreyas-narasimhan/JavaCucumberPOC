package pages;

public class CartPage {

    public static String cart_icon = "(//span[normalize-space(text())='Cart'])[1]";
    public static String verify_product_one_name = "//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[2]/td[2]/a";
    public static String verify_second_product_name = "//*[@id=\"cart\"]/div/div[1]/table/tbody/tr[3]/td[2]/a";
    public static String checkout_btn = "//a[@title='Checkout' and @id = \"cart_checkout1\"]";
    public static String ver_order_placed = "//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]/text()";// Your Order Has Been Processed!
    public static String account_btn = "//span[normalize-space(text())='Account']";
    public static String logout_btn = "//*[@id=\"maincontainer\"]/div/div[1]/div/ul/li[9]/a";
    public static String ver_logout = "//*[@id=\"maincontainer\"]/div/div/div/h1/span[1]/text()";// Account Logout

}
