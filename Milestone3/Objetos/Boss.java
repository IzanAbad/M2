package Objetos;

import Interfaces.salariable;

public class Boss extends TemplateEmployee implements salariable{

private double salarioFinal;
private double salarioNeto;
private double brutoAnual;
private double netoAnual;

	public Boss() {
		
	}
	
	public Boss(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		this.salario = comprobarSalario(salario);
		calcularSalario();
		this.salarioNeto = salarioNeto(salarioFinal);
		this.brutoAnual = salarioFinal * 12;
		this.netoAnual = salarioNeto * 12;
		
	}
	
	
	
	@Override
	public String toString() {
		return "Boss [Salario Bruto=" + salarioFinal + ", salarioNeto=" + salarioNeto + ", Bruto Anual=" + brutoAnual
				+ ", Neto Anual=" + netoAnual + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
	}

	public double comprobarSalario(double salario) {
		
		if (salario >= 8000) {
			return salario;
		} else {
			return 8000;
		}
		
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
	public double salarioNeto(double salarioFinal) {
		
		double salarioNeto=0;
		
		salarioNeto = salarioFinal - (salarioFinal*0.32);
		
		return salarioNeto;
		
	}
	public void aplicarBonus() {
		
		this.brutoAnual = this.brutoAnual +(this.brutoAnual * 0.10);
		
	}
	
}