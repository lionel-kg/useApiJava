package com.ynov.client;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.ynov.productapi")
public class ApiProperties {
	private String url; //sera au prefix + nom de l'attribut donc com.ynov.properties.url

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
