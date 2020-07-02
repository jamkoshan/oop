package mathAndScience2;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int month = 1;
		System.out.print("Enter the number of your fevorite month of the year: ");
		if (input.hasNextInt() == true)
			month = input.nextInt();
		switch (month) {
		case 1:
			System.out.println("your fevorite month of the year is January");
			break;

		case 2:
			System.out.println("your fevorite month of the year is Februry");
			break;

		case 3:
			System.out.println("your fevorite month of the year is March");
			break;

		case 4:
			System.out.println("your fevorite month of the year is April");
			break;

		case 5:
			System.out.println("your fevorite month of the year is May");
			break;

		case 6:
			System.out.println("your fevorite month of the year is June");
			break;

		case 7:
			System.out.println("your fevorite month of the year is July");
			break;

		case 8:
			System.out.println("your fevorite month of the year is August");
			break;

		case 9:
			System.out.println("your fevorite month of the year is September");
			break;

		case 10:
			System.out.println("your fevorite month of the year is October");
			break;

		case 11:
			System.out.println("your fevorite month of the year is November");
			break;

		case 12:
			System.out.println("your fevorite month of the year is December");
			break;

		default:
			System.out.println("you entered a wrong number of the month");

		}

	}

}
