package com.pt.demos.weather.dto;

import java.util.List;

public class ForecastDay {
private String date;
private List<ForecastHours> hour;


public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public List<ForecastHours> getHour() {
	return hour;
}

public void setHour(List<ForecastHours> hour) {
	this.hour = hour;
}

}
