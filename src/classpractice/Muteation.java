package classpractice;

public class Muteation {

	public static void main(String[] args) {
		String st = "t";
		StringBuffer sb = new StringBuffer("t");

		for (int i = 0; i < 10; i++) {
			st += i + 1;
			sb.append(i + 1);
			System.out.print("st " + st + "\t\t\t\t");
			System.out.println("sb " + sb);
		}
		String testData = "raaaahk";
		StringBuilder sB = new StringBuilder (testData);
		System.out.println(sB.reverse());
		
	}

}
