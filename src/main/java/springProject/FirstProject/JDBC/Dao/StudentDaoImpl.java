package springProject.FirstProject.JDBC.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import springProject.FirstProject.JDBC.Entity.StudentEntity;

@Component("StudentImpl")
public class StudentDaoImpl implements StudentDao{
	@Autowired()
	@Qualifier("data")
    private JdbcTemplate conncn;
	
	@Override
	public int insert(StudentEntity student) {
		String query="insert into student values(?,?,?)";
		int result=conncn.update(query,student.getId(),student.getName(),student.getCity());
		return result;
	}
	
	public JdbcTemplate getConncn() {
		return conncn;
	}
	public void setConncn(JdbcTemplate conncn) {
		this.conncn = conncn;
	}

}
