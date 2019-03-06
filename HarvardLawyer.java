
public class HarvardLawyer extends Employee {
        
	public double getSalary() {
   	 return 40000.0*0.20;
    }
	public int getVacationDays() {
   	 return super.getVacationDays()+3;
	}
	public String getVacationForm() {
		return "pink";
	}
}
