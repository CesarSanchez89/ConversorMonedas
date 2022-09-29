package ConversordeMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	public void ConvertirSolesADolares(double valor) {
		double monedaDolar = valor/3.96;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dólares");
	}
	
	public void ConvertirSolesAEuros(double valor) {
		double monedaEuro = valor/3.82;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes € " + monedaEuro + " Euros");
	}
	
	public void ConvertirSolesALibras(double valor) {
		double monedaLibra = valor/4.24;
		monedaLibra = (double) Math.round(monedaLibra *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes £ " + monedaLibra + " Libras");
	}
	
	public void ConvertirSolesAYen(double valor) {
		double monedaYen = valor/0.027;
		monedaYen = (double) Math.round(monedaYen *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes ¥ " + monedaYen + " Yen");
	}
	
	public void ConvertirSolesAWonCoreano(double valor) {
		double monedaWonCoreano = valor/0.0028;
		monedaWonCoreano = (double) Math.round(monedaWonCoreano *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes ₩ " + monedaWonCoreano + " Won Coreanos");
	}
	
	public void ConvertirDolaresASoles(double valor) {
		double monedaSoles = valor*3.96;
		monedaSoles = (double) Math.round(monedaSoles *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
	
	public void ConvertirEurosASoles(double valor) {
		double monedaSoles = valor*3.82;
		monedaSoles = (double) Math.round(monedaSoles *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
	
	public void ConvertirLibrasASoles(double valor) {
		double monedaSoles = valor*4.24;
		monedaSoles = (double) Math.round(monedaSoles *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
	
	public void ConvertirYenASoles(double valor) {
		double monedaSoles = valor*0.027;
		monedaSoles = (double) Math.round(monedaSoles *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
	
	public void ConvertirWonCoreanoASoles(double valor) {
		double monedaSoles = valor*0.0028;
		monedaSoles = (double) Math.round(monedaSoles *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes S/ " + monedaSoles + " Soles");
	}
}
