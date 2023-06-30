package springProject.FirstProject;

public class Engineering{
	private Organization org;
	

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "Engineering [org=" + org + "]";
	}
}
 