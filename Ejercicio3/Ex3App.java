import java.util.Random;

public class Ex3App {

	public static void main(String[] args) {

		Random rand = new Random();
		
		int numero = rand.nextInt(1000);
		
		try {
			throw new Excepcion(numero);
		}catch(Excepcion e){
			System.out.println(e.getMessage());
		}
		
	}	
	
}
