package org.javacream.training.java._8plus.people;

import java.util.HashMap;
import java.util.Map;

public class PostalCodeFinder {

	private Map<String, Integer> postalCodes;
	
	{
		postalCodes = new HashMap<>();
		postalCodes.put("München", 81377);
		postalCodes.put("Frankfurt", 60111);
		postalCodes.put("Stuttgart", 70567);
		
	}
	
	public Integer find(String city) {
		Integer result = postalCodes.get(city);
		if (result != null) {
			return result;
		}else {
			System.out.println("PLZ not found");
			return null;
		}
	}
}
