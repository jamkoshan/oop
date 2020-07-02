package farsipractice;
import java.util.Random;
public class RandomNumber {

	public static void main(String[] args) {
Random input= new Random();
int number;
for(int i=0;i<=10;i++) {
	number = input.nextInt(22);
	System.out.println(number);
}


	}

}