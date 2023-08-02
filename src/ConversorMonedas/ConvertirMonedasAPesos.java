package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {
	
	public void ConvertirDolaresAPesos(double valor) {
		double monedaDolar = valor * 840.34;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Chileno");
	}

	public void ConvertirEurosAPesos(double valor) {
		double monedaEuro = valor * 924.16;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Chileno");
	}

	public void ConvertirLibrasAPesos(double valor) {
		double monedaLibra = valor * 1078.51;
		monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Chileno");
	}

	public void ConvertirYenAPesos(double valor) {
		double monedaYen = valor * 5.9;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Chileno");
	}

	public void ConvertirWonAPesos(double valor) {
		double monedaWon = valor * 0.66;
		monedaWon = (double) Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos Chileno");
	}
}
