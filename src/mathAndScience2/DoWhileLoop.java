package mathAndScience2;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int numberGuess = 0;
		do {
			System.out.print("Guess a Number Between 1 and 20:");
			if (keyboard.hasNextInt() == true)
				numberGuess = keyboard.nextInt();
			if (numberGuess < 17)
				System.out.println("Incorrect. you Guessed " + numberGuess + ". To low!");
			if (numberGuess > 17)
				System.out.println("Incorrect. you Guessed " + numberGuess + ". To high!!");

		} while (numberGuess != 17);
		System.out.println("You Guessed " + 17 + ". CORRECT!");
	}

}
