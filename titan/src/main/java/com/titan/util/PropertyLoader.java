package com.titan.util;

import java.io.IOException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PropertyLoader {
	
	private static final Logger LOG = LoggerFactory.getLogger(PropertyLoader.class);
	
	private static PropertyLoader propertyLoaderInstance = new PropertyLoader();
	private static Properties properties;
	
	private PropertyLoader() {
		
		
		try {
			
			properties = new Properties();
			properties.load(getClass().getClassLoader().getResourceAsStream("graph-config.properties"));
			
		} catch (IOException e) {
			
			LOG.error(e.getMessage(),e);
		}
	}
	
	public static PropertyLoader  getInstance() {
		
		return propertyLoaderInstance;
        
	}
	
	
	public String  getProperty(final String key) {
		
		return properties.getProperty(key);
	}
	
	public boolean containsProperty(final String key) {
		return properties.containsKey(key);
	}
	
}
