package day_33;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Task {
	public static void main(String[] args) throws Exception {

		/*
		 * Create external properties file Store given info to that file Then read all
		 * those data from properties file Store them in a list then find shortest and
		 * longest String data
		 */
		String folderPath = "C:\\Users\\slymn\\OneDrive\\Documents";

		// this is the name of out file
		String fileName = "Information.properties";

		FileReader reader = new FileReader(folderPath + "\\" + fileName);

		Properties properties = new Properties();

		properties.load(reader);
		
//		System.out.println(properties.keySet());
//		System.out.println(properties.getProperty("name"));
		//             [lastName, address, name, dateOfBirth, email]
		ArrayList <String> values = new ArrayList<>();
		for (Object o : properties.keySet()) {
			
			String key = (String) o;
			values.add(properties.getProperty(key));
		}
		
		System.out.println(values);
		
		int maxLength = values.get(0).length(); //33
		int minLength = values.get(0).length(); //4
		int maxIdx = 0; //1
		int minIdx = 0;
		
		//[Hugo, 123 Elm street Brooklyn NY 11211, Victor, 10/12/1985, vhugo@elm.school]
		for (int i = 0; i < values.size(); i++) {
			
			if (values.get(i).length() > maxLength) {
				maxLength = values.get(i).length(); //33
				maxIdx = i;
			}else if (values.get(i).length() < minLength) {
				
				minLength = values.get(i).length();
				minIdx = i;
			}
			
		}
		
		System.out.println("Longest word => " + values.get(maxIdx) );
		System.out.println("Shortest word => " + values.get(minIdx) );

	}

}
