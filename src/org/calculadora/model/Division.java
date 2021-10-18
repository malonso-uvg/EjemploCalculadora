/**
 * 
 */
package org.calculadora.model;

import java.util.Scanner;

/**
 * @author moises.alonso
 *
 */
public class Division implements IOperacion {

	private int divisor;
	private int dividendo;
	boolean valido=false;
	
	Scanner in= new Scanner(System.in);
	
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

	public boolean isValido() {
		return valido;
	}

	public void setValido(boolean valido) {
		this.valido = valido;
	}

	@Override
	public int operar(int valor1, int valor2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void solicitarDatos() {
		// TODO Auto-generated method stub
				
		while (!valido)
		{
			System.out.println("Ingrese el divisor  (Únicamente números enteros)");
			
			try 
			{
				divisor= Integer.parseInt(in.nextLine());
				System.out.println("Numero ingresado correctamente");
				valido= true;
				System.out.println("------------------------------------------------------------------------------------------\n");
			}
			
			catch(Exception e) 
			{
			  System.out.println("Numero invalido, por favor intente nuevamente");
			}
		}

		valido= false;
		
		while (!valido)
		{
			System.out.println("Ingrese el dividendo (únicamente números enteros)");
			
			try 
			{
				dividendo= Integer.parseInt(in.nextLine());
				System.out.println("Numero ingresado correctamente");
				valido= true;
				System.out.println("------------------------------------------------------------------------------------------\n");
			}
			
			catch(Exception e) 
			{
			  System.out.println("Numero invalido, por favor intente nuevamente");
			}
		}
		
		valido= false;
	}

	@Override
	public void mostrarResultado() {
		// TODO Auto-generated method stub

	}

}
