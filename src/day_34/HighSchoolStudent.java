package day_34;

public class HighSchoolStudent extends Student {
	private String highSchool;

	public String getHighSchool() {
		return this.highSchool;
	}

	public void setHighSchool(String highSchool) {
		this.highSchool = highSchool;
	}

	// overridden setAge() method
	public void setAge(int age) {
		if (age >= 15) {
			this.age = age;
		} else {
			this.age = 0;
		
		}
	}
}