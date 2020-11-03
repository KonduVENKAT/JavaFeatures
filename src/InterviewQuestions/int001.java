package InterviewQuestions;

public class int001 {

	public static void main(String[] args) {
	
		int num=1;
		
		for(int i=1;i<5;i++)  /// As per the question i to 5 in the scence i<=5 or i<5 I checked two scenarios
		{ // i will check each and every line 
			System.out.println("This is outer For Loop -- "+i);
			for(int j=1;j<i;++j)
			{
				System.out.print("\tThis is Inner For-Loop "+j);
				System.out.print(" ------  Num-value "+num);
				++num;
				System.out.println();
			}
			System.out.println();
		}
	}

}
