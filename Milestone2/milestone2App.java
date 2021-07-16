import Objetos.*;

public class milestone2App {

	public static void main(String[] args) {
		
		Boss boss = new Boss(9000, "Juan", 50, 'H');
		Manager manager = new Manager(4000, "Paco", 50, 'H');
		Senior senior = new Senior(3000, "Pepe", 50, 'H');
		Mid mid = new Mid(2000, "Maria", 50, 'M');
		Junior junior = new Junior(1500, "Alberto", 50, 'H');
		Volunteer volunteer = new Volunteer(1000, "Juan", 50, 'H');
		
		
		System.out.println(boss.toString());
		System.out.println(manager.toString());
		System.out.println(senior.toString());
		System.out.println(mid.toString());
		System.out.println(junior.toString());
		System.out.println(volunteer.toString());
		
	}
	
	

}
