package List;
//package collection;

import java.util.ArrayList;

public class ArrayList001 {

	public static void main(String[] args) {
		ArrayList<Object> list= new ArrayList<Object>();
//List collection it can add the elements in the form of Indexing format like 0,1,2,3,4,........
//Exceptions like::: ArrayIndexOutOfBoundsException If I want to try to access out of range of the List size		
//ArrayList  are dynamic in nature in the collection but  Array's are static fixed length		

		list.add("boolean Type");//0 - index
		list.add(true);//1 - index
		list.add(false);//2 - index
		list.add(null);//3 - index
		
		list.add("Character Type");//4 - index etcc..
		list.add('@');
		list.add('#');
		list.add('%');
		list.add(null);// it can accept duplicate values even though it is null... 
		list.add(null);
		list.add("String Type");
		list.add("Venkat");
		list.add("Srinu");
		list.add(null);// We can add N - number of null values are stored  in Array List
		list.add("Nemaric Type");
		list.add(12345);
		list.add(423.534);
		list.add("Duplicate Values");
		list.add(0);// duplicate values are also we can store 
		list.add(0);
		
		
		
		System.out.println(list);
		
		// what is the lowest and Highest Index of that list How I can Find out
		System.out.println("Size of the list = "+list.size());
		System.out.println("Lowest Index  = "+0);
		System.out.println("Highest Index = "+(list.size()-1));
		// checking the array list are  dynamic nature 
		System.out.println("After adding the new elements in that allready exists list  ");
		list.add(6783456);
		list.add("Janu");
		list.add(null);
		System.out.println("(Physical capacity {pc})Size of the list = "+list.size());
		System.out.println("The default vertuaval capacity is 10  Vc=10 size of the List list=new ArrayList();");
		System.out.println("If we want add Vertual capacity of the List list = new Arrayist(20 etcc)  here only ");
		System.out.println("The above ArrayList declaration The Vc value is =20 inside provided value in the constructor.1");
		System.out.println("Lowest Index  = "+0);
		System.out.println("Highest Index = "+(list.size()-1));
		
		
		System.out.println("How to Pridict the data in the collection By providing the Wrapper classes  names in the Angles boxes in the ");
		System.out.println("List<Integer> list=new ArrlyList<Integer>(30) here Pc=0 , Vc=30 ");
		
		// How many ways I we can iterate the values inside in the List How is it possible ways 
		
	}

}
