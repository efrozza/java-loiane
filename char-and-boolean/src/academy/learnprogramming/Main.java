package academy.learnprogramming;

public class Main {

	public static void main(String[] args) {
		// char e boolean
		
		char mychar = 'D';
		
		// https://unicode-table.com/en/
		
		char myUnicode = '\u0044';
		char myCopyright = '\u00A9';

		System.out.println(mychar);
		System.out.println(myUnicode);	
		System.out.println(myCopyright);
		
		// boolean
		
		boolean myTrueBooleanValue = true;
		boolean myFalseBooleanValue = false;
		
		boolean isCustomerOverTwentyOne = true;
		
		if (isCustomerOverTwentyOne) {
			System.out.println("Cliente tem mais de 21 anos");
		}

	}

}
