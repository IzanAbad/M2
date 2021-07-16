package Objetos;

import Interfaces.salariable;

public class Junior extends TemplateEmployee implements salariable{
	
	private double salarioFinal;

public Junior() {
		
	}
	
	public Junior(double salario, String nombre, int edad, char sexo) {
		super(salario, nombre, edad, sexo);
		
		this.salario = comprobarSalario(salario);
		calcularSalario();
		
	}
	
	@Override
	public String toString() {
		return "Junior [salarioFinal=" + salarioFinal + ", salario=" + salario + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	public double comprobarSalario(double salario) {
		
		if (salario >= 900 && salario <= 1600) {
			return salario;
		} else {
			return 900;
		}
		
	}
	
	public void calcularSalario() {
		
		this.salarioFinal = this.salario - (this.salario * 0.15);
		
	}
	
}
