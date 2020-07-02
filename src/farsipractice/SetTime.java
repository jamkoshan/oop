package farsipractice;

import javax.swing.JOptionPane;

public class SetTime {
	public static void main(String[] args)
	{
		TimeClass Object = new TimeClass();
		System.out.println(Object.toMilitary());
		Object.setTime(13, 31, 41);
		System.out.println(Object.toMilitary());
		System.out.println(Object.toString());
		
	JOptionPane.showMessageDialog(null, " Hi Jamshed\neclipse will remove all data at:\n"+ Object.toMilitary());
		
	}
	
}
