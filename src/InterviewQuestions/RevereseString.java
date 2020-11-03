package InterviewQuestions;

public class RevereseString {

	public static void main(String[] args) {
	

		String str="Venkat";
		char shStr[]=str.toCharArray();
		for(int i=shStr.length-1;i>=0;--i) // --i or i-- is both conditions working fine 
		{
			System.out.print(shStr[i]+"  ");
		}
		System.out.println("\n Another way is for reversing a Stirng ");
		int j=shStr.length-1;
		
		for(int i=0;i<shStr.length;i++)
		{
			int s=j-i;
			int k=shStr.length-i-1; // because  it's array is index-1  // for this each time executing the script
										// internally creating the objects for that above line will work also 
			System.out.print(shStr[k]+"  ");
		}
	}

}
