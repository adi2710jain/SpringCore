package springProject.FirstProject.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
	
	public static void main(String args[]) {
		ApplicationContext con=new ClassPathXmlApplicationContext("springProject/FirstProject/Annotation/annot.xml");
		Student stu=con.getBean("stu",Student.class);
		System.out.println(stu);
	}

}
