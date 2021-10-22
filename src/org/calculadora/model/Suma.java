/**
 * 
 */
package org.calculadora.model;
import java.util.Scanner;
        
/**
 * @author moises.alonso
 *
 */
public class Suma implements IOperacion{

    Scanner sc = new Scanner(System.in);
    int n1,n2;
    int resultado;
    
	//@Override
	public int operar(int valor1, int valor2) {
		// TODO Auto-generated method stub
                resultado = valor1 + valor2;
		return 0;
	}

	//@Override
	public void solicitarDatos() {
		// TODO Auto-generated method stub
                System.out.println("Digite el primer valor: ");
                n1 = sc.nextInt();
                System.out.println("Digite el segundo valor: ");
                n2 = sc.nextInt();
                operar(n1,n2);
	}

	//@Override
	public void mostrarResultado() {
		// TODO Auto-generated method stub
                System.out.println("El Resultado de la suma es: "+resultado);
	}

}
