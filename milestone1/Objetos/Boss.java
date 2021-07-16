package Objetos;

import Interfaces.salariable;

public class Boss extends TemplateEmployee implements salariable{

private double salarioFinal;
	
	public Boss() {
		
		
		
	}
	
	public Boss(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		calcularSalario();
		
	}
	
	@Override
	public String toString() {
		return "Boss [salarioFinal=" + salarioFinal + ", salario=" + salario + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	public void calcularSalario() {
		
		this.salarioFinal = this.salario+(this.salario*0.5);
		
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
}