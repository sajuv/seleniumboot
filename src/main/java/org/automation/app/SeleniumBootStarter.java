package org.automation.app;

import org.automation.util.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"org.automation.*"})
public class SeleniumBootStarter {

	@Autowired
	ConfigReader configReader;

    public static void main(String[] args) {
    	ApplicationContext ctx = SpringApplication.run(SeleniumBootStarter.class, args);
    	
    	final InitiateDriver initiateDriver = ctx.getBean(InitiateDriver.class);
    	initiateDriver.createDriver();
    }
    
   @Bean
   public WebDriver getDriver(){
	   return new FirefoxDriver();
   }
}