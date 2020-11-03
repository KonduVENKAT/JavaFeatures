package java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInterfaceConcept {

	public static void main(String[] args) {
	
		
	Predicate<Integer> funInt=x -> x > 5;	// most of the time we will use for comparison operators
	Predicate<Integer> funInt1=x ->  x < 5;	
	List<Integer> lInt=Arrays.asList(1 ,2,3,4,5,6,7,8,9,10,0,15,14,17,45,50);
		System.out.println(lInt);
		
	// Here I want to provide Predict some numbers and store that numbers is some other List<Integer>
	List<Integer> liPred=lInt.stream().filter(funInt).collect(Collectors.toList());
	System.out.println(liPred);
	List<Integer> liPred1=lInt.stream().filter(funInt1).collect(Collectors.toList());
	System.out.println(liPred1);
	System.out.println(liPred);
	System.out.println(lInt);
	
	
	//redicate with && operator 
									// Here we will use Predicate Function , here Collectors we will use for to store Group of elements in one new List 
	List<Integer> liInt2=lInt.stream().filter(x-> x > 5 && x < 25).collect(Collectors.toList());
	System.out.println(liInt2);
	
	// Let us check in String type formats 
	
	Predicate<String> predString=x->x.startsWith("venkat");//her I'm using starts with only 
	List<String> liString=Arrays.asList("Venkateswrlu","venkatarao","venkey","venakat","janaki","venkat&Janaki");
	
	System.out.println(liString);
	
	liString.set(0, "venkateswarlu");
	System.out.println(liString);
	
	List<String> opString=liString.stream().filter(predString).collect(Collectors.toList());
	System.out.println(opString);
	// Here I want to change the List type to Set type Collectors.toSet();
	Set<String> setopString=liString.stream().filter(predString.negate()).collect(Collectors.toSet());
	System.out.println("This is in the format of Set<String> : \n"+setopString);
// Here I convert the Collection of List to Map<String>
	Function keyMapper = null;
	Function valueMapper = null;
	Map<Integer,String> mapString=liString.stream().filter(predString.or(x->x.endsWith("ki"))).collect(Collectors.toMap(keyMapper, valueMapper));
	
	System.out.println("Map<String>");
	System.out.println(mapString);// I'm Getting Null Pointer Exception 
	}

}
