package Fundamentos;

public class Convers�oTiposPrimitivosNumerico {

	public static void main(String[] args) {
		
		double a = 1;// impl�cita
		System.out.println(a);
		
		float b =(float) 1.123457897;// expl�cita(CAST) gerou perda de informa��o
		System.out.println(b);
		
		int c = 127;// ou 130 de exemplo  pq o byte suporta -128 a +127
		byte d = (byte)c; // expl�cita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int)e;
		System.out.println(f);
				
	}
}
