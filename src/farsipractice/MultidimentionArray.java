
package farsipractice;

public class MultidimentionArray {

	public static void main(String[] args) {
		int firstArray [][]= {{8,9,3,7,2},{12,23,34,5,}};
		int secondArray[][]= {{5,0,9,8,8},{4,1},{22,34,34}};
		System.out.println("this is the first array");
		display(firstArray);
		System.out.println("this is the second array");
		display(secondArray);
	}

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.println(x[row][column] + "\t");
			}
			System.out.println();
		}
	}

}
