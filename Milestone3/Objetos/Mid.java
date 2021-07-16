package Objetos;

import Interfaces.salariable;

public class Mid extends TemplateEmployee implements salariable{
	
	private double salarioFinal;
	private double salarioNeto;
	private double brutoAnual;
	private double netoAnual;
public Mid() {
		
	}
	
	public Mid(double salario, String nombre, int edad, char sexo) {
		super(salario, nombre, edad, sexo);
		
		this.salario = comprobarSalario(salario);
		calcularSalario();
		this.salarioNeto = salarioNeto(salarioFinal);
		this.brutoAnual = salarioFinal * 12;
		this.netoAnual = salarioNeto * 12;
	}
	
	@Override
	public String toString() {
		return "Mid [Salario Bruto=" + salarioFinal + ", salarioNeto=" + salarioNeto + ", Bruto Anual=" + brutoAnual
				+ ", Neto Anual=" + netoAnual + ", nombre=" + nombre + ", edad=" + edad
				+ ", sexo=" + sexo + "]";
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
	public double salarioNeto(double salarioFinal) {
			
			double salarioNeto=0;
			
			salarioNeto = salarioFinal - (salarioFinal*0.15);
			
			return salarioNeto;
			
	}
	public void aplicarBonus() {
		
		this.brutoAnual = this.brutoAnual +(this.brutoAnual * 0.10);
		
	}
}
