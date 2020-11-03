package patterns;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RevarseString {
	public void reverse1(RevarseString rs)
	{
		System.out.println("This method for using for -- loop ");
		String str=new Scanner(System.in).next();
		int lenStr=str.length();
		// Here I want to separate each character  into char Array 
		char chStr[]=str.toCharArray();
		
		for(int i=lenStr-1;i>=0;i--)
		{
			System.out.print(chStr[i]+" ");
		}
		
		// how to get this method name 
		System.out.println("method name _ _ -- : "+rs.getClass().getMethods());// I'm not getting the current method name
		//System.out.println(rs.getClass().getMethod(str, str));
	}
	public void reverse2()
	{
		System.out.println("This method is for reverse a String through do-while loop");
		String str=new Scanner(System.in).next();
		
		char chStr[]=str.toCharArray();
		int chLen=chStr.length-1;// because store in array
		
		do
			{
			System.out.print(chStr[chLen]);
			chLen--;
			}while(chLen>=0);
		
		
	}
	
	public void reverse4()
	{
		// in this method I will write string in reverse by using while 
		String str=new Scanner(System.in).next();
		char chStr[]=str.toCharArray();
		int len=chStr.length-1;
		
		
		while(len>=0) /// repeate this statement upto this statement is false checking 
		{
			System.out.print(chStr[len]+"  ");
			len--;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("Enter One String to reverse that : ");
	/*
		String name=new Scanner(System.in).next();
		System.out.println("Now I want to perform reverse a String operation  ");
		
		char nChar[]=name.toCharArray();// this one is must there is no other alternatives 
		System.out.println("Normal You Entered String into characcters for reverse String");
		int len=nChar.length;
		int nel=len-1;
		for(int i=0;i<len;i++)
		{
			
			System.out.print(nChar[nel]+"  ");
			nel--;
		}

	*/
	//String className=toString();
		//System.out.println(getClass().getName());
		//System.out.println(toString());
		RevarseString rs=new RevarseString();
		//rs.reverse1(rs);
//		rs.reverse5();
		System.out.println("\n---------------------------------- \n"+rs);
		//System.out.println(rs.getClass().getName());// this is the way of getting the class Name 
		// how to get method name 
		//System.out.println(rs.getClass().getMethods());// not working 
		//System.out.println(rs.hashCode());
	}

}
