
public class Excepcion extends Exception {

	int num;
	
	public Excepcion (int numero) {
		this.num = numero;
	}
	
	public String getMessage () {
		String message;
		
		if(this.num%2==0) {
			message = "Es par";
		}else{
			message = "Es impar";
		}
		
		return message;
	}
	
}
