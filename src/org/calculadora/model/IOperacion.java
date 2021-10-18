/**
 * 
 */
package org.calculadora.model;

/**
 * @author moises.alonso
 *
 */
public interface IOperacion {
	
	int operar(int valor1, int valor2);
	void solicitarDatos();
	void mostrarResultado();

}
