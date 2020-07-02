package mathAndScience2;

import java.io.IOException;

public class KeyboardCharacters {

	public static void main(String[] args) throws IOException {
		char input;
		boolean sunny = true, warm = false;
		System.out.println("is it sunny outside?(Enter Y or N)");
		input = (char) System.in.read();
		if (input == 'Y')
			sunny = true;
		if (input == 'N')
			sunny = false;
		input = (char) System.in.read();
		input = (char) System.in.read();
		System.out.println("Is it warm outside?(Enter Y or N)");
		
		
		input = (char) System.in.read();
		if (input == 'Y')
			warm = true;
		if (input == 'N')
			warm = false;
		if ((sunny == true) && (warm == true))
			System.out.println("It is sunny and warm outside");
		if ((sunny == true) && (warm == false))
			System.out.println("It is sunny and cold outside");
		if ((sunny == false) && (warm == false))
			System.out.println("It is cloudy and cold outside");
		if ((sunny == false) && (warm == true))
			System.out.println("It is cloudy and warm");
	}

}
