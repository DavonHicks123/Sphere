
public class EmployeeMain {

	public static void main(String[] args) {
		printEmployee(null);
		clean();

	}

	private static void clean() {
		 System.out.println("Cleaning!");
		
	}

	private static void printEmployee(Employee E) {
		Lawyer p=new Lawyer();
		System.out.println("Lawyer:");
		System.out.println(p.getSalary());
		System.out.println(p.getHours());
		System.out.println(p.getVacationDays());
		System.out.println(p.getVacationForm());
		System.out.println();
		
		Janitor d=new Janitor();
		System.out.println("Janitor:");
		System.out.println(d.getHours());
		System.out.println(d.getSalary());
		System.out.println(d.getVacationDays());
		System.out.println();
		
		HarvardLawyer l=new HarvardLawyer();
	    System.out.println("HarvardLawyer:");
		System.out.println(l.getSalary());
		System.out.println(l.getVacationDays());
		System.out.println(l.getVacationForm());
		System.out.println();

	}
	

}
