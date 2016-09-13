package com.headfirst.java;

import java.util.Observable;



//天气时间继承java内置的观察者
public class WeatherData extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;
	//此处省略了天气数据的构造方法，比如注册观察者，删除观察者，改变更新观察者
	public WeatherData()
	{}
	public void  measurementsChanged()
	{
		setChanged();
		notifyObservers();
						
	}
	//看看是否数据发生更改 
	public void setMeasurements(float temperature,float humidity,float pressure)
	{
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public float getHumidity() {
		return humidity;
	}
	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}
	public float getPressure() {
		return pressure;
	}
	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
	
	
	
}
