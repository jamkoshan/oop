import java.util.Scanner;

public class Import2 {

	public static void main(String[] args) {

		Scanner kabul = new Scanner(System.in);
		int fnum, snum, answer;
		System.out.print("Put the first number==>>");
		fnum = kabul.nextInt();
		System.out.print("Put the second number==>>");
		snum = kabul.nextInt();
		answer = fnum + snum;
		System.out.println("Sum of " + fnum + " and " + snum + " is\t " + "(" + answer + ")");

	}

}
	