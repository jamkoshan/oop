
package farsipractice;

import javax.swing.JOptionPane;

public class SumArray {

	public static void main(String[] args) {
		int jam[] = { 45, 58, 2, 56, 2, 69 };
		int sum = 0;
		for (int i = 0; i < jam.length; i++) {
			sum = sum + jam[i];
		}
		System.out.println("sum of all numbers is: " + sum);
		JOptionPane.showMessageDialog(null, "total is" + sum);
	}

}
