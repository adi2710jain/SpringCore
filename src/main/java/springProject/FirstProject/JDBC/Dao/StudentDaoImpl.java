package springProject.FirstProject.JDBC.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import springProject.FirstProject.JDBC.Entity.StudentEntity;

public class StudentDaoImpl implements StudentDao{
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
