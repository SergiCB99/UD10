import java.util.Scanner;

public class Ex5App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int tamaño;
		int longitud = 0;
		
		System.out.println("Introduce el tamaño del array");
		tamaño=teclado.nextInt();
		
		Password[] contraseñas = new Password[tamaño];
		
		System.out.println("Introduce la longitud de la contraseña");
		tamaño=teclado.nextInt();
		
		for(int i = 0;i<contraseñas.length;i++) {
			
			//Si uso el constructor por defecto me genera la contraseña si uso el que le pasamos la longitud no
			contraseñas[i] = new Password(longitud);
	
		}
		
		Boolean[] es_fuerte = new Boolean[tamaño];
		
		for(int i = 0;i<es_fuerte.length;i++) {
			
			es_fuerte[i] = contraseñas[i].esFuerte();
			
		}
		
		for(int i = 0;i<contraseñas.length;i++) {
		
			System.out.println(contraseñas[i].toString()+" "+es_fuerte[i]);
		
		}
	}
	
}
