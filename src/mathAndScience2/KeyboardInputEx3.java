package mathAndScience2;

public class KeyboardInputEx3 {

	public static void main(String[] args)throws java.io.IOException {
		char lowercase,uppercase;
		 System.out.print("Type a letter in lowercase:");
		 lowercase = (char) System.in.read();
		 System.out.println("You typed in the letter:"+lowercase);
		 uppercase =(char) (lowercase-32);
		System.out.println("the Uppercase version is: "+ uppercase);

	}

}
