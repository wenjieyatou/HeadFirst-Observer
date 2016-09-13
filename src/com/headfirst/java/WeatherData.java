package com.headfirst.java;

import java.util.Observable;



//����ʱ��̳�java���õĹ۲���
public class WeatherData extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;
	//�˴�ʡ�����������ݵĹ��췽��������ע��۲��ߣ�ɾ���۲��ߣ��ı���¹۲���
	public WeatherData()
	{}
	public void  measurementsChanged()
	{
		setChanged();
		notifyObservers();
						
	}
	//�����Ƿ����ݷ������� 
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
