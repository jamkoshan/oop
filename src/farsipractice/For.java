package farsipractice;

public class For {

	public static void main(String[] args) {
//		
//		int i = 0;
//		for (; i < 10; i++)
//			System.out.println(i);
//	int j=0;
//		for (;;)
//			System.out.println(j++);
		
//		*****Write a java Program to display the multiplication table of 6 ******
		
//		int x=6;
//		int y=1;
//				for(; y<= 10;y++) {
//					System.out.println(y+" x "+x+" =  "+(x*y ));
//				}
		double amount;
		double principal=100;
	int day=1;
		double rate= 0.01;
		for (;day<20;day++)
		{
			amount =principal*Math.pow(1+rate,day);
			System.out.println(day+" "+amount);
		}
		
		
	}

}
