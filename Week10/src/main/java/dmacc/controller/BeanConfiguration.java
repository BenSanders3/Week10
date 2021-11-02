package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Sandwich;
import dmacc.beans.Server;

/**
 * @author Ben Sanders - bsanders3
 * CIS 175 Fall 2021
 */
@Configuration
public class BeanConfiguration {
	
	@Bean
	public Sandwich sandwich() {
		Sandwich bean = new Sandwich("Wheat");
		//bean.setBread("White");
		//bean.setCheese("American");
		//bean.setMeat("Turkey");
		return bean;
	}
	
	@Bean
	public Server server() {
		Server bean = new Server("John", "Smith");
		return bean;
	}
}
