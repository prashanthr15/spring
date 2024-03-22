package com.prog.SpringJdbcApi.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("empDao")
public class EmployeeDaoImpl implements IEmployeeDao {

	List<Employee> empList=null;
	private static final String SQL_QUERY = "select * from employee";
	@Autowired
	private DataSource datasource;
	
	public EmployeeDaoImpl() {
		System.out.println("EmployeeDaoImpl bean created");
	}
	
	@Override
	public List<Employee> getTheEmployee() {
		// TODO Auto-generated method stub
		System.out.println("datasource : " + datasource.getClass().getName());
		try {
			Connection connect = datasource.getConnection();
			
			PreparedStatement pstmt = connect.prepareStatement(SQL_QUERY);
			
			
			
			ResultSet rs = pstmt.executeQuery();
			
			empList = new ArrayList();
			
//			Integer id = rs.getInt(1);
//			emp.setId(id);
//			String city = rs.getString(2);
//			emp.setCity(city);
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt("id"));
				emp.setName(rs.getString("emp_city"));
				emp.setCity(rs.getString("emp_name"));
				emp.setAge(rs.getInt("emp_age"));
				
				empList.add(emp);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return empList;
	}

}
