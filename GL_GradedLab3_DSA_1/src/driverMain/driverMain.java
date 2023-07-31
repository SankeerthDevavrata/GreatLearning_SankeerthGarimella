package driverMain;

import java.util.Scanner;
import validations.BalancedBracketsValidation;

public class driverMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Brackets: ");
		String Brackets=sc.nextLine();
		
		BalancedBracketsValidation checkBalancedBrackets = new BalancedBracketsValidation(Brackets);
		Boolean bracketsClosedOrNot = checkBalancedBrackets.checkBrackets();
		
		if(bracketsClosedOrNot) System.out.println("The entered Strings do contain Balanced Brackets");
		else System.out.println("The entered Strings do not contain Balanced Brackets");
		
		sc.close();
		
		
	}

}
