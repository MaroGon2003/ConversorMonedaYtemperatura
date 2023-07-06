package Conversor;

public class Moneda {
	
	double dolar = 0.00024;
	double euro = 0.00022;
	double libraEsterlina = 0.00019;
	double yenJapones = 0.033;
	double wonSurCoreano = 0.31;
	
			
	/* - Convertir de la moneda de tu país a Dólar
       - Convertir de la moneda de tu país  a Euros
       - Convertir de la moneda de tu país  a Libras Esterlinas
       - Convertir de la moneda de tu país  a Yen Japonés
       - Convertir de la moneda de tu país  a Won sul-coreano */
	
	public double pesoDolar(double valor) {
		return valor * dolar;
	}
	
	public double pesoEuro(double valor) {
		return valor * euro;
	}
	
	public double pesoLibraEsterlina(double valor) {
		return valor * libraEsterlina;
	}
	
	public double pesoYenJapones(double valor) {
		return valor * yenJapones;
	}
	
	public double pesoWonSurCoreano(double valor) {
		return valor * wonSurCoreano;
	}
	
	/*- Convertir de Dólar a la moneda de tu país
       - Convertir de Euros a la moneda de tu país
       - Convertir de Libras Esterlinas a la moneda de tu país
       - Convertir de Yen Japonés a la moneda de tu país
       - Convertir de Won sul-coreano a la moneda de tu país */
	
	public double dolarPeso(double valor) {
		return valor/dolar;
	}
	
	public double euroPeso(double valor) {
		return valor/euro;
	}
	
	public double libraEsterlinaPeso(double valor) {
		return valor/libraEsterlina;
	}
	
	public double yenJaponesPeso(double valor) {
		return valor/ yenJapones;
	}
	
	public double wonSurCoreanoPeso(double valor) {
		return valor/wonSurCoreano;
	}

}
