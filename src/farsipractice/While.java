package farsipractice;

import javax.swing.JOptionPane;

public class While {

	public static void main(String[] args) {
		int jamshed = 0;
		while (jamshed <= 10) {
			System.out.println("Number" + "\t" + jamshed);
			jamshed++;
		}
	JOptionPane.showMessageDialog(null, "total is"+jamshed);
	}

}
