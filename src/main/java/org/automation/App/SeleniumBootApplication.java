package org.automation.App;

import org.automation.Util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages={"org.automation.*"})
public class SeleniumBootApplication {

@Autowired
ConfigReader configReader;


@Autowired
InitiateDriver initiateDriver;

    public static void main(String[] args) {
    	SpringApplication.run(SeleniumBootApplication.class, args);
    	   initiateDriver.createDriver();
       }
    
   @Bean
   public String cassandraOps(){
	   String abc=configReader.getAUT_URL();
	   System.out.println("Page title is: " + configReader.getAUT_URL());
	   return abc;
   }
   
  @Bean
   public WebDriver getDriver(){
	
	   WebDriver driver = new FirefoxDriver();
	
	   return driver;
   }
   
  
   
}
