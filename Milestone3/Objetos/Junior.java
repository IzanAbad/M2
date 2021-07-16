package Objetos;

import Interfaces.salariable;

public class Junior extends TemplateEmployee implements salariable{
	
	private double salarioFinal;
	private double salarioNeto;
	private double brutoAnual;
	private double netoAnual;
public Junior() {
		
	}
	
	public Junior(double salario, String nombre, int edad, char sexo) {
		super(salario, nombre, edad, sexo);
		
		this.salario = comprobarSalario(salario);
		calcularSalario();
		this.salarioNeto = salarioNeto(salarioFinal);
		this.brutoAnual = salarioFinal * 12;
		this.netoAnual = salarioNeto * 12;
	}
	
	@Override
	public String toString() {
		return "Junior [Salario Bruto=" + salarioFinal + ", salarioNeto=" + salarioNeto + ", Bruto Anual=" + brutoAnual
				+ ", Neto Anual=" + netoAnual + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
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
	public double salarioNeto(double salarioFinal) {
		
		double salarioNeto=0;
		
		salarioNeto = salarioFinal - (salarioFinal*0.2);
		
		return salarioNeto;
		
	}
	public void aplicarBonus() {
		
		this.brutoAnual = this.brutoAnual +(this.brutoAnual * 0.10);
		
	}
}
