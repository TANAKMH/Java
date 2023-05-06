package Fundamentos;

public class ConversãoTiposPrimitivosNumerico {

	public static void main(String[] args) {
		
		double a = 1;// implícita
		System.out.println(a);
		
		float b =(float) 1.123457897;// explícita(CAST) gerou perda de informação
		System.out.println(b);
		
		int c = 127;// ou 130 de exemplo  pq o byte suporta -128 a +127
		byte d = (byte)c; // explícita (CAST)
		System.out.println(d);
		
		double e = 1;
		int f = (int)e;
		System.out.println(f);
				
	}
}
