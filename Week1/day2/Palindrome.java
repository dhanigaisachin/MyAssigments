package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int input, output;
		input=121;
		output=0;
		
		
		for (int i = input; i>0; i/=10) {
			
		
			int r =i%10;
			output =(output *10)+ r;
			
		}
			
		if (input == output)
		{
			System.out.println("The number is palindrome:" +input);
			
		}
		
		else
		{
			System.out.println("The number is not a palindrome");
			
			
		}
			
		}

	}


