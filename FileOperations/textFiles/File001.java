package textFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;

public class File001 {

	File file;
	FileInputStream fis;
	InputStreamReader isr;
	BufferedReader br;
	FileWriter fWritr;

	FileOutputStream fos;
	String filePath = null;

	// IN this class I remove the spelling mistakes and remove special characters
	public File001(String fPath) {
		this.filePath = fPath;

		file = new File(filePath);
		/*
		 * file.createNewFile(); file.delete(); file.canExecute(); file.canRead();
		 * file.canWrite(); file.deleteOnExit(); file.equals(obj)l; file.exists();
		 * file.getAbsoluteFile(); file.getAbsolutePath(); file.getCanonicalPath();
		 * file.getFreeSpace(); file.getName(); file.getParent(); file.getPath();
		 * file.getTotalSpace(); file.getUsableSpace(); file.hashCode();
		 * file.isAbsolute(); file.isDirectory(); file.isFile(); file.isHidden();
		 * file.lastModified(); file.length(); file.list(); file.list();
		 * file.list(filter); file.listFiles(); file.listFiles(filter);
		 * file.listFiles(filter); file.listFiles(filter); file.notifyAll();
		 * file.setExecutable(executable); file.setExecutable(executable, ownerOnly);
		 * file.setLastModified(time); file.setReadable(readable); file.setReadOnly();
		 * file.setWritable(writable); file.setWritable(writable, ownerOnly);
		 * file.toPath(); file.toString(); file.toURI(); file.toURL(); file.wait();
		 * file.wait(timeout); file.pathSeparator; file.pathSeparatorChar;
		 * file.separator; file.createTempFile(prefix, suffix);
		 * file.createTempFile(prefix, suffix, directory); file.listRoots();
		 */

		try {
			fis = new FileInputStream(file);
			System.out.println("Text file is loaded for operations ");
			isr = new InputStreamReader(fis);// which purpose we will use this sttement
			br = new BufferedReader(isr);

		} catch (FileNotFoundException e) {
			System.out.println("File is not loaded from the path :: " + filePath);
			System.exit(0);
			e.printStackTrace();
		}

	}
	// My intesion is how to change the replace the new character
	// And How to perform write operation

