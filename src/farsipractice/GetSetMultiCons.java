package farsipractice;

public class GetSetMultiCons {

	public static void main(String[] args) {
		MultipleConstructor Object1 = new MultipleConstructor();
		MultipleConstructor Object2 = new MultipleConstructor(5);
		MultipleConstructor Object3 = new MultipleConstructor(5,13);
		MultipleConstructor Object4 = new MultipleConstructor(5,13,45);
System.out.println(Object1.toMilitary());
System.out.println(Object2.toMilitary());
System.out.println(Object3.toMilitary());
System.out.println(Object4.toMilitary());
	}

}
