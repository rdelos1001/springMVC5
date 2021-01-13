package com.iessoterohernandez.springapp.business.services;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PriceIncrease {
	/** Logger for this class and subclasses*/
	protected final Log loggerr = LogFactory.getLog(getClass());
	
	@Min(0)
	@Max(50)
	private int percentage;
	
	public void setPercentage(int i ) {
		percentage=i;
		loggerr.info("Percentage set to" +i);
	}
	
	public int getPercentage() {
		return percentage;
	}
}
