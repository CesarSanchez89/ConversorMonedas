package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelsiusAFahrenheit(double valor) {
		double temperaturaFahrenheit = (valor*(9/5))+32;
		temperaturaFahrenheit = (double) Math.round(temperaturaFahrenheit *100d)/100;
		JOptionPane.showMessageDialog(null, temperaturaFahrenheit + " °F");
	}

}
