package EstruturasDeControle;

import javax.swing.JOptionPane;

public class IF_and_ELSE {
	public static void main(String[] args) {

		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println("N�mero par!");
			} else {
			System.out.println("N�mero �mpar!");
		}
	}

}
