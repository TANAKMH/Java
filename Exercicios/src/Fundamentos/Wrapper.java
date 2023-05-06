package Fundamentos;


public class Wrapper {

	public static void main(String[] args) {
		
		
		// byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
/* 1 */	System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		// ou 
/* 1 */	System.out.println(("" + bo).toUpperCase());
		
		Character c = '#';// char
		System.out.println(c.toString());
	}
}
