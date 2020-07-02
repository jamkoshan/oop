package mathAndScience2;

public class NestedIFStatementsEx {

	public static void main(String[] args) {
//how many state ore in usa
		int guess = 35   ;
		if (guess == 50) {
			System.out.println("You are correct");
		} else {
			System.out.println("You are incorrect");
			if (guess < 40)
				System.out.println("Your guess is too far");
		}
	}

}
