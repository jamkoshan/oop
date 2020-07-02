package mathAndScience2;

import java.io.IOException;

public class JavaBreakStatement {

	public static void main(String[] args) throws IOException {
		char input;
		int i;
		char letterTest='A';
		char lowercase='a';
		System.out.print("Enter your favarit CAPITAL letter of the alphabet:");
		input = (char) System.in.read();
		for(i=1;i<26;i++) {
			if(input==letterTest||lowercase==input)
				break;
			letterTest++;
			lowercase++;
		}
		 System.out.println("your favarit letter is '"+input+"' which is letter "+i+"th");
	}

}
