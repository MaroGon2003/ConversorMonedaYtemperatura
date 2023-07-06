package Conversor;

public class Temperatura {
	
	/*Grados Fahrenheit
	 *Grados Celsius 
	 *Grados Kelvin*/
	
	public double kelvinFahrenheit(double val) {
		return ((val - 273.15) * 9/5 + 32) ;
	}
	
	public double celsiusFahrenheit(double val) {
		return (val * 9/5) + 32;
	}
	
	public double kelvinCelsius(double valor) {
		return valor - 273.15 ;
	}
	
	public double fahrenheitCelsius(double val) {
		return (val - 32) * 5/9 ;
	}
	
	public double fahrenheitKelvin(double val) {
		return (val - 32) * 5/9 + 273.15;
	}

	public double celsiusKelvin(double val) {
		return val + 273.15;
	}
	
	
	

}
