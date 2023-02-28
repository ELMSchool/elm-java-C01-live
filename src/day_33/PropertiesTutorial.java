package day_33;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Properties;

public class PropertiesTutorial {

	public static void main(String[] args)  {
		
		
		//C:\Users\slymn\OneDrive\Documents\Information.properties
//		String filePath = "C:\\Users\\slymn\\OneDrive\\Documents\\Information.properties";
		
		//this path to the folder that we stored our file   C:\Users\slymn\OneDrive\Documents
		String folderPath = "C:\\Users\\slymn\\OneDrive\\Documents";
		
		//this is the name of out file
		String fileName = "Information.properties";
		Properties properties = new Properties();
		
		try {
		FileReader reader = new FileReader(folderPath + "\\" + fileName);
		properties.load(reader);
		
		}
		catch(Exception f) {
			properties.setProperty("name", "XXXX");
			properties.setProperty("lastName", "YYYY");
		}
		
		
		
		
//		System.out.println(properties.getProperty("school"));
//		System.out.println(properties.keySet());
		
		
		

	}
	
	

}
