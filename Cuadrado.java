package figus;

public class Cuadrado {
	public int ID;  
	
	public Cuadrado() {
		this(175310);	
	}
	
	public Cuadrado(int val) {
		ID = val;		
	}
	
	
	public double calcularArea() {
		return ID*2; 
	}
	
	public double calcularPerimetro() {
		return ID*4; 
	}
	
	public double calcularDiagonal() {
		return Math.sqrt(Math.pow(ID, 2)+Math.pow(ID, 2));
	}
	
	public void cambiarlongitud(int r) {
		ID = r; 
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado A = new Cuadrado(); 
			System.out.println(A.calcularArea()); 
		Cuadrado B = new Cuadrado ();
			System.out.println(B.calcularPerimetro()); 
		Cuadrado C = new Cuadrado(); 
			System.out.println(C.calcularDiagonal()); 
		Cuadrado D = new Cuadrado (); 
			System.out.println(D.calcularArea()); 
			//D.cambiarLongitud(1);
	}
}

