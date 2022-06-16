package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Registration {
    public WebDriver driver ;
    public Registration(WebDriver driver) {
        this.driver = driver;
    }

    private By go=  By.cssSelector("a[class=\"ico-register\"]");
    
    private By fName=  By.id("FirstName");

    private By lName=  By.id("LastName");

    private By email=  By.id("Email");

    private By password=  By.id("Password");

    private By confirmPassword=  By.id("ConfirmPassword");

    private By btn=  By.id("register-button");

    private By success=  By.className("result");

    private By logout=  By.cssSelector("a[href=\"/logout\"]");

    public void go(){
           driver.findElement(go).click();
       }

    public void fName(String name){
        driver.findElement(fName).sendKeys(name);
    }
    
    public void lName(String name){
        driver.findElement(lName).sendKeys(name);
    }
    
    public void email(String mail){
        driver.findElement(email).sendKeys(mail);
    }
    
    public void password(String pass){
        driver.findElement(password).sendKeys(pass);
    }
    
    public void confirmPassword(String confirm){
        driver.findElement(confirmPassword).sendKeys(confirm);
    }
    
    public void btn(){
        driver.findElement(btn).sendKeys(Keys.ENTER);
    }
    
    public String success(){
        return driver.findElement(success).getText();
    }
    
    public void logout(){
         driver.findElement(logout).click();
    }

}
