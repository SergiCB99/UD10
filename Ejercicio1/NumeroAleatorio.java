
public class NumeroAleatorio {
	
	public double numero;
	
	public NumeroAleatorio() {
		this.numero = generarNumero();
	}
	
	public static double generarNumero() {
		double numero;
		
		numero = Math.floor(Math.random()*500+1);
		
		return numero;
	}
	
	public static int comprobarNumero(double num_usuario, double numero2,int contador) {
		
		contador++;
		
		if(num_usuario<numero2) {
			System.out.println("El numero generado es mayor al introducido");
		}else if(num_usuario>numero2) {
			System.out.println("El numero generado es menor al introducido");
		}else {
			System.out.println("Acierto con "+contador+" intentos");
		}
		
		return contador;
		
	}
	
}
