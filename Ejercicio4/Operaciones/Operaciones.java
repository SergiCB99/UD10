package Operaciones;

public class Operaciones {

	public double num1;
	public double num2;
	
	public Operaciones(double num1,double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void suma() {
		double suma = this.num1+this.num2;
		
		System.out.println("Suma "+suma);
	}
	
	public void resta() {
		double resta = this.num1-this.num2;
		
		System.out.println("Resta "+resta);
	}
	
	public void multiplicacion() {
		double multiplicacion = this.num1*this.num2;
		
		System.out.println("Multiplicacion "+multiplicacion);
	}
	
	public void division() {
		double division = this.num1/this.num2;
		
		System.out.println("Division "+division);
	}
	
	public void raizCuadrada() {
		double raiz1 = Math.sqrt(this.num1);
		double raiz2 = Math.sqrt(this.num2);
		
		System.out.println("Raiz cuadrada primer numero "+raiz1);
		System.out.println("Raiz cuadrada segundo numero "+raiz2);
	}
	
	public void raizCubica() {
		double raiz1 = Math.cbrt(this.num1);
		double raiz2 = Math.cbrt(this.num2);
		
		System.out.println("Raiz cubica primer numero "+raiz1);
		System.out.println("Raiz cubica segundo numero "+raiz2);
	}
	
	public void potencia() {
		double potencia = Math.pow(num1,num2);
		
		System.out.println("Potencia "+potencia);
	}
	
}
