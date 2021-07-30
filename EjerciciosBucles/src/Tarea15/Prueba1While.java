package Tarea15;
import java.util.Scanner;
public class Prueba1While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		int suma=0,cantidadN=0,promedio=0;
	
		System.out.println("Introduce un numero");
		int np=entrada.nextInt();
		
		while(np!=0);{
			System.out.println("Introduce un numero");
			np=entrada.nextInt();
			
			suma=suma+np;
			cantidadN=cantidadN+1;
			promedio=suma/cantidadN;
			
		}
		
		System.out.println("La suma de todos los numeros es: "+suma);
		System.out.println("La cantidad de numeros ingresados por el usuario fueron: "+cantidadN);	
		System.out.println("El promedio de los numeros que ingreso es: "+promedio);
	}

}
