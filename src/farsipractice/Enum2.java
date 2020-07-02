package farsipractice;

public enum Enum2 {
	
	kabul("cold","32"),
	parwan("cold","33"),
	salang("coldest","12"),
	mazar("medel","72"),
	takhar("hot","95");
	private final String weather;
private final String fahrenheit;


private Enum2(String weather, String fahrenheit) {
	this.weather = weather;
	this.fahrenheit = fahrenheit;
	
}


public String getWeather() {
	return weather;
}


public String getFahrenheit() {
	return fahrenheit;
}
 
}
