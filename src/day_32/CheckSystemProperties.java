package day_32;

import java.util.Properties;
import java.util.*;

public class CheckSystemProperties {
	
	public static void main(String[] args) {
		
		Properties properties= System.getProperties();
		
		Set<Object> systemPropertyKeys = properties.keySet();
		
		for (Object propertyKey : systemPropertyKeys) {
			
			System.out.println(propertyKey + " : " + properties.get(propertyKey));
		}
		
		
	}

}
