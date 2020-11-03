package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionalInterface {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	
		// interface Function< T ,R > type parameters 
		// Here T is the type of the InputData to the function 
		// and R is the Return Type of the function 
		
		Function<String,Integer> func=x -> x.length();// Here I getting the Integer value
		System.out.println("Function is created and do some operations");
		System.out.print("Enter the firt Text : ");
		String first=s.nextLine();// It 
		
		//int len=func.apply("hai venkat this is new concept in java8 versiinon");// Here I passing the text for getting the  Integer value 
		//System.out.println("Lenth of the entered text is :"+len);// Here I'm printing the length of the Entered /text inside the --func.apply("String");

		/*
		int fiLen=func.apply(first);
		System.out.println("\nFirst String length : "+fiLen);
		System.out.print("Enter Second String : ");
		String sec=s.next();// it accept only one string in a line of the text 
							// it does not accept after the space String 
		System.out.print("Second String Length : "+func.apply(sec));// check getting the output or not 
		*/
		// Yes I'm getting the output 
		//--------------------------------------------------------------------------------------
		//List<String> al=Arrays.asList("first Line","SecondLine","third");
		//List<Integer> alInt=al.stream().( String )filter(func).collect(Collectors.toList());
		// Above thing is not possible to return Integers and store in List 
		//---------------------------------------------------------------------------------------
	System.out.println();
		Function<Integer,Integer> funInt=x->x*2;
		System.out.println("Enter Line of the string : ");
		String enter=s.nextLine();
		int result=func.andThen(funInt).apply(enter);// Here I want to interact two Functions with different operations
		System.out.println("Result of the funInt is "+result);
		System.out.println("Length of the Entered  String is "+result/2);
	
	}

}
