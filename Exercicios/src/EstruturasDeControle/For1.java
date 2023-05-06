package EstruturasDeControle;

public class For1 {
	 public static void main(String[] args) {
		 
/*		 int contador = 0;
			while(contador <= 20) {
				System.out.printf("i = %d\n", contador);
				contador ++;*/
		
		 for(int contador = 0; contador <= 10; contador ++) {
			 System.out.printf("i = %d\n", contador);
		 }
		 // ou
		 int x = 0;
		 for(; x < 10;) {
			 System.out.println("x =" + x);
			 x++;
		 }
		 // laço infinito
		 /*for(;;) {  
			 System.out.println("Fim!");
		 }*/
	}

}
