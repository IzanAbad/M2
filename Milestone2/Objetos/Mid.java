package Objetos;

import Interfaces.salariable;

public class Mid extends TemplateEmployee implements salariable{
	
	private double salarioFinal;

public Mid() {
		
	}
	
	public Mid(double salario, String nombre, int edad, char sexo) {
		super(salario, nombre, edad, sexo);
		
		this.salario = comprobarSalario(salario);
		calcularSalario();
		
	}
	
	@Override
	public String toString() {
		return "Mid [salarioFinal=" + salarioFinal + ", salario=" + salario + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	public double comprobarSalario(double salario) {
		
		if (salario >= 1800 && salario <= 2500) {
			return salario;
		} else {
			return 1800;
		}
		
	}
	
	public void calcularSalario() {
		
		this.salarioFinal = this.salario - (this.salario * 0.10);
		
	}
	
}
