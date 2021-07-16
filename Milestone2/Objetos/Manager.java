package Objetos;

import Interfaces.salariable;

public class Manager extends TemplateEmployee implements salariable{

	private double salarioFinal;
	
	public Manager() {
		
	}
	
	public Manager(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		this.salario = comprobarSalario(salario);
		calcularSalario();
		
	}
	
	@Override
	public String toString() {
		return "Manager [salarioFinal=" + salarioFinal + ", salario=" + salario + ", nombre=" + nombre + ", edad="
				+ edad + ", sexo=" + sexo + "]";
	}
	
	public double comprobarSalario(double salario) {
		
		if (salario >= 3000 && salario <= 5000) {
			return salario;
		} else {
			return 3000;
		}
		
	}

	public void calcularSalario() {
		
		this.salarioFinal = this.salario+(this.salario*0.10);
		
	}

	public double getSalarioFinal() {
		return salarioFinal;
	}

	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	
}
