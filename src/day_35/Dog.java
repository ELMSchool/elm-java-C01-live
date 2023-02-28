package day_35;

import java.io.IOException;
import java.sql.SQLException;

public class Dog extends Animal {
	
	public void setAge(int age) throws ArithmeticException{

		if (age < 0) {

			throw new ArithmeticException();

		} else {

			super.age = age;
		}

	}

}
