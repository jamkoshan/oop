import java.util.Scanner; 
public class calculator {

	public static void main(String[] args) {

Scanner kabul =new Scanner(System.in);
double fnum,snum,answer;
System.out.print("Put the first number==>>");
fnum =kabul.nextDouble();
System.out.print("Put the second number==>>");
snum = kabul.nextDouble();
answer =fnum +snum;
System.out.println("Sum of " + fnum +" and " +snum+" is\t " +"("+answer+")");





	}

}
