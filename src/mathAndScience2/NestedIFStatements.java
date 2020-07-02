package mathAndScience2;

public class NestedIFStatements {

	public static void main(String[] args) {

		int temp = 80;
		boolean sunny = true;
		if (temp > 95) {
			System.out.println("It is hot outside");
			if (sunny == true) {
				System.out.println("It is also sunny outside ");
			} else {
				System.out.println("It is cloudy outside");

			}
		} else {
			System.out.println("It is cold outside");
			if (sunny == false) {
				System.out.println("It is also cloudy outside ");
			} else {
				System.out.println("It is sunny outside");

			}
		}
	}
}
