package farsipractice;

public class Array2 {

	public static void main(String[] args) {
		System.out.println("Number\tCity");
		String city[] = { "Kabul", "Panjsher", "Parwan", "Balkh" };
		for (int i = 0; i < city.length; i++)
			System.out.println(i + "\t" + "("+city[i]+")");

	}

}
