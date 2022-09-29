package ConversorDistancia;

import javax.swing.JOptionPane;

public class ConvertirDistancia {
	
	public void ConvertirKmAMillas(double valor) {
		double millas = valor*0.62;
		millas = (double) Math.round(millas *100d)/100;
		JOptionPane.showMessageDialog(null, millas + " millas");
	}

}
