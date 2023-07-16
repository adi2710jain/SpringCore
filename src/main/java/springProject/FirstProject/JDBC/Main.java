package springProject.FirstProject.JDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import springProject.FirstProject.JDBC.Dao.StudentDao;
import springProject.FirstProject.JDBC.Entity.StudentEntity;

public class Main {

	public static void main(String[] args) {
	  ApplicationContext context=new ClassPathXmlApplicationContext("springProject/FirstProject/JDBC/"
	  		+ "config.xml");
//	  JdbcTemplate conncn=context.getBean("jdbcTemp",JdbcTemplate.class);
//	  String query="insert into student values(?,?,?)";
//	  int result=conncn.update(query,2,"Adi","kanpur");
//	  System.out.println(result);
	  StudentDao stdDao=context.getBean("studentDb",StudentDao.class);
	  StudentEntity student=new StudentEntity(444,"ravi","Lucknow");
	  System.out.println(stdDao.insert(student));

	}

}
