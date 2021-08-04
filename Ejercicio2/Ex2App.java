import Excepcion.Excepcion;

public class Ex2App {

	public static void main(String[] args) {
		
		double numero = Math.floor(Math.random()*10+1);
		
		try {
			throw new Excepcion(numero);
		}catch(Excepcion e){
			System.out.println(e.getMessage());
		}
		
	}
	
}
