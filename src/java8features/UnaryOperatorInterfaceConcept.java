package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorInterfaceConcept {

	public static void main(String[] args) throws InterruptedException {
	/*
	 * Represents an operation on single operands/arguments  that produces a result of the same type as its operands
	 * This is a specification of Function for the case 
	 * where the operands and result are the same type
	
	 */
		
		UnaryOperator<Integer> unaFunInt=x->x*10;
		int n1=unaFunInt.apply(5);// in the above unfunInt.apply() sending this 5 to above x place 
		//			and return x place value to the function reference value , I am assigning 
		System.out.println("UnaryOperation Function Sum is : "+n1);
		
		Function<Integer,Integer> funInt=x->x*10;// Her I declared one Function for sending the input and getting the output same type
		System.out.println("Function<Integer ,Integer > : "+funInt.apply(15));
// In the above Function reference funInt.apply(15) sending to the above x place holder and return type is also the same  		
		
		
		
		// The UnaryOperator for String type 
		
		//UnarayOperator<Strng> unaString=ele->ele+" By  venkat";
		// the above is not working 
		// check another way 
		List<String> ls=new ArrayList<String>();
		ls.add("java");
		ls.add("python");
		ls.add("javaScript");
		ls.add("NodeJs");
		System.out.println("Before repacingAll the values in ArrayList: "+ls);
	//--------------------------------------------------------------------------------------------------
		ls.replaceAll(ele->ele+" By Venkat");// This is also internally using UnaryOperator <Type>
		//--------------------------------------------------------------------------------------------------
		
		System.out.println("After Replacing all ");
		System.out.println(ls);																																																																				
		
		String val="by venkat";
		int size=ls.size();
		System.out.println(size);
		System.out.println("String vallue to set");
		System.out.println("here for loop is started ");
		System.out.println(ls.get(0));
		
		
		// Below code is writing without using repalaceAll UnariOperator<String> 
		// is working fine 
	
		
	//	for(int j=0;j<ls.size();j++);
		for(int i=0;i<ls.size();i++)	// ls.size we never used because it is incrementing the size automatically																																																																																									
		{					// working fine 
			// But never we used ls.add(value) inside the loop and in for loop never write ls.size() it is automatically increasing the loop size 
			//int i=0;
			String getText=ls.get(i);
			System.out.println(getText);
			String setText=getText+val;// this much of code we have to write without using ls.replaceAll(); UnaryOperator
			System.out.println(setText+" At "+i+" Position");
			Thread.sleep(200);
		//	ls.add(i, setText);// Adding the new Elements 
			ls.set(i, setText);
			System.out.println("Data is readded Sucessfully");
		}
		
		// for loop completed check this working or not
		System.out.println("Here ForLoop is closed ");
		System.out.println(ls);
		// Retrieving the elements from the list 
		
		for(String str:ls)
		{
			System.out.println(str);
		}
		
	
	}

}
