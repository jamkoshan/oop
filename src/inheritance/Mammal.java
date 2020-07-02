package inheritance;

public class Mammal extends Animal{
	public Mammal() {
		super();
		System.out.println("Animal constructor ran");
		}
	public String giveMeTheName() {
		return super.getName();
	}

}
