package com.headfirst.java;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherdata = new WeatherData();
		CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherdata);
		
		weatherdata.setMeasurements(66, 66, 66f);
		weatherdata.setMeasurements(55, 55, 55f);
		weatherdata.setMeasurements(44, 44, 44f);					
	}
}
