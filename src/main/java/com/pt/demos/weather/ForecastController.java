package com.pt.demos.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pt.demos.weather.dto.ForecastDay;
import com.pt.demos.weather.exception.ForeCastNotFoundException;

@RestController
public class ForecastController {

	@Autowired
	ForecastBusiness forecastBusiness;

	@GetMapping("/forecast")
	public ForecastDay getForecast(@RequestParam String zip) {

		ForecastDay day = forecastBusiness.getForecast(zip);
		if (day == null)
			throw new ForeCastNotFoundException("ZIP CODE NOT FOUND "+ zip);
		
		return day;
	}
}
