/**
 * 
 */
package org.calculadora.model;
import java.util.*;

/**
 * @author moises.alonso
 *
 */
public class Resta implements IOperacion {
	
	int valor1, valor2 = 0; 
	
	@Override
	public int operar(int valor1, int valor2) {
		
		return valor1 - valor2;
	}

	@Override
	public void solicitarDatos() {
		Scanner in = new Scanner(System.in);
		System.out.println("----Ingrese el valor 1----");
		valor1 = Integer.parseInt(in.nextLine());
		System.out.println("----Ingrese el valor 2----");
		valor2 = Integer.parseInt(in.nextLine()); 
		System.out.println("El resultado de la resta ("+ valor1 + " - " + valor2 + ") es: " + operar(valor1,valor2));
		in.close(); 
		

	}

	@Override
	public void mostrarResultado() {
		System.out.println("--------Resta--------");
		solicitarDatos(); 

	}

}
