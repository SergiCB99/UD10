import java.util.Scanner;

public class Ex5App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int tama�o;
		int longitud = 0;
		
		System.out.println("Introduce el tama�o del array");
		tama�o=teclado.nextInt();
		
		Password[] contrase�as = new Password[tama�o];
		
		System.out.println("Introduce la longitud de la contrase�a");
		tama�o=teclado.nextInt();
		
		for(int i = 0;i<contrase�as.length;i++) {
			
			//Si uso el constructor por defecto me genera la contrase�a si uso el que le pasamos la longitud no
			contrase�as[i] = new Password(longitud);
	
		}
		
		Boolean[] es_fuerte = new Boolean[tama�o];
		
		for(int i = 0;i<es_fuerte.length;i++) {
			
			es_fuerte[i] = contrase�as[i].esFuerte();
			
		}
		
		for(int i = 0;i<contrase�as.length;i++) {
		
			System.out.println(contrase�as[i].toString()+" "+es_fuerte[i]);
		
		}
	}
	
}
