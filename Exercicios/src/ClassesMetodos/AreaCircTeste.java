package ClassesMetodos;

public class AreaCircTeste {
	
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		//a1.pi = 10;
		
		
		AreaCirc a2 = new AreaCirc(5);
		//a2.pi = 5;
		
		//AreaCirc.PI = 3.1415;
		
		System.out.println(a1.area());
		//AreaCirc.PI = 0.1;
		//System.out.println(a2.area());
		
		System.out.println(AreaCirc.area(100));
		
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
	}

}
