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
public class SuccessLoginPage implements Page{
    private final WebDriver driver;
    @FindBy(id="flash")
    private WebElement message;
    
    public SuccessLoginPage(WebDriver driver){
        init(driver);
        this.driver=driver;
    }
    
    public String getMessage(){
        return message.getText();
    }

    @Override
    public void init(WebDriver driver) { PageFactory .initElements(driver, this); }
    
}
