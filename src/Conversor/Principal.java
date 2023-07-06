package Conversor;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Moneda objM = new Moneda();
		Temperatura objT = new Temperatura();

		Object[] Conversor = { "Conversor de moneda", "Conversor de temperatura", "salir" };

		String conv = "";

		do {
			Object opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
					"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, Conversor, null);
			conv = opciones.toString();

			int resp;
			double valor;

			switch (conv) {
			case "Conversor de moneda":

				do {

					valor = Validaciones.leerReal("Ingrese el valor de la moneda que desaea convertir");

					Object[] monedas = { "Peso", "Dolar", "Euro", "Libras esterlina", "Yen Japonés",
							"Won sul-coreano" };
					Object[] monedas2 = {"Dolar", "Euro", "Libras esterlina", "Yen Japonés"};

					Object opcM1 = JOptionPane.showInputDialog(null, "Seleccione la moneda ingresada",
							"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[5]);
					
					if (opcM1 == null) {
						break;
					}

					Object opcM2 = "";

					if (opcM1 != "Peso") {
						Object[] Monedas = { "Peso" }; // Creo una nueva coleccion de opcines para monedo dado que
														// cualquier moneda internacional solo puede pasar a pesos

						opcM2 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
								"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, Monedas, Monedas[0]);
					} else {
						opcM2 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
								"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, monedas2, monedas2[0]);
					}
					
					if (opcM2 == null) {
						break;
					}

					if (opcM1 == opcM2) { // por si se selecciona peso dos veces
						JOptionPane.showMessageDialog(null, "Error! Seleccione monedas diferentes porfavor", null,
								JOptionPane.ERROR_MESSAGE);
						break;
					}

					switch (opcM1 + " a " + opcM2) {

					case "Peso a Dolar":
						JOptionPane.showMessageDialog(null,
								"$ " + String.format("%.2f", objM.pesoDolar(valor)) + "  Dolares");
						break;

					case "Peso a Euro":
						JOptionPane.showMessageDialog(null,
								"€ " + String.format("%.2f", objM.pesoEuro(valor)) + "  Euros");
						break;

					case "Peso a Libras esterlina":
						JOptionPane.showMessageDialog(null,
								"£ " + String.format("%.2f", objM.pesoLibraEsterlina(valor)) + "  Libras Esterlinas");
						break;

					case "Peso a Yen Japonés":
						JOptionPane.showMessageDialog(null,
								"¥ " + String.format("%.2f", objM.pesoYenJapones(valor)) + "  Yen Japonés");
						break;

					case "Peso a Won sul-coreano":
						JOptionPane.showMessageDialog(null,
								"₩ " + String.format("%.2f", objM.pesoWonSurCoreano(valor)) + "  Won sul-coreano");
						break;

					// ---------------------------------------------------------------------------------

					case "Dolar a Peso":
						JOptionPane.showMessageDialog(null,
								"$ " + String.format("%.2f", objM.dolarPeso(valor)) + " Pesos");
						break;

					case "Euro a Peso":
						JOptionPane.showMessageDialog(null,
								"$ " + String.format("%.2f", objM.euroPeso(valor)) + "  Pesos");
						break;

					case "Libra esterlina a Peso":
						JOptionPane.showMessageDialog(null,
								"$ " + String.format("%.2f", objM.libraEsterlinaPeso(valor)) + "  Pesos");
						break;

					case "Yen Japonés a Peso":
						JOptionPane.showMessageDialog(null,
								"$ " + String.format("%.2f", objM.yenJaponesPeso(valor)) + "  Pesos");
						break;

					case "Won sul-coreano a Pesos":
						JOptionPane.showMessageDialog(null,
								"$ " + String.format("%.2f", objM.wonSurCoreanoPeso(valor)) + "  Pesos");
						break;

					} // fin opc de monedas

					resp = JOptionPane.showConfirmDialog(null, "Desea ingresar mas monedas?", null,
							JOptionPane.YES_NO_OPTION);

				} while (resp == JOptionPane.YES_OPTION);

				break; // fin conversor de monedas

			case "Conversor de temperatura":

				Object opcM1;
				do {

					valor = Validaciones.leerReal("Ingrese el valor de la temperatura que desaea convertir");
					
					if(valor == 0) {
						break;
					}

					Object[] Temperaturas = { "Grados Fahrenheit", "Grados Celsius", "Grados Kelvin" };
					Object[] temperaturaSinKelvin = { "Grados Fahrenheit", "Grados Celsius" };
					Object[] temperaturaSinCelsius = { "Grados Fahrenheit", "Grados Kelvin" };
					Object[] temperaturaSinFahrenheit = { "Grados Celsius", "Grados Kelvin" };

					opcM1 = JOptionPane.showInputDialog(null, "Seleccione la temperatura ingresada",
							"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, Temperaturas, null);

					if (opcM1 == null) {
						break;
					}

					Object opcM2 = "";

					if (opcM1 == "Grados Kelvin") {

						opcM2 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
								"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, temperaturaSinKelvin,
								null);

					} else if (opcM1 == "Grados Celsius") {

						opcM2 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
								"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, temperaturaSinCelsius,
								null);

					} else {

						opcM2 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
								"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, temperaturaSinFahrenheit,
								null);

					}
					
					if (opcM2 == null) {
						break;
					}


					switch (opcM1 + " a " + opcM2) {

					case "Grados Kelvin a Grados Fahrenheit":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objT.kelvinFahrenheit(valor)) + " °F");
						break;

					case "Grados Celsius a Grados Fahrenheit":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objT.celsiusFahrenheit(valor)) + " °F");
						break;

					case "Grados Celsius a Grados Kelvin":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objT.celsiusKelvin(valor)) + " K");
						break;

					case "Grados Fahrenheit a Grados Kelvin":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objT.fahrenheitKelvin(valor)) + " K");
						break;

					case "Grados Fahrenheit a Grados Celsius":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objT.fahrenheitCelsius(valor)) + " °C");
						break;

					case "Grados Kelvin a Grados Celsius":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objT.kelvinCelsius(valor)) + " °C");
						break;

					} // fin opc de monedas

					resp = JOptionPane.showConfirmDialog(null, "Desea ingresar mas valores de temperatura?", null,
							JOptionPane.YES_NO_OPTION);

				} while (resp == JOptionPane.YES_OPTION);

				break; // fin conversor de temperatura
						
			}// fin del menu principal

		} while (conv != "salir");

		JOptionPane.showMessageDialog(null, "Programa finalizado :)");

	}

}
