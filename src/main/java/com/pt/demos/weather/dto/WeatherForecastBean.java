package com.pt.demos.weather.dto;

public class WeatherForecastBean {

	private Forecast forecast;

	public Forecast getForecast() {
		return forecast;
	}

	public WeatherForecastBean() {
		super();
	}

	public void setForecast(Forecast forecast) {
		this.forecast = forecast;
	}
	
}
