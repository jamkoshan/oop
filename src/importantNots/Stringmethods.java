package importantNots;

public class Stringmethods {

	public static void main(String[] args) {
	
		String s="Welcome";
		String s1="To java";
		//length method syntax=  s.length()
	    System.out.println(s.length());//Lenght of String
	
	    // Concatantion method Syntax:  s.concat(s1)
	    System.out.println(s.concat(s1));
		
	    //trim Method Syntax = s.trim()
	    
		s="   Welcome  ";
		
		System.out.println("S before strim:  "+s);
		System.out.println("S after strim "+s.trim());
	    s="Welcome";
	    // charAt(3) Syntax s.charAt(indexnumberofanStrin)
		
		System.out.println(s.charAt(3));// return char based on index number
		
		//Contains  Syntax: s.contains("wel")
		
		System.out.println(s.contains("Wel")); // Case are matter too, 
		
		//equals: it will compare two Strings   Syntax : s.equals()
System.out.println("*******");
		System.out.println(s.equals(s1));
		System.out.println(s.equals("Welcome"));
		
		// equalsIgnoreCase  syntax : equalsIgnoreCase()		
		
		System.out.println(s.equalsIgnoreCase("welcome")); // uppper case or lower case doesn't matter
		
		//replace: we can replace char  syntax : replace()

		System.out.println(s.replace("Wel", "Mel"));
		System.out.println(s.replace("Wel", "z"));
		
		// Substring: returns substring based on starting index number
		// and ending number or size number 
		// syntax:  Substring()
		
		System.out.println(s.substring(0, 4));// Welc 
		
		// toLowerCase: returns the String in lower case 
		// Syntax : toLowerCase()
		
		System.out.println(s.toLowerCase());
		
		// toUpperCase : returns the String in Upper case 
		// Syntax :  toUpperCase()
		
        System.out.println(s1.toUpperCase());		
		
	}

}
