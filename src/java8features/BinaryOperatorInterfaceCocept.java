package java8features;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class BinaryOperatorInterfaceCocept {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
// BinaryOperator Represents an operation upon two operands of the same type ,
// Producing a result of the same type as the operands .
// This is a specialization of BiFunction for the case where the 
// operands and the result are all of the same type.
		
		// Below this is for String 
		BinaryOperator<String> funString=(x1,x2)->x1+x2;
		String conCat=funString.apply("abc", "cde");
		System.out.println(conCat);
		
		//Below this is for Integer Calculations 
		BinaryOperator<Integer> funInt=(x1,x2)->x1+x2;
		int sum=funInt.apply(100, 20);
		System.out.println(sum);
		// For the same binary function  I want to provide Dynamic values
		System.out.println("Enter values :");
		//int dSum=funInt.apply(System.out.println("Enter first"+s.nextInt()),System.out.println(s.nextInt()) );// Accepting 
		// the above is not applicable
		int dSum=funInt.apply(s.nextInt(), s.nextInt());
		
		System.out.println("You Entered integers vales sum is : "+dSum);
		
	}

}

