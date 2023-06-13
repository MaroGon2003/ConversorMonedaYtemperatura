package Conversor;

import javax.swing.JOptionPane;

public class Validaciones {

	// Metodo para leer numeros reales
	public static double leerReal(String mensaje) {
		double num = 0;
		do {
			try {

				num = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
				if (num <= 0)
					JOptionPane.showMessageDialog(null, "ERROR, El Numero debe ser mayor que cero",null,JOptionPane.ERROR_MESSAGE);

			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "ERROR - OJO la Excepcion es: " + e,null,JOptionPane.ERROR_MESSAGE);
			}
		} while (num <= 0);

		return (num);
	}// fin del metodo de validacion de num reales


}
