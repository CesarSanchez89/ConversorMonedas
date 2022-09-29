package Principal;
import javax.swing.JOptionPane;

import ConversordeMonedas.OpcionesConversion;

public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesConversion conversion = new OpcionesConversion();
		
		while(true) {
			String opciones = JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menú", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Distancias"}, "Elegir").toString();
			switch(opciones) {
			case "Conversor de Monedas":
				String input = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorRecibido = Double.parseDouble(input);
				conversion.ConvertirMonedas(valorRecibido);
				
				int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if(JOptionPane.OK_OPTION == respuesta) {
					System.out.println("Selecciona opción Afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				break;
			
			case "Conversor de Temperatura":
				String salida = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorInput = Double.parseDouble(salida);
				conversion.ConvertirTemperatura(valorInput);
				
				int answer = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if(JOptionPane.OK_OPTION == answer) {
					System.out.println("Selecciona opción Afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				break;
				
			case "Conversor de Distancias":
				String exit = JOptionPane.showInputDialog(null, "Ingrese un valor");
				double valorEntrada = Double.parseDouble(exit);
				conversion.ConvertirDistancia(valorEntrada);
				
				int consulta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
				if(JOptionPane.OK_OPTION == consulta) {
					System.out.println("Selecciona opción Afirmativa");
				}else {
					JOptionPane.showMessageDialog(null, "Programa Finalizado");
				}
				break;
			
			}
		}
		
	}

}
