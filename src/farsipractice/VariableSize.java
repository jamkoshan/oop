package farsipractice;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class VariableSize {

	public static void main(String[] args) {
		System.out.println(avarage(46,85,89,56,25,66,325));
	}
	public static int avarage(int... numbers) {
		int total = 0;
		for(int x: numbers)
			total +=x;
		return total/numbers.length;

//		JOptionPane.showMessageDialog(null, "total is");
	}

}
