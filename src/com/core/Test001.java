package com.core;

import java.util.Scanner;

public class Test001 {
	Scanner s=new Scanner(System.in);
	
	public void print(String val)
	{
		System.out.println("\nYou're entered value is :"+val);
	}
	
	public void enter()
	{
		System.out.print("Enter something to print : ");
		String val=s.next();
		System.out.println("\nYou enter the something is : "+val);
	
	
	}
	
	public short enterInteger() // what I will do with this function to return Integer number 
	{
		
		int num = 0; // default value is 0
		
		System.out.print("Enter a number only : ");
		num=s.nextInt();
		System.out.println("\n You entered number is : "+num);
		return (short) num;
	}
	
	
	public static void main(String[] args) {

		Test001 test=new Test001();
/*		
		System.out.print("Enter somethings wheather it is integer or what ever :" );
			String str=test.s.next(); // this is the way to accessing the non static variables into static things 
	
			test.print(str);// this is the one way 
			
			System.out.print("Enter to something to print : ");
			
		//	test.print(s.next());// this is possible way to send the data 
			test.print(test.s.next());// this is possible way to pring the value 
			test.enter();
			
*/
		
		short number=test.enterInteger();// there  is no need to return to something 
		
		System.out.println("Number = "+number);
		
			
	}

}
