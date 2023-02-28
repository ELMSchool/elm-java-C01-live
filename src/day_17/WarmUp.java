package day_17;

public class WarmUp {
	
	public static void main(String[] args) {
	
		//contains(CharSequence str) -> returns(boolean) if str is appearing in given String
		//indexOf(String s), indexOf(String s, int from)
		//replaceFirst(regex, String s)
		//toCharArray(CharSequence cs)
		//split(regex)
		
		//how many dogs and cats are in given String??
		//c231345235dogcdogcdog
		String str = "dogcatdogcat";
		int dogCount = 0;
		int catCount= 0;
		
		while(str.contains("dog") || str.contains("cat")) {
			if  (str.contains("dog")) {
				str = str.replaceFirst("dog", "");
				dogCount++;
			}
			if (str.contains("cat"))
				str = str.replaceFirst("cat", "");
			catCount++;
		
			
		}
		System.out.println(dogCount);
		System.out.println(catCount);

		
	}

}
