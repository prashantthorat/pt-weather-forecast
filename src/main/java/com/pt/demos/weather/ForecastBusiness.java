package com.pt.demos.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pt.demos.weather.dto.ForecastDay;
import com.pt.demos.weather.dto.WeatherForecastBean;

@Component
public class ForecastBusiness {

	@Autowired
	WeatherForcastProxyService proxy;

	public ForecastDay getForecast(String zip) {
		ForecastDay nextDay = null;
		try {
			WeatherForecastBean bean = proxy.retriveWeatherForecast("405ae81fc0c94c428da135808201012", "2", zip);
			if (bean.getForecast().getForecastday().size() > 1) {
				nextDay = bean.getForecast().getForecastday().get(1);
			}
		} catch (Exception e) {

		}
		return nextDay;
	}

}
