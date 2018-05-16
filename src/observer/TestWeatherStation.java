package observer;

import org.omg.CORBA.Current;

public class TestWeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80f, 30f, 64f);
		weatherData.setMeasurements(5f, 63f, 64f);
	}
}
