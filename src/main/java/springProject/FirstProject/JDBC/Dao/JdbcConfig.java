package springProject.FirstProject.JDBC.Dao;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {"springProject.FirstProject.JDBC"})
public class JdbcConfig {
	
	@Bean("conncn")
	public DriverManagerDataSource getConnection() {
		DriverManagerDataSource conncn=new DriverManagerDataSource();
		conncn.setDriverClassName("com.mysql.cj.jdbc.Driver");
		conncn.setUrl("jdbc:mysql://localhost:3306/springjdbc?useSSL=false");
		conncn.setUsername("root");
		conncn.setPassword("Raviram@#94");
		return conncn;
		
	}
	
	@Bean("data")
	public JdbcTemplate getJdbcTemp() {
		JdbcTemplate temp=new JdbcTemplate();
		temp.setDataSource(getConnection());
		return temp;
			
	}

}
