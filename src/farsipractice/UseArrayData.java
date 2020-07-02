package farsipractice;

public class UseArrayData {

	public static void main(String[] args) {
		int jam[]= {2,3,4,5,6};
		change(jam);
		for(int y :jam) {
			System.out.println(y);
		}
		
	}
public static void change(int x[]) {
	for(int counter=0;counter<x.length;counter++) {
		x[counter]+=5;
	}
	}

}
