package Objetos;

public class Volunteer extends TemplateEmployee{
	
	public Volunteer() {
		
		
		
	}
	
	public Volunteer(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		this.salario = comprobarSalario(salario);
		
	}

	@Override
	public String toString() {
		return "Volunteer [salario=" + salario + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
	public double comprobarSalario(double salario) {
		
		return 0;
		
	}
	
}
