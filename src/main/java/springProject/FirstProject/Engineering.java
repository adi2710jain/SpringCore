package springProject.FirstProject;

import java.util.List;

public class Engineering{
	private Organization org;
	private List<Integer> li;
	

	public List<Integer> getLi() {
		return li;
	}

	public void setLi(List<Integer> li) {
		this.li = li;
	}

	public Organization getOrg() {
		return org;
	}

	public void setOrg(Organization org) {
		this.org = org;
	}

	@Override
	public String toString() {
		return "Engineering [org=" + org + ", li=" + li + "]";
	}


}
 