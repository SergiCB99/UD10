package Excepcion;

public class Excepcion extends Exception{

	double num;
	
	public Excepcion (double numero) {
		this.num = numero;
	}
	
	public String getMessage () {
		String message;
		
		if(this.num<5) {
			message = "Numero menor que 5";
		}else{
			message = "Numero mayor que 5";
		}
		
		return message;
	}
	
}
