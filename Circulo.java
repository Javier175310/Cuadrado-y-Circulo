package figus;
public class Circulo {
		public int ID;  
		
		public Circulo() {
			this(175310);	
		}
		
		public Circulo(int val) {
			ID = val;		
		}
		
		public double calcularCircunferencia() {
			return ID*(2*3.1416); 
		}
		
		public double calcularAreac() {
			return Math.pow(ID, 2)*3.1416; 
		}
		
		public void cambialongitud(int r) {
			ID = r; 
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		Circulo A = new Circulo(); 
			System.out.println(A.calcularCircunferencia()); 
		Circulo B = new Circulo ();
			System.out.println(B.calcularAreac()); 
		
		A.cambialongitud(250); 
			System.out.println(A.calcularCircunferencia()); 
		B.cambialongitud(250); 
			System.out.println(B.calcularAreac()); 

		}

	}
