package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
//they are all in application.properties file and need to be configured and made use of it in this Spring boot application
//currency-service.url=
//currency-service.username=
//currency-service.key=

@Component // We would want Spring to manage this
@ConfigurationProperties (prefix = "currency-service")
public class CurrencyServiceConfiguration {
	private String url;
	private String username;
	private String key;
	
	// getters and setters
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	
	

}
