package com.headfirst.java;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

	Observable observanle;
	private float tenperature;
	private float humidity;
	 public CurrentConditionsDisplay(Observable observable){
		 
		 this.observanle = observable;
		 observable.addObserver(this);		 
		 
	 }

	 public void update(Observable o, Object arg) {
	// TODO Auto-generated method stub
	if(o instanceof WeatherData){
		WeatherData weatherdata = (WeatherData)o;
		this.tenperature = weatherdata.getTemperature();
		this.humidity = weatherdata.getHumidity();
		display();
	}
}

	public void display() {
		// TODO Auto-generated method stub
		 System.out.println("µ±Ç°ÎÂ·þ" + tenperature  + "fjshja"+humidity);
		 System.out.println("rgetgergtraeyreyeayhaeyh");
	}

}