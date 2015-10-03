package org.automation.app;

import org.automation.util.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitiateDriver {
	
  @Autowired
  ConfigReader configReader;
  
  @Autowired
  WebDriver driver;
	
  public void createDriver(){
	  // System.out.println("Page title is: " + configReader.getAUT_URL());
     driver.get("http://www.google.com");
    
     WebElement element = driver.findElement(By.name("q"));

     element.sendKeys("Cheese!");
     element.submit();

     System.out.println("Page title is: " + driver.getTitle());
     
     // Google's search is rendered dynamically with JavaScript.
     // Wait for the page to load, timeout after 10 seconds
     (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
         public Boolean apply(WebDriver d) {
             return d.getTitle().toLowerCase().startsWith("cheese!");
         }
     });
   
     System.out.println("Page title is: " + driver.getTitle());

     // driver.quit();
	}
  
  
  
}	