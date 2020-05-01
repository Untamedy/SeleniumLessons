/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import basic.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Lenovo
 */
public class HomePage implements Page{
    
    private WebDriver driver;
    @FindBy(linkText = "Form Authentication")
    private WebElement loginPage;
    
    public HomePage(WebDriver driver){
        init(driver);
        this.driver=driver;
    }
    
    public LoginPage openLoginPage(){
        loginPage.click();
        return new LoginPage(driver);        
    }

    @Override
    public void init(WebDriver driver) {
    PageFactory .initElements(driver, this);
    }
    
}
