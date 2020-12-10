package com.pt.demos.weather;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.pt.demos.weather.dto.WeatherForecastBean;

@FeignClient(name = "weather-forecast-service", url = "http://api.weatherapi.com")
public interface WeatherForcastProxyService {

	/// v1/forecast.json?key=405ae81fc0c94c428da135808201012&q=10001&days=2
	@GetMapping("/v1/forecast.json")
	public WeatherForecastBean retriveWeatherForecast(@RequestParam(defaultValue = "405ae81fc0c94c428da135808201012") String key,
			@RequestParam(defaultValue = "2") String days, @RequestParam String q);
}
