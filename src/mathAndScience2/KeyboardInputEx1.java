package mathAndScience2;

public class KeyboardInputEx1 {

	public static void main(String[] args)
	throws java.io.IOException{
		char input;
		System.out.print("The capital of the United states is Washington, DC? (Answer T of F):");
		input = (char) System.in.read();//read character from keyboard
		if(input =='T') {System.out.println("correct!");}
		
		else
			System.out.println("Incorect!");
		


	}

}
