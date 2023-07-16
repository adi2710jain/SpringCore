package springProject.FirstProject.Annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("Aditya")
	private String name;
	@Value("fzd")
	private String City;
	@Autowired
	private Address add;
	@Value("#{True}")
	private boolean isActive;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", City=" + City + ", add=" + add + ", isActive=" + isActive + "]";
	}
	
	

}
