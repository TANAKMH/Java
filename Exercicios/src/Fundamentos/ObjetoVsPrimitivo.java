package Fundamentos;

public class ObjetoVsPrimitivo {
	
	public static void main(String[] args) {
		
		String s = new String("texto");
		s.toUpperCase();
		System.out.println(s);
		
		// Wrappers s�o a vers�o objeto do tipos
		// primitivos !
		int a = 123;
		System.out.println(a);
		 
	}

}
