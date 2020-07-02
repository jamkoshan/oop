package farsipractice;

public class ToString {

	private int month;
	private int day;
	private int year;
	
	public ToString(int month, int day, int year) {
		super();
		this.month = month;
		this.day = day;
		this.year = year;
		System.out.printf("constructor %s \n",this);
	}

	@Override
	public String toString() {
		return String.format("%d/%d/%d", day,month,year);
	}
	
}
