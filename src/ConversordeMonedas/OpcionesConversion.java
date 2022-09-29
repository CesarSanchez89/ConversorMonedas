package ConversordeMonedas;

import javax.swing.JOptionPane;

import ConversorTemperatura.ConvertirTemperatura;
import ConversorDistancia.*;


public class OpcionesConversion {
	
	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirTemperatura temperatura = new ConvertirTemperatura(); 
	ConvertirDistancia distancia = new ConvertirDistancia();
	
	public void ConvertirMonedas(double valor) {
		
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la moneda a la que deseas convertir tu dinero", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Soles a Dólares", "De Soles a Euros", "De Soles a Libras", "De Soles a Yen", "De Soles a Won Coreano", "De Dólar a Soles", "De Euro a Soles", "De Libras a Soles", "De Yen a Soles", "De Won Coreano a Soles"},
				"Seleccion")).toString();
		switch(opcion) {
		case "De Soles a Dólares": 
			monedas.ConvertirSolesADolares(valor);
			break;
		
		case "De Soles a Euros":
			monedas.ConvertirSolesAEuros(valor);
			break;
			
		case "De Soles a Libras":
			monedas.ConvertirSolesALibras(valor);
			break;
		
		case "De Soles a Yen":
			monedas.ConvertirSolesAYen(valor);
			break;
			
		case "De Soles a Won Coreano":
			monedas.ConvertirSolesAWonCoreano(valor);
			break;
		
		case "De Dólar a Soles": 
			monedas.ConvertirDolaresASoles(valor);
			break;
		
		case "De Euro a Soles":
			monedas.ConvertirEurosASoles(valor);
			break;
			
		case "De Libras a Soles":
			monedas.ConvertirLibrasASoles(valor);
			break;
		
		case "De Yen a Soles":
			monedas.ConvertirYenASoles(valor);
			break;
			
		case "De Won Coreano a Soles":
			monedas.ConvertirWonCoreanoASoles(valor);
			break;		
			
		}
		
	}

	public void ConvertirTemperatura(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la temperatura que desea convertir", "Grados",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Celsius a Fahrenheit"},
				"Seleccion")).toString();
		switch(opcion) {
		case "De Celsius a Fahrenheit": 
			temperatura.ConvertirCelsiusAFahrenheit(valor);
			break;
		}
		
	}
	
	public void ConvertirDistancia(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, 
				"Elije la distancia que desea convertir", "distancia",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
				{"De Km a Millas"},
				"Seleccion")).toString();
		switch(opcion) {
		case "De Km a Millas": 
			distancia.ConvertirKmAMillas(valor);
			break;
		}
		
	}


}
