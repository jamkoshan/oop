package classpractice;

public class Ahmad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int x=600;
//int y=700;
//int z=300;
//if(x>y && x>z) {
//	System.out.println("x is ...");
//}
int num =1246789;
int rev=0;
while (num!=0)
{int n = num%10;
rev =rev*10+n;
num=num/10;

}
System.out.println("revers number is:   " +rev);
	}

}
