/**
 * 
 */
package org.calculadora.model;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 * @author moises.alonso
 *
 */
public class Residuo implements IOperacion {

	private int dividendo;
	private int divisor;
	
	public int getDividendo() {
		return dividendo;
	}

	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	public int getDivisor() {
		return divisor;
	}

	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}

	@Override
	public int operar(int valor1, int valor2) {
		return valor1 % valor2;
	}

	@Override
	public void solicitarDatos() {
		System.out.println("Operacion Residuo");
		System.out.println("Ingrese el dividendo");
		Scanner in = new Scanner(System.in);
		setDividendo(Integer.parseInt(in.nextLine()));
		
		System.out.println("Ingrese el divisor");
		setDivisor(Integer.parseInt(in.nextLine()));

	}

	@Override
	public void mostrarResultado() {
		System.out.println("El residuo es: " + operar(getDividendo(), getDivisor()));
	}

}
