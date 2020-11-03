package java_DataStructures;

import java.util.Scanner;

public class StackArrayImpl {

	int size;
	int top;
	int stack[];
	
	public StackArrayImpl(int size) {
		
	this.size=size;
	this.stack=new int[this.size];
	top=-1;
	}
	// I need some methods to implement Stack Operations 
	public boolean isEmpty()
	{	return  (top==-1);}
	public boolean isFull()
	{	return ( (size-1) == top );	}
	
	public int peekEle()// return Integer for calling function   // get the element at top position in the stack 
	{
		System.out.println("Performing the Peek Operation ");
		System.out.println("--------------------------------");
	
		//int peek = 0;
		if(!this.isEmpty())
		{
			System.out.println("Performing the Peek Operation ");
			System.out.println("--------------------------------");
		
			int peek=stack[top];
			System.out.println("Peek Element In Stack ="+peek+ " at Stack [ "+top+" ]");
			return peek;
		}
		else
		{
			 	System.out.println("\t -- Stack is Empty ---");
			 	return -1;
		}
		
	// check zero is required or not 
		//return peek;
		
	}

	public void pushStack(int ele)// Push the element in top position in  Stack
	{
		//System.out.println("Here I'm performing the PUSH operation in Stack  ");
		//System.out.println("-------------------------------------------------");
		if(!this.isFull())// why her I specify this ! symbol check 
		{
			System.out.println("Here I'm performing the PUSH operation in Stack  ");
			System.out.println("-------------------------------------------------");
			
			top++;// increment to zero for initially because array starts with 0  only 
			stack[top]=ele;
			System.out.println("Element \' "+ele+" \' is Pushed into the Stack Position stack[ "+top+" ] ");
			
			if(size-1==top)
			{
				System.out.println("*************************************************************************");

				System.out.println("Next Unable to perform Push Operation \n \t -- Because Stack is full");

				System.out.println("*************************************************************************");
			}
		}
		else
		{

			System.out.println("\t ----  Stack is Full ----");
			System.out.println("Unable to push this element \'"+ele+"\' into the Stack");
		
		}
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Here I'm Implementing the STACK with Array ");
		System.out.println("----------------------------------------------");
		System.out.print("enter size of the Stack : ");
		int size=new Scanner(System.in).nextInt();
		StackArrayImpl sai=new StackArrayImpl(size);
		System.out.println();
		
		System.out.println("Peek Element =: "+sai.peekEle());
		sai.pushStack(10);
		sai.pushStack(20);
		sai.pushStack(30);
		sai.pushStack(40);
		sai.pushStack(50);
		System.out.println("Peek Element =: "+sai.peekEle());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("----------------------------------------------");
		
		
		
	}

}
