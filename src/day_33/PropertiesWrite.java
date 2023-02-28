package day_33;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Properties;

public class PropertiesWrite {
	
	public static void main(String[] args) throws Exception{
		
		
		String folderPath = "C:\\Users\\slymn\\OneDrive\\Documents";
		String fileName = "Data.properties";
		
		
		Properties properties = new Properties();
		
		ArrayList <Integer> grades1 = new ArrayList<>();
		grades1.add(75);
		grades1.add(85);
		grades1.add(80);
		
		ArrayList <Integer> grades2 = new ArrayList<>();
		grades2.add(68);
		grades2.add(79);
		grades2.add(91);
		
		ArrayList <Integer> grades3 = new ArrayList<>();
		grades3.add(95);
		grades3.add(100);
		grades3.add(75);
		
		HashMap<String, ArrayList<Integer>> classGrades = new HashMap<>();
		classGrades.put("John", grades1);
		classGrades.put("Kate", grades2);
		classGrades.put("Tiffany", grades3);
		
		for (String key : classGrades.keySet()) {
			
			ArrayList<Integer> grades = classGrades.get(key);
			Collections.sort(grades);
			int highest = grades.get(grades.size()-1);
			
			properties.setProperty(key, ""+highest);
		}
		
		FileWriter writer = new FileWriter(folderPath + "\\" + fileName);
		
		properties.store(writer, "This is a comment line about this file");
		
		//name of file - StudentsHigestGrade
		
		
	}

}
