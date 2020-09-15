package br.com.banco.tela;

import javax.swing.JOptionPane;

public class Magica {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static int i(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(JOptionPane.showInputDialog(msg));
	}
}
