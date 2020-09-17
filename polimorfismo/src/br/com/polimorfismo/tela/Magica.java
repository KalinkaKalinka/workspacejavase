package br.com.polimorfismo.tela;

import javax.swing.JOptionPane;

public class Magica {

	public static String s(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static double d(String msg) {
		return Double.parseDouble(JOptionPane.showInputDialog(msg));
	}
	
	public static int i(String msg) {
		return Integer.parseInt(JOptionPane.showInputDialog(msg));
	}
	
	public static float f(String msg) {
		return Float.parseFloat(JOptionPane.showInputDialog(msg));
	}
	
	public static boolean b(String msg) {
		int resp = JOptionPane.showConfirmDialog(null, 
				msg, "Selecione",JOptionPane.YES_NO_OPTION);
		if (resp == 0) {
			return true; // yes no canel = 0,1,2 neste caso 0 = true para joption confirm dialog e 1 é não
		}else {
			return false;
		}
}
}