	public List<String> readLine()// Yes this is working as I will get the data form the file
	{
		System.out.println("I'm in readLine()_Method");
		
		String line;
		
		List<String> listLine = new ArrayList<String>();
		

		try {
			while ((line = br.readLine()) != null) {
				listLine.add(line); // Here I'm adding entire line into List<String> format
			}
		} catch (IOException e) {
			System.out.println("Unable to read the and get text form the text file");
			e.printStackTrace();
		}
		List<String> intList = new ArrayList<String>();// here Integer List and Time values are available then what I
														// have to do here

		
		// for this any function is available  I will check
		Predicate<String> intPred=x->x.startsWith("0")||x.startsWith("1")||x.startsWith("2")||x.startsWith("3")||x.startsWith("4")||x.startsWith("5")||x.startsWith("6")||x.startsWith("7")||x.startsWith("8")||x.startsWith("9");
		// How to get Only predicate function specified values how to do this
	//	intList=listLine.forEach(action);
		//intList=listLine.stream().filter(intPred).collect(Collector.toList());
	
		// Here I'm performing the get the only get the integer elements and Time list from that LineList 
		listLine.stream().filter(intPred).forEach(ele->intList.add(ele)); // will this work I will check
		// Yes the above that one is working I got the only integer elements list only 
		
		/*
		for (String str : listLine) {
			System.out.println(str);

			if (str.contains("0") | str.contains("1") | str.contains("2") | str.contains("3") | str.contains("4")
					| str.contains("5") | str.contains("6") | str.contains("7") | str.contains("8")
					| str.contains("9")) {
				intList.add(str);
			}

		}
		*/
	// for reducing the for-loop work we will use streams or lamdaExpressions 
		
	// Here I'm just printing the list elements 
		intList.forEach(ele -> System.out.println(ele)); // Streams

		// then what I have to do here
		// I want to separate integer lines and time lines from that file
		// For that what I have to do

		// for Streams I have to create one Predicate Function
		Predicate<String> predString = x -> x.startsWith("0") || x.startsWith("1") || x.startsWith("2")
				|| x.startsWith("3") || x.startsWith("4") || x.startsWith("5") || x.startsWith("6") || x.startsWith("7")
				|| x.startsWith("8") || x.startsWith("9") || x.startsWith("10") || x.startsWith("11");// her I'm using
																										// starts with
																										// only

		// Function is Ready
		// Predicate<String> predicate=x->x.

		listLine.removeIf(predString);// will it work I will check

		System.out.println(listLine);
		/*
		 * for(int i=0;i<listLine.size();i++) {
		 * 
		 * listLine.removeIf(str ->
		 * str.contains("0")||str.contains("1")||str.contains("2")||str.contains("3")||
		 * str.contains("4")
		 * ||str.contains("5")||str.contains("6")||str.contains("7")||str.contains("8")|
		 * |str.contains("9")) //listLine.
		 * 
		 * //System.out.println(listLine);
		 * 
		 * }
		 */

		return listLine;
	}
public String getFileText(String fileName)
{
	String fileText=null;
	
	File file=new File(fileName);
	
	FileInputStream fisss=null;
	InputStreamReader isr=null;
	
	
	BufferedReader brRead=null;
	try {
		fisss=new FileInputStream(file);System.out.println("File is loaded ");
		
		isr=new InputStreamReader(fisss);
		brRead=new BufferedReader(isr);
	} catch (FileNotFoundException e) {
System.out.println("File is not loaded ="+filePath);
		e.printStackTrace();
	}
	String text;// initially not null and then 
	try {
		while((text=brRead.readLine())!=null)
		{
			
			fileText=fileText+text;// not brRead.readLine()-- it will get only in line text is available or not 
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println("I got Text or not I will check ");
	System.out.println(fileText);
	
	return fileText;

}
	
	public List<String> textToString() // Here I have to pass the file and perform the operation on file
	{// How to do this scenario

		List<String> txt = new ArrayList<String>();// I need dynamic thiings
		// How to do this
		// Here I have file and how to perform operations here
		// How to separate line by line and Word by word How do this

		// How to convert file text into List format How to do this

		return txt;

	}

	public List<String> passListLineString(List<String> listLine) {
		// What I have to do here
		// listLine convert into String format
		// and process split method ( " "by specifying space character ) and
		// each String I have to pass and and conver unnessary worng speeling characters
		// into correct snentance

		List<String> list = listLine;
		List<String> split = new ArrayList<String>();// this is required

		String splitString[] = new String[10];
		// Here I need length of the list why because here we have lot of line os
		// Strings are avaulable How to do this
		String line = null;
		for (int i = 0; i < list.size(); i++) {
			line = list.get(i);// Here I have line of String
			// Now I want to split here by space
			// How to add that splited String into the the split list how to
			splitString = line.split(" ");// Line is splitted

			// then what I have to do here

			for (int j = 0; j < splitString.length; j++) {
				String str = splitString[j];// Here I got one String then what I have to do here

				System.out.print("  " + str);
				split.add(str); // check this how it is useful

			}
			System.out.println("\n");// I will check later on what I have to do here

			// split.add(line.split(' '));

		}

		for (String str : split) {
			System.out.println("  " + str);// Yes I got Strings Then what I Have to do here
		}

		return split;
	}
	
	
	public void captelConver(String filePath ,String newFilePath)
	{
		// Here I want to Passs the file path and I want to get the String text form the file How to od that 
		// How to get the Stirng for the file 
	// get the file Text 
		
		String text=getFileText(filePath);
		
		String captText=text.toUpperCase();
		// or To remove spaces is it possible 
		System.out.println("After chainging  the Upper case letters "+captText);
		/*
		 * captText.replace(" ", ""); // for remove spaces captText.replaceAll(" ", "");
		 * captText.replace(" ", "");
		 * 
		 * captText.replace(" ", "");// not removing the spaces what Shoud I do
		 */				
				String splitText[]=captText.split(" ");

				String newText="";
				for(int i=0;i<splitText.length;i++)
				{
					newText=newText+splitText[i];
				}
				System.out.println("after Removing the spaces the tExt is ");
				
		// I want to convert into charaxters wise 
		char ch[]=null;
		
		ch=newText.toCharArray();
		String newSplitText="";
		// I want create a new String with each character I want to provide one space How to do this 
				for(int i=0;i<ch.length;i++)
				{
					newSplitText=newSplitText+" "+ch[i];
				}
		System.out.println("After providing spaces for each captel characters the text is ");
System.out.println(newSplitText);		
// I want to create a file for this text 
	createFileXXX(newFilePath,newSplitText);	
		System.out.println("File is created ");
	}

	
	public List<String> repalcString(List<String> list) {
		List<String> replaceList = new ArrayList<String>();

		List<String> groupList = list;

		for (int i = 0; i < groupList.size(); i++) {
			String str = groupList.get(i);

			if (str.equalsIgnoreCase("l")) {
				System.out.println("Here I'm performing the change l to I ");

				// l -- > I How to do this
				replaceList.add(i, "I");
			}

			else if (str.equalsIgnoreCase("l'm")) {
				System.out.println("Here I'm performing  change the l'm to I'm ");
				// l'm --> I'm how to do this
				replaceList.add(i, "I'm");
			}

			else if (str.equalsIgnoreCase("l've")) {
				System.out.println("Here I'm performning change the  l've --> I've ");
				replaceList.add(i, "I've");

			} else if (str.equalsIgnoreCase("lf")) {
				System.out.println("Here I'm performning change the  lf --> If ");
				replaceList.add(i, "If");

			} else if (str.equalsIgnoreCase("l'll")) {
				System.out.println("Here I'm performning change the  l'll --> I'll ");
				replaceList.add(i, "I'll");

			} else if (str.equalsIgnoreCase("Cl")) {
				System.out.println("Here I'm performning change the  Cl --> CI ");
				replaceList.add(i, "CI");

			} else if (str.equalsIgnoreCase("FlR")) {
				System.out.println("Here I'm performning change the FiR --> FIR  ");
				replaceList.add(i, "FIR");

			} else if (str.equalsIgnoreCase("lt")) {
				System.out.println("Here I'm performning change the  lt --> It ");
				replaceList.add(i, "It");

			} else if (str.equalsIgnoreCase("l,")) {
				System.out.println("Here I'm perfroming change the l, --> I,");
				replaceList.add(i, "I,");
			}

			else {
				replaceList.add(i, str); // All most I covered I will check
			}
		} // for -- loop

		return replaceList;
	}

	public void createFile(String path, String fName, List<String> strings) {
		// How to create a file

		String newFileName =fName + ".txt";
		File newFile = new File(newFileName);
		String fileText="";
		FileWriter fileWritter = null;
		try {
			fileWritter = new FileWriter(newFile);
			System.out.println("file loaded for FileWriter Stream");
		} catch (IOException e1) {
			System.out.println("FileWritter is not loaded for fileWritter Stream s check the file ");
			e1.printStackTrace();
		}
		
		for(int i=0;i<strings.size();i++)
		{
			fileText=fileText+" "+strings.get(i); // Here I got the entire list into one String line 
		}
		
		// I want to split that into on basis of (" ") ; 
		
		String splitText[]=splitText=fileText.split(" ");
		//new String[strings.size()];
		
		String reArrange=re_ArrangedText(splitText);// By this method I will get the re- Arranged Line String
	
		// then what I want to create a file 
		createFileXXX(newFileName, reArrange); 
		
		/*
		 * 
		 * for (int i = 0; i < strings.size(); i++) { try {
		 * fileWritter.write(strings.get(i) + " "); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } } try {
		 * fileWritter.close();
		 * System.out.println("After writing the Strings file is closed "); } catch
		 * (IOException e) {
		 * System.out.println("FileWritter is not closed check about that");
		 * e.printStackTrace(); }
		 */
		System.out.println("File is created go and check the location " + newFileName);
	}

	
	public void read_split(String file, String newFileName) { // this method is only for text file and that convert into new text file 

		File file1 = null;

		file1 = new File(file);
		FileInputStream fiss = null;
		InputStreamReader isrr = null;

		BufferedReader brr = null;

		try {
			fiss = new FileInputStream(file1);
			System.out.println("file is loaded for FileInputSream(file)");
			isrr = new InputStreamReader(fiss);
			System.out.println("InputStreamReader(File) is loaded  ");
			brr = new BufferedReader(isrr);
			System.out.println("BufferedReader(isr) is loaded ");
		} catch (FileNotFoundException e) {
			System.out.println("File is not loaded for FileInputStream(File) check the program whar is the problem");
			System.exit(0);

			e.printStackTrace();
		}
		// Here I nedd one List<String>
		// List<String> lines=new ArrayList<String>();

		String lineText = "";// check here conver into String or not

		String line;
		try {
			while ((line = brr.readLine()) != null) {
				lineText = lineText + " " + line; // line is added upto next line is not available in that file
			}
		} catch (IOException e) {
			System.out.println("While() condition is not working properly check that code ");
			e.printStackTrace();
		}

		// Here I have to split that Line into String and That String into check if that
		// condition is true it change the String value and that value is stored into
		// new Arraylist How to do this scenario
		// List<String> newLine=new ArrayList<String>();// this size is must be zero why
		// because all lines into one single line

		// lines.forEach(lineee -> lineText+lineee);
		/*
		 * for(String str:lines) { lineText=lineText+" "+str.toString(); // if it work
		 * next line not required }
		 */
		// Iterator<String> strs=newLine.spliterator().forEachRemaining(ele ->
		// ele.split(" "));
		// List<String> str=newLine.spliterator().forEachRemaining(ele -> ele.split("
		// "));

		// I got line then next what I have to do
		// Then I have to split that line into String How to do that

		System.out.println(lineText);
		String splitText[] = lineText.split(" ");

		for (String str : splitText) {
			System.out.println("  " + str);
		}
		// Then What we do next I have to remove that spelling mistake things and stored
		// in new StrignLine

		String mergeText = re_ArrangedText(splitText);

		// I have to create on method for this

		System.out.println("Re_ Arranged Line Text is ");
		System.out.println(mergeText);
		// System.out.println(lineTextt);
		// newLine.

		// creating the file

		createFileXXX(newFileName, mergeText);

	}

	// this method is working fine as per my expectation
	public String re_ArrangedText(String splitTextt[])// By this method I will get the re- Arranged Line String
	{// How to calculate space and time complexities
		String mergeText = ""; // k , l , m , n , o , p , q , r // this is for How many times are repeated this
								// things I have to so them up
		// what things is I have to change l , l'm , l'll , l've , l, , FlR , Cl , lt ,
		// I , I'm , I'll , I've , I, , FIR , CI , It ,

		int k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0, t = 0; // Number of Iterations and Number of
																					// conditions
		int z = 0;
		// time depends on length of the loop * System running time like (N*c-constant
		// time) // most of the time we will check worst case scenario
		for (int i = 0; i < splitTextt.length; i++)// what is the time complexity of this for loop and space complexity
													// of this loop
		{ // O(N^2*c) //_-_(N+c+c) I don't know this point of time and this point of time
			// not required about this just understanding of the things only not personally
			if (splitTextt[i].equalsIgnoreCase("l"))// what will happen here I will specify
			{
				System.out.println("I have to change l --> I ");
				mergeText = mergeText + " " + "I";
				k += 1;
			} else if (splitTextt[i].equalsIgnoreCase("l'm")) {
				System.out.println(" Here I'm change l'm -->I'm");
				mergeText = mergeText + " " + "I'm";
				l += 1;
			} else if (splitTextt[i].equalsIgnoreCase("l'll")) {
				System.out.println(" Here I'm change l'll -->I'll");
				mergeText = mergeText + " " + "I'll";
				m += 1;
			} else if (splitTextt[i].equalsIgnoreCase("l've")) {
				System.out.println(" Here I'm change l've -->I've");
				mergeText = mergeText + " " + "I've";
				n += 1;
			} else if (splitTextt[i].equalsIgnoreCase("l,")) // , l, , FlR , Cl , lt ,
			{
				System.out.println(" Here I'm change l, --> I,");
				mergeText = mergeText + " " + "I,";
				o += 1;
			} else if (splitTextt[i].equalsIgnoreCase("FlR")) {
				System.out.println(" Here I'm change FlR --> FIR ");
				mergeText = mergeText + " " + "FIR";
				p += 1;
			} else if (splitTextt[i].equalsIgnoreCase("Cl")) {
				System.out.println(" Here I'm change Cl -->CI");
				mergeText = mergeText + " " + "CI";
				q += 1;
			} else if (splitTextt[i].equalsIgnoreCase("lt")) {
				System.out.println(" Here I'm change lt -->It");
				mergeText = mergeText + " " + "It";
				r += 1;
			} else if (splitTextt[i].equalsIgnoreCase("lf")) {
				System.out.println(" Here I'm change lf -->If");
				mergeText = mergeText + " " + "If";
				s += 1;
			} /*
				 * else if(splitTextt[i].equalsIgnoreCase("l'm")) {
				 * System.out.println(" Here I'm change l'm -->I'm");
				 * mergeText=mergeText+" "+"I'm"; }else
				 * if(splitTextt[i].equalsIgnoreCase("l'm")) {
				 * System.out.println(" Here I'm change l'm -->I'm");
				 * mergeText=mergeText+" "+"I'm"; }else
				 * if(splitTextt[i].equalsIgnoreCase("l'm")) {
				 * System.out.println(" Here I'm change l'm -->I'm");
				 * mergeText=mergeText+" "+"I'm"; }else
				 * if(splitTextt[i].equalsIgnoreCase("l'm")) {
				 * System.out.println(" Here I'm change l'm -->I'm");
				 * mergeText=mergeText+" "+"I'm"; }
				 */else {
				System.out.println();
				mergeText = mergeText + " " + splitTextt[i];
				z += 1;
			} // if - else closed

		} // for -- loop is closed // k , l , m , n , o , p , q , r // this is for How
			// many times are repeated this things I have to so them up
			// what things is I have to change l , l'm , l'll , l've , l, , FlR , Cl , lt ,
			// I , I'm , I'll , I've , I, , FIR , CI , It ,
 
		System.out.println("How many time that Loop wil execute for each String ");
		System.out.println("--------------------------------------------------------------");

		System.out.println("I ------ = " + k);
		System.out.println("I'm ---- = " + l);
		System.out.println("I'll --- = " + m);
		System.out.println("I've --- = " + n);
		System.out.println("I,   --- = " + o);
		System.out.println("FIR  --- = " + p);
		System.out.println("CI   --- = " + q);
		System.out.println("lt   --- = " + r);
		System.out.println("If   --- = " + s);
		System.out.println("remaing unchanged words = " + z);

		System.out.println("--------------------------------------------------------------");
		return mergeText;
	}// method is closed

	public void createFileXXX(String filePath, String fileText) {

		File filee = new File(filePath);
		System.out.println("File is loaded for File operations");

		FileWriter fw = null;
		try {
			fw = new FileWriter(filee);
			System.out.println("file is loaded for writing the String data");
		} catch (IOException e) {
			System.out.println("FileWriter is not loaded for writing the data ");
			e.printStackTrace();
		}
		try {
			fw.write(fileText);
			System.out.println("String data is write on file go and check the file path" + filePath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fw.close();
			System.out.println("FileWriter is closed smoothly ");
		} catch (IOException e) {
			System.out.println(
					"FileWriter is not closed go and check the FileWritter code what is the RootCauseAnalysis");
			e.printStackTrace();
		}
		System.out.println("File is operations are all completed ");
	}

	public static void main(String[] args) {
		String fpath = "/home/venkat/Documents/forCaptals.txt";
		String newFilePath = "/home/venkat/Documents/newCaptalsLetters";
		//String newFileName = "New300";
		File001 fi = new File001(fpath);

		/*
		 * List<String> line=fi.readLine(); List<String>
		 * groupStrings=fi.passListLineString(line); List<String>
		 * replaceString=fi.repalcString(groupStrings);// by using this how to create a
		 * new file
		 * 
		 * System.out.println(
		 * "-----------------------------------------------------------"); for(int
		 * i=0;i<replaceString.size();i++) {
		 * System.out.println(groupStrings.get(i)+" --> "+replaceString.get(i)); }
		 * 
		 * System.out.println(
		 * "-----------------------------------------------------------");
		 * 
		 * fi.createFile(newFilePath, newFileName, replaceString);
		 * 
		 * // then what I have to do
		 * 
		 * // I have to pass that list to chage the new value How to do that
		 */

		//fi.read_split(fpath, newFilePath);
		/*
		 * List<String> lines=fi.readLine();
		 * 
		 * fi.createFile(fpath, newFilePath, lines);
		 */		
		
		//fi.read_split(fpath, newFilePath);
		
	//	fi.captelConver("hi dhfa oaoghaw ojodhfosad alkgha roha f ojahfoau assdlfh a foahfo;a f;fhao;fh");
	
	
	fi.captelConver(fpath, newFilePath);
	}

}
