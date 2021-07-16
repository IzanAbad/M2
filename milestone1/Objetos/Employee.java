package Objetos;

import Interfaces.salariable;

public class Employee extends TemplateEmployee implements salariable{

private double salarioFinal;
	
	public Employee() {
		
		
		
	}
	
	public Employee(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		calcularSalario();
		
	}
	
	@Override
	public String toString() {
		return "Employee [salarioFinal=" + salarioFinal + ", salario=" + salario + ", nombre=" + nombre + ", edad="
				+ edad + ", sexo=" + sexo + "]";
	}

	public void calcularSalario() {
		
		this.salarioFinal = this.salario-(this.salario*0.15);
		
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
}
