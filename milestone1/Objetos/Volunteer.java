package Objetos;

public class Volunteer extends TemplateEmployee{
	
	public Volunteer() {
		
		
		
	}
	
	public Volunteer(double salario, String nombre, int edad, char sexo) {
		
		super(salario, nombre, edad, sexo);
		
	}

	@Override
	public String toString() {
		return "Volunteer [salario=" + " Los voluntarios no cobran " + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + "]";
	}
	
}
