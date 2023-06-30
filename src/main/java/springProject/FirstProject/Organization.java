package springProject.FirstProject;

public class Organization {
	private String divName;
	private int noofEmployees;
	public String getDivName() {
		return divName;
	}
	public void setDivName(String divName) {
		this.divName = divName;
	}
	public int getNoofEmployees() {
		return noofEmployees;
	}
	public void setNoofEmployees(int noofEmployees) {
		this.noofEmployees = noofEmployees;
	}
	@Override
	public String toString() {
		return "Organization [divName=" + divName + ", noofEmployees=" + noofEmployees + "]";
	}
	
	
}
