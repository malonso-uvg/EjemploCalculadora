/**
 * 
 */
package org.calculadora.controller;

import org.calculadora.model.Division;
import org.calculadora.model.Multiplicacion;
import org.calculadora.model.Residuo;
import org.calculadora.model.Resta;
import org.calculadora.model.Suma;

/**
 * @author moises.alonso
 *
 */
public class CalculadoraBase {
	private Suma sumaEnteros;
	private Resta restaEnteros;
	private Multiplicacion multiplicacionEnteros;
	private Division divisionEnteros;
	private Residuo residuoEnteros;
	
	public CalculadoraBase() {
		sumaEnteros = new Suma();
		restaEnteros = new Resta();
		multiplicacionEnteros = new Multiplicacion();
		divisionEnteros = new Division();
		residuoEnteros = new Residuo();
	}
	
	public Suma getSumaEnteros() {
		return sumaEnteros;
	}
	public void setSumaEnteros(Suma sumaEnteros) {
		this.sumaEnteros = sumaEnteros;
	}
	public Resta getRestaEnteros() {
		return restaEnteros;
	}
	public void setRestaEnteros(Resta restaEnteros) {
		this.restaEnteros = restaEnteros;
	}
	public Multiplicacion getMultiplicacionEnteros() {
		return multiplicacionEnteros;
	}
	public void setMultiplicacionEnteros(Multiplicacion multiplicacionEnteros) {
		this.multiplicacionEnteros = multiplicacionEnteros;
	}
	public Division getDivisionEnteros() {
		return divisionEnteros;
	}
	public void setDivisionEnteros(Division divisionEnteros) {
		this.divisionEnteros = divisionEnteros;
	}
	public Residuo getResiduoEnteros() {
		return residuoEnteros;
	}
	public void setResiduoEnteros(Residuo residuoEnteros) {
		this.residuoEnteros = residuoEnteros;
	}
	
	
}
