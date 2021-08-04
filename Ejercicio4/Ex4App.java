import java.util.InputMismatchException;
import java.util.Scanner;

import Operaciones.Operaciones;

public class Ex4App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double num1 = 0;
		double num2 = 0;
		
		boolean correcto1;
		boolean correcto2;
		
		do{
			try {
				System.out.println("Introduce el primer numero");
				num1=teclado.nextDouble();
				correcto1=true;
			}catch(InputMismatchException e) {
				System.out.println("Introduce un numero");
				correcto1=false;
				teclado.nextLine();
			}
		}while(correcto1==false);
			
		do {	
			try {
				System.out.println("Introduce el segon numero");
				num2=teclado.nextDouble();
				correcto2=true;
			}catch(InputMismatchException e) {
				System.out.println("Introduce un numero");
				correcto2=false;
				teclado.nextLine();
			}
		}while(correcto2==false);	
		
		Operaciones operacion = new Operaciones(num1,num2);
		
		operacion.division();
		operacion.suma();
		operacion.resta();
		operacion.multiplicacion();
		operacion.potencia();
		operacion.raizCuadrada();
		operacion.raizCubica();
		
		
	}
	
	
}
