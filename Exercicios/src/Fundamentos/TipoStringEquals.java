package Fundamentos;

import java.util.Scanner;

public class TipoStringEquals {
	
	public static void main(String[] args) {
		
		
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));
		
		Scanner entrada= new Scanner(System.in);
		
		String s2 = entrada.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));// com nextLine ele fica vdd com.trim
		
		entrada.close();
		
		// .trim : vai retirar os espa�os em branco
		// quando vc estiver comparando string usa .equals
	}

}
