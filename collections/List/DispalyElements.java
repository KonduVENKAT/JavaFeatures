package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DispalyElements {

	public static void main(String[] args) {
	
		 // In this class  How many ways I can Iterating the elements inside  the collection 
		// For this we need generic type Collection 
		//to declare the ArrayList by using generics 
		List<String> list=new ArrayList<String>(20);// Pc=0,Vc=20;
		
		list.add("Venkat");
		list.add("Srinu");
		list.add("Vinod");
		list.add("ThimmaRaju");
		list.add("Madhu");
		list.add("manju");
// Here I have to test the how many way to test the iterating the elements 
		System.out.println("By using for-loop");
		System.out.println("--------------------");
		for(int i=0;i<list.size();i++)
		{	System.out.print(list.get(i)+"  ");	}
		System.out.println("\n---------------------");
	
		System.out.println("for usinng for-Each loop ");
		System.out.println("---------------------");
		for(String ele:list)
		{	System.out.print(ele+"  ");	}
		System.out.println("\n---------------------");

		
		System.out.println("By  using Iterator concept in the collections ");
		
		Iterator<String> itr=list.iterator();
		
		while(itr.hasNext())// itr has next element 
		{	System.out.print(itr.next()+"  ");	}
		System.out.println("\n---------------------");

		
		System.out.println("By using lamda-Expressions After  jdk-1.8 ");
		
		list.stream().forEach(ele->System.out.print(ele +"  "));// this is for single line of statement by using lamda Expression 
	
		System.out.println("\n---------------------");
		System.out.println("\n---------------------");
		System.out.println("\n---------------------");

	
	}

}
