package com.repo;

import java.sql.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.model.Employee;


@Repository("Repo")
public class EmployeeRepo implements IEmpolyeeRepo {
	private static final
	String SQL_QUERY = "SELECT * FROM Employee";

	@Autowired
	private DataSource dataSource;
	
	
	List<Employee> employees=null;
	
	@Override
	public List<Employee> getEmplyeeInfo() 
	{
		try {
		//register
		//connection
		Connection connection =dataSource.getConnection();
		System.out.println("DataSource implementation is "+dataSource.getClass());
		
		PreparedStatement pst = connection.prepareStatement(SQL_QUERY);
		
		ResultSet rs = pst.executeQuery();
		
		employees =new ArrayList<>();
		
		while(rs.next()) {
			Employee emp= new Employee();
			
//			Integer i=rs.getInt(1);
//			emp.setId(1);
			
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setCity(rs.getString(3));
			
			employees.add(emp);
		
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return employees;
	}

	

}
