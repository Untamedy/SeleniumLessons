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
public class LoginPage implements Page{
    
    private WebDriver driver;
    
    @FindBy(id = "username")
    private WebElement inputEmail;
    @FindBy(id = "password")
    private WebElement inputPass;
    @FindBy(css = "#login button")
    private WebElement submit;        

    LoginPage(WebDriver driver) {
     init(driver);
    this.driver=driver;
    }
    
    public LoginPage setEmail(String email){
      inputEmail.sendKeys(email);
      return this;
    }
    
    public LoginPage setPass(String pass){
        inputPass.sendKeys(pass);
        return this;
    }
    
    public SuccessLoginPage submit(){
        submit.click();
        return new SuccessLoginPage(driver);
    }

    @Override
    public void init(WebDriver driver) { PageFactory .initElements(driver, this); }
    
    
}
