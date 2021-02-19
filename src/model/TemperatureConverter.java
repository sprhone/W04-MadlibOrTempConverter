package model;

/**
 * Sterling Rhone - sprhone
 * 202102 CIS175 26740
 * Feb 18, 2021
 */
public class TemperatureConverter {

	private double celsius;
	private double fahrenheit;
	
	public TemperatureConverter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TemperatureConverter(double celsius) {
		super();
		this.celsius = celsius;
		setFahrenheit(celsius);
	}

	public TemperatureConverter(double celsius, double fahrenheit) {
		super();
		this.fahrenheit = fahrenheit;
		setCelsius(fahrenheit);
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double fahrenheit) {
		this.celsius = ((fahrenheit - 32) * 5/9);
	}

	public double getFahrenheit() {
		return fahrenheit;
	}

	public void setFahrenheit(double celsius) {
		this.fahrenheit = ((celsius * 9/5) + 32);
	}

	@Override
	public String toString() {
		return "TemperatureConverter [celsius=" + celsius + ", fahrenheit=" + fahrenheit + "]";
	}
	
}
