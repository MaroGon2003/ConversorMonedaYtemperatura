package Conversor;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Moneda objM = new Moneda();

		Object[] Conversor = { "Conversor de moneda", "Conversor de temperatura", "salir" };

		String conv = "";

		do {
			Object opciones = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
					"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, Conversor, Conversor[1]);
			conv = opciones.toString();

			switch (conv) {
			case "Conversor de moneda":

				int resp;

				do {

					double valor = Validaciones.leerReal("Ingrese el valor de la moneda que desaea convertir");

					Object[] monedas = { "Peso", "Dolar", "Euro", "Libras esterlina", "Yen Japonés",
							"Won sul-coreano" };
					Object opcM1 = JOptionPane.showInputDialog(null, "Seleccione la moneda ingresada",
							"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[5]);
					Object opcM2 = JOptionPane.showInputDialog(null, "Seleccione una opcion de conversion",
							"Seleccione una opción", JOptionPane.QUESTION_MESSAGE, null, monedas, monedas[5]);

					if (opcM1 == opcM2) {
						JOptionPane.showMessageDialog(null, "Error! Seleccione monedas diferentes porfavor", null,
								JOptionPane.ERROR_MESSAGE);
						break;
					}

					switch (opcM1 + " a " + opcM2) {

					case "Peso a Dolar":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objM.pesoDolar(valor)) + "  Dolares");
						break;

					case "Peso a Euro":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objM.pesoEuro(valor)) + "  Euros");
						break;

					case "Peso a Libra esterlina":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objM.pesoLibraEsterlina(valor)) + "  Libras Esterlinas");
						break;

					case "Peso a Yen Japonés":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objM.pesoYenJapones(valor)) + "  Yen Japonés");
						break;

					case "Peso a Won sul-coreano":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objM.pesoWonSurCoreano(valor)) + "  Won sul-coreano");
						break;

					// ---------------------------------------------------------------------------------

					case "Dolar a Peso":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objM.dolarPeso(valor)) + " Pesos");
						break;
						
					case "Euro a Peso":
						JOptionPane.showMessageDialog(null, String.format("%.2f", objM.euroPeso(valor)) + "  Pesos");
						break;
						
					case "Libra esterlina a Peso":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objM.libraEsterlinaPeso(valor)) + "  Pesos");
						break;
						
					case "Yen Japonés a Peso":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objM.yenJaponesPeso(valor)) + "  Pesos");
						break;
						
					case "Won sul-coreano a Pesos":
						JOptionPane.showMessageDialog(null,
								String.format("%.2f", objM.wonSurCoreanoPeso(valor)) + "  Pesos");
						break;

					} // fin opc de monedas

					resp = JOptionPane.showConfirmDialog(null, "Desea ingresar mas monedas?", null,
							JOptionPane.YES_NO_OPTION);

				} while (resp == JOptionPane.YES_OPTION);

				break; // fin conversor de monedas

			case "Conversor de temperatura":

				System.out.println("temperatura");

				break;
			}// fin del menu principal

		} while (conv != "salir");

	}

}
