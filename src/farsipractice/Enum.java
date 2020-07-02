package farsipractice;

import java.util.EnumSet;

public class Enum {

	public static void main(String[] args) {
//	for (Enum2 city : Enum2.values()) {
//		
//		System.out.println(city +"\t"+city.getWeather()+"\t"+city.getFahrenheit());
//		}
		for (Enum2 city : EnumSet.range(Enum2.parwan, Enum2.mazar)) {
			System.out.println(city +"\t"+city.getWeather()+"\t"+city.getFahrenheit());
		}
	}
}
