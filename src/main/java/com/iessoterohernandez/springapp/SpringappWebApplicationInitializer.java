package com.iessoterohernandez.springapp;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.iessoterohernandez.springapp.business.SpringappBusinessConfig;
import com.iessoterohernandez.springapp.web.SpringappWebConfig;

public class SpringappWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	@Override
	protected Class<?>[] getRootConfigClasses(){
		return new Class<?>[]{ SpringappBusinessConfig.class };
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { SpringappWebConfig.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/" };
	}
}
