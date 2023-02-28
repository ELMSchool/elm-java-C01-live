package day_08;

public class OperatorsRepeat {
	
	
	public static void main(String[] args) {
		
		/*
		 * Assignment => =
		 * Arithmetic => +, -, /, *, %
		 * Relational => >, >=, <, <=, ==, !=
		 * Logical Operators => ||, &&, !
		 * Bitwise => &, |
		 * Compound => +=, -=, /=, *=, %=
		 * Unary => ++, --
		 * */
		
		int num = 10;
		//			 10    + 11		+  11   - 11  +  10
		int result = num++ + num-- + ++num - num + --num;
		num += 5;
		System.out.println(result);
		
	}

}
