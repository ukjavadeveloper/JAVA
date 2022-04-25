package edu.institute.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import edu.institute.bean.Employee;
@Repository
public class EmployeeRepository {
	@Autowired
	private JdbcTemplate temp;
	public int saveEmployee(Employee emp) {
		Object data[] = {emp.getName(), emp.getEmail(), emp.getPassword()};
		int count = temp.update("insert into employee values(0,?,?,?)", data);
		return count;
	}
	public int delete(int id) {
		int count=temp.update("delete from employee where id=?",id);
		return count;
	}
	public List<Employee> getAll() {
		String query ="select * from employee";
		EmployeeRowExtractor extractor = new EmployeeRowExtractor();
		return temp.query(query, extractor);
		//return temp.query(query, new BeanPropertyRowMapper(Employee.class));
	}
	public int updateEmployee(Employee emp) {
		Object data[]= {emp.getName(), emp.getEmail(), emp.getPassword(), emp.getId()};
		int count = temp.update("update employee set name=?,email=?,password=? where id=?",data);
		return count;
	}
}
 class EmployeeRowExtractor implements ResultSetExtractor<List<Employee>>{
	 @Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<Employee> empList = new ArrayList<Employee>();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("name"));
				emp.setEmail(rs.getString("email"));
				emp.setPassword(rs.getString("password"));
				empList.add(emp);
			}
			return empList;
		}
 }