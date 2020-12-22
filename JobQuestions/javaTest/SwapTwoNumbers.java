package javaTest;

import java.util.HashMap;
import java.util.Map;

public class SwapTwoNumbers {

	
	public void swapTwoNumbers(int n1 , int n2) // using third variable 
	{
		System.out.println("First Number = "+n1+ "\t Second Number = "+n2);
		System.out.println("First Number = "+n2+ "\t Seconnd Number= "+n1);
		
		// performing the operation 
		
		int temp;
		
		 temp=n1;
		n1=n2;
		n2=temp; // for swapping the two numbers by using third variable 
		System.out.println("After operation ");

		System.out.println("First Number = "+n1+ "\t Second Number = "+n2);
			
		
	}
	// By using var_Arg method (int...)// we have to pass the array of the integer object later in  I will try  
	public void swapTwoNumbersWithoutThirdVariable(int n1 , int n2)
	{
		System.out.println("First Number = "+n1+ "\t Second Number = "+n2);
		
		n1=n1+n2;// 10+20 =30  
		
		n2=n1-n2; // 30-20=10;
		
		n1=n1-n2; // 30-10=20 ;
		
		System.out.println("First Number = "+n1+ "\t Second Number = "+n2);
		
	}
	
	public void swapNumbersVarArgMethod(int... a)
	{
		int arr[]=a;
		
		int n1=0,n2=0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==0)
			{
				n1=arr[i];
			}
			else if(i==1)
			{
				n2=arr[i];
				
			}else
			{
				System.out.println("Anohter requirement Not in Range  "+arr[i]);
			}
		}
			
			System.out.println("First Number = "+n1+ "\t Second Number = "+n2);
			
			// perform opertion 
			n1=n1+n2;
			
			n2=n1-n2;
			
			n1=n1-n2;
			System.out.println("First Number = "+n1+ "\t Second Number = "+n2);
			
		
	}
	
	
	public void stringSwap(String n1,String n2)
	{
		// requirement abc cde  
				//	   cde abc
		
		
		System.out.println("Before Swap ");
		System.out.println("First Name "+n1 +"\t Second Name "+n2);
		
			// by bellow alll these simply we will use one temp varable for esily simlify those things 
	// 	n1=n1+n2;
		//n2=n1.substring(0, n)// length oof the first lenghh
		
		String temp;
		
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After swap ");

		
		System.out.println("First Name "+n1 +"\t Second Name "+n2);
		
		
	}
	
	public void sortNumbers(int... num)  // 3,6,1,7,4,7
	{
		//int num2[]=new int[num.length]; // I think this is not required 
		
		for(int i=0;i<num.length;i++)
		{
			for(int j=i;j<num.length;j++) // j=i or 0 I will check later on 
			{
				// Here we have to perform sorting order How to do this implement here 
				if(num[i]<=num[j]) // Here value comparing then what I will do -- 3,3 [first] 3 <=6 [second] 6<=1 , 6<=7 ,7<=4 , 7<=7
				{ // the above logic is for descending order 
				int temp=num[i];// zeroth place what value is there  3,6, 
					num[i]=num[j];
					num[j]=temp;  // Here I'm performing swaping operation  like 
		System.out.print(num[i]+" ");
				}
				System.out.println("\n----------------------------------------------");
				System.out.print(num[i]+" "); // the end of the first iteration i will store in 0 position store 7 value
			//	num2[i]=num[i]; // is this statement is required 
			}
			System.out.println("\n***************************************************");
		}
	
		System.out.print("Descening order :: ");
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+"  ");
		
		System.out.print("\nAssendign order :: ");
		
		for(int i=num.length-1;i>=0;i--) // this for loop is for without swapping 
			{
			System.out.print(num[i]+"  ");
			
			
			}
		System.out.println("\n\n");
		// Here I want to perform the operation on the Array how to implement that
		
		
		//The below code what is the time complexity and what is the 
		for(int i=0;i<num.length;i++)
		{
			for(int j=0;j<num.length;j++)
			{     // by below snippet I want to store num[i] position num[j] value I want to store  ( if the condition is true )
				if(num[i]<=num[j])// Here I want to perform swapping operation for Ascending order 
				{
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
					System.out.print(num[i]+" ");
					//System.out.println();
				}
				System.out.print("\n-----------------------------------");
				
			}
			System.out.println("\n************************************");
		}
		
		for(int s:num)
		System.out.print(s+"  ");
	}
	
	public void getVauleByMap()
	{
		
		Map<Integer , Integer> map=new HashMap<Integer, Integer>();
							// if I give 1 I will get the value  5 from that map collection like that declared where we will use this concept 
		// Is it required this concept I will check later on about this 
		map.put(1, 5);
		map.put(2, 4);
		map.put(3, 3);
		map.put(4, 2);
		map.put(5, 1);
		///map.put(, );
	}
	/*
	public void StringSort(String[] names) // later on String... names
	{
		
		// How to implement these things 
		
		for(int i=0;i<names.length;i++)
		{
			
			for(int j=0;j<names.length;j++)
			{
				
			// How to implement thsese things
			//	if(names[i]<=names[j]) // is not working 
				
				if(names[i].)
				{
					
				}
				
			}
					
		}
		
	}
	
	*/
	
	public static void main(String[] args) {
		
		SwapTwoNumbers stn=new SwapTwoNumbers();
		
	//	stn.swapTwoNumbers(10, 20);
	//	stn.swapTwoNumbersWithoutThirdVariable(10, 20);
	//	stn.swapNumbersVarArgMethod(10,20,30);
		
	//	stn.stringSwap("venkat", "Kondu");
		stn.sortNumbers( 3,6,1,7,4,7,9,0,2,5);
		
		
	}
	
}
