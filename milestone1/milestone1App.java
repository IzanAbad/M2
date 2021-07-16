package Objetos;

public class milestone1App {

	public static void main(String[] args) {
		
		Manager manager = new Manager(1500, "Paco", 50, 'H');
		Boss boss = new Boss(1500, "Juan", 50, 'H');
		Employee employee = new Employee(1500, "Juan", 50, 'H');
		Volunteer volunteer = new Volunteer(1500, "Juan", 50, 'H');
		
		
		System.out.println(manager.toString());
		System.out.println(boss.toString());
		System.out.println(employee.toString());
		System.out.println(volunteer.toString());
		
	}
	
	

}
