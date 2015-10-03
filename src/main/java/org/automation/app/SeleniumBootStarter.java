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

	private static ApplicationContext ctx;
	
    public static void main(String[] args) {
    	ctx = SpringApplication.run(SeleniumBootStarter.class, args);
    	
    	InitiateDriver initDriver = getBean(InitiateDriver.class);
    	
    	initDriver.createDriver();
    	
    }
    
   /** 
    * <b> Returns the Bean from the {@link ApplicationContext} loaded at Startup using </b>
    * <ul>
    * <li>{@link org.springframework.context.annotation.Bean} or
    * </li>
    * <li>{@link org.springframework.stereotype.Component} and its subtypes</li>
    * </ul>
    * @author balaji i
    * @param beanType
    * @return bean
    */
   public static <T> T getBean(Class<T> beanType){
   		return ctx.getBean(beanType);
   } 
   
   @Bean
   public WebDriver getDriver(){
	   return new FirefoxDriver();
   }
}