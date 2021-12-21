package com.bl.chemistshop;


import java.util.Arrays;
import java.util.Date;

public class Medicine {
	
	enum Type{
		HOMEOPATHY, ALLOPATHY, AIURVEDIC
	}
	
	String companyName;
	Date mfgDate;
	Date expiryDate;
	String[] composition;
	Type type;
	String name;
	
	@Override
	public String toString() {
		return "Medicine [companyName=" + companyName + ", mfgDate=" + mfgDate + ", expiryDate=" + expiryDate
				+ ", composition=" + Arrays.toString(composition) + ", type=" + type + "]";
	}

	
	
	
	
}
