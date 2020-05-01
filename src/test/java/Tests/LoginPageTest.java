/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Pages.LoginPage;
import Pages.SuccessLoginPage;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author Lenovo
 */
public class LoginPageTest extends BasicTest {
    
    
    
    @Test
    public void login(){
      LoginPage loginPage = homepage.openLoginPage();
        SuccessLoginPage success = loginPage.setEmail("tomsmith").setPass("SuperSecretPassword!").submit();
        String message = success.getMessage();
        assertTrue(message.contains("You logged into a secure area!"));
    }
    
    
    
    
    
    
}
