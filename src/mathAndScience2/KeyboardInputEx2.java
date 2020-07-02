package mathAndScience2;

public class KeyboardInputEx2 {

	public static void main(String[] args) throws java.io.IOException {
		char input;
		System.out.print("I'm thiking a letter betwen A and Z.\n\t Guess my letter:");
		input = (char) System.in.read();
		if ((input=='W')||(input=='w')) {
			System.out.println("correct!");
		
	}else
		System.out.println("Incorrect");
}
}
