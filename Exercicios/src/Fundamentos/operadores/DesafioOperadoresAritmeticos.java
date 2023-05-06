package Fundamentos.operadores;

public class DesafioOperadoresAritmeticos {
	
	public static void main(String[] args) {
		
		int a = 6 * (3 + 2);
		int b = 3 * 2;
		int c = (int)Math.pow(a, 2);
		int d = c / b;
		System.out.println(d);
		
		int e = (1 - 5) * (2 - 7);
		int f = 2;
		int g = e / f;
		int h = (int)Math.pow(g, 2);
		System.out.println(h);
		
		int i = d - h;
		int j = (int)Math.pow(i, 3);
		int k = 10;
		int l = (int)Math.pow(k, 3);
		int m = j / l;
		
		System.out.println("O total é: " + m);
		
		/*           OU
		  
		 double numA = Math.pow(6 *(3 + 2), 2);
		 double denA = 3 * 2;
		 
		 double numB = (1 + 5) * (2 - 7);
		 double denB = 2;
		 
		 double superiorA = numA / denA;
		 double superiorB = Math.pow(numB / denB, 2);
		  
		 double superior =Math.pow(superiorA - superiorB, 3);
		 double inferior = Math.pow(10, 3);
		 
		 double resultado = superior / inferior;
		  
		 System.out.println("O resultado é: " + resultado);
		 
		 * */                  
		
	}

}
