import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1App {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double num_usuario = 0;
		int contador = 0;
		
		NumeroAleatorio numero = new NumeroAleatorio();
		
		do {
			
			try {
				System.out.println("Introduce el numero");
				num_usuario=teclado.nextDouble();
			}catch(InputMismatchException e) {
				System.out.println("Introduce un numero");
				teclado.nextLine();
			}
			
			contador = numero.comprobarNumero(num_usuario, numero.numero,contador);	
		}while(num_usuario!=numero.numero);
		
	}
	
}
