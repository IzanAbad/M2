package Objetos;

import Interfaces.salariable;

public class Senior extends TemplateEmployee implements salariable{
	
	private double salarioFinal;
	
	public Senior() {
		
	}
	
	public Senior(double salario, String nombre, int edad, char sexo) {
		super(salario, nombre, edad, sexo);
		
		this.salario = comprobarSalario(salario);
		calcularSalario();
		
	}
	
	@Override
	public String toString() {
		return "Senior [salarioFinal=" + salarioFinal + ", salario=" + salario + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}

	public double comprobarSalario(double salario) {
		
		if (salario >= 2700 && salario <= 4000) {
			return salario;
		} else {
			return 2700;
		}
		
	}
	
	public void calcularSalario() {
		
		this.salarioFinal = this.salario - (this.salario * 0.05);
		
	}

}
