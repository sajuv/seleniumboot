package org.automation.util;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource("classpath:/org/automation/config.properties")
public class ConfigReader {

	private String abcd;
	private String AUT_URL;
	
	public String getAbcd() {
		return abcd;
	}

	public void setAbcd(String abcd) {
		this.abcd = abcd;
	}

	public String getAUT_URL() {
		return AUT_URL;
	}

	public void setAUT_URL(String aUT_URL) {
		AUT_URL = aUT_URL;
	}
}