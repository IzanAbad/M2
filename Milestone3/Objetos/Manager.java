package Objetos;

import Interfaces.salariable;

public class Manager extends TemplateEmployee implements salariable{

	private double salarioFinal;
	private double salarioNeto;
	private double brutoAnual;
	private double netoAnual;
	public Manager() {
		
	}
	
	public Manager(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		this.salario = comprobarSalario(salario);
		calcularSalario();
		this.salarioNeto = salarioNeto(salarioFinal);
		this.brutoAnual = salarioFinal * 12;
		this.netoAnual = salarioNeto * 12;
	}
	
	@Override
	public String toString() {
		return "Manager [Salario Bruto=" + salarioFinal + ", salarioNeto=" + salarioNeto + ", Bruto Anual=" + brutoAnual
				+ ", Neto Anual=" + netoAnual + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
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
	public double salarioNeto(double salarioFinal) {
			
			double salarioNeto=0;
			
			salarioNeto = salarioFinal - (salarioFinal*0.26);
			
			return salarioNeto;
			
	}
	public void aplicarBonus() {
		
		this.brutoAnual = this.brutoAnual +(this.brutoAnual * 0.10);
		
	}
	
}
