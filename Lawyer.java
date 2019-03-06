
public class Lawyer extends Employee {
	public int getVacationDays() {
		return super.getVacationDays()+5;
	}
	public String getVacationForm() {
		return "pink";
	}
	 public double getSalary() {
    	 return super.getSalary();
	 }
	 
	public void sue() {
		System.out.println("I'll see you in court!");
	}

}
