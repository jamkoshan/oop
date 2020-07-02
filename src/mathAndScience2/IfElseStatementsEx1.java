package mathAndScience2;

import java.util.Scanner;

public class IfElseStatementsEx1 {

	public static void main(String[] args) {
		
		Scanner keyboardInput= new Scanner (System.in);
		
		int myAge=2;
		int ageGuess=0;
		System.out.print("Enter a number:");
		
		if(keyboardInput.hasNextInt()==true)ageGuess=keyboardInput.nextInt();
		
		if (ageGuess%myAge==0)System.out.println("your number is even");
		else System.out.println("your number is odd");

	}

}
