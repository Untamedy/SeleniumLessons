/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import Pages.HomePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Lenovo
 */
public class BasicTest {
    protected static WebDriver driver;
    protected static HomePage homepage;
    
    
    @BeforeClass
    public static void setUp(){
     System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
     driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/");
     
     homepage = new HomePage(driver);
    }
    
    @AfterClass
    public static void destroy(){
        driver.quit();
    }
    
}
