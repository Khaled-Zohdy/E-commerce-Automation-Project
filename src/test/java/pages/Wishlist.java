package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Wishlist {

    public WebDriver driver ;
    public Wishlist(WebDriver driver) {
        this.driver = driver;
    }

    private By selectProduct=  By.xpath("//div [@class=\"product-item\" ]");
    
    private By btn=  By.cssSelector("div [class=\"add-to-wishlist\"]");

    private By addProductSuccessfully=  By.cssSelector("p[class=\"content\"]");

    public List<WebElement> selectProduct() {
        return driver.findElements(selectProduct) ;
    }

    public void btn() {
        driver.findElement(btn).click();
    }

    public String addProductSuccessfully() {
       return driver.findElement(addProductSuccessfully).getText();
    }
}
