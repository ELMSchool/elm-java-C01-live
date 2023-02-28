package day_18;

public class StringStringBuilderStringBuffer {
	
	public static void main(String[] args) {
		
		//Why String is immutable????
		String str1 = "java";

		str1 = str1.replace("a", "");
		System.out.println(str1);
		
		
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer);
		
		//Differences String vs StringBuffer
		/*
		 * StringBuffer is mutable
		 * StringBuffer consumes less memory
		 * 
		 * */
		//append()
//		buffer.append(" world");
//		System.out.println(buffer);
		
		//insert(int offset, String s)
//		buffer.insert(0, "java");
//		System.out.println(buffer);
		
		//replace(int start, int end, String s)
//		buffer.replace(1, 4, "java");
//		System.out.println(buffer);
		
		//delete(int start, int end)
//		buffer.delete(1, 4);
//		System.out.println(buffer);
		
		
		//reverse() 
		buffer.reverse();
		System.out.println(buffer);
		
		/* (L, F, S, R, M)								
		 * StringBuffer(Thread Safe) is synchronized but StringBuilder(not Thread Safe) is not synchronized
		 * 
		 * *
		 */
	}
	


}
