package farsipractice;

public class ToStringname {
	private String name;
	private ToString birthday;
	
	public ToStringname(String theName, ToString theDate) {
		
	name=theName;
		birthday= theDate;
	}

	@Override
	public String toString() {
		return String.format("My name is %s and My birthday is %s",name,birthday);
	}
	
	

}
