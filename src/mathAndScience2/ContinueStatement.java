package mathAndScience2;

public class ContinueStatement {

	public static void main(String[] args) {
//		 even number between 1 and 100
		int i;
		for (i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i + "-is even");
				continue;
			}
			System.out.println(i);
		}

//		char i;
//		for(i='A';i<='Z';i++) {
//		{
//			if(i=='A'||i=='E'||i=='I'||i=='O'||i=='U') 
//	System.out.println(i);
//				continue;
//		
//			}
////		System.out.println(i);
//		}

	}

}
