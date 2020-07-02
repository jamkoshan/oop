package farsipractice;

import java.io.FileReader;
import java.io.BufferedReader;
//import java.io.FileNotFoundException;

public class Exeptions {

	public static void main(String[] args)    {
		try {
			FileReader fr = new FileReader("text.txt");
			BufferedReader br = new BufferedReader(fr);
			
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println("Read:" + line);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
