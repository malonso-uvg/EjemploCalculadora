/**
 * 
 */
package org.calculadora.ui;

import java.util.Scanner;

import org.calculadora.controller.CalculadoraBase;
import org.calculadora.model.IOperacion;

/**
 * @author moises.alonso
 *
 */
public class CalculadoraConsole {

	public static void main(String[] args) {
		int opt = 0;
		CalculadoraBase calculadora = new CalculadoraBase();
		Scanner in = new Scanner(System.in);
		IOperacion operar;
		
		do {
			
			System.out.println("Bienvenido al sistema de Caluladora, seleccione su opcion");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicacion");
			System.out.println("4. Division");
			System.out.println("5. Residuo");
			System.out.println("6. Salir");
			
			opt = Integer.parseInt(in.nextLine());
			
			switch(opt) {
			case 1: {
				operar = calculadora.getSumaEnteros();
				} break;
				
			case 2: {
				operar = calculadora.getRestaEnteros();
			} break;
			
			case 3: {
				operar = calculadora.getMultiplicacionEnteros();
			} break;
			
			case 4: {
				operar = calculadora.getDivisionEnteros();
			} break;
			
			case 5: {
				operar = calculadora.getResiduoEnteros();
			} break;
			
			case 6: {
				System.out.println("Adios!");
			}
			
			default:{
				System.out.println("Opcion incorrecta, se selecciona suma");
				operar = calculadora.getSumaEnteros();
			}break;
			
			}
			
			if (opt != 6) {
				operar.solicitarDatos();
				operar.mostrarResultado();
			}
			
			
		}while(opt != 6);
	}	
}
