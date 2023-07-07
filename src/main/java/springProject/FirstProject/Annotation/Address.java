package springProject.FirstProject.Annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	@Value("1066")
	private String houseNo;
	@Value("Jain nagar, Fzd")
	private String add;
	
	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", add=" + add + "]";
	}

}
