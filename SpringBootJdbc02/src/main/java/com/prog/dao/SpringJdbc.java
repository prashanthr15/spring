package com.prog.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//dao means data access object

@Repository
public class SpringJdbc {
 
//	private static final String SQL_QUERY = "insert into student (id,name,city)"
//			+ "values(1,'rohit','pune')";
	
	private static final String SQL_QUERY = "insert into course (cid,cname)"
			+ "values(?,?)";
	
	private static final String DELETE_QUERY = "delete from course where cid=?";
	
	private static final String SELECT_QUERY ="select cid,cname from course where cid=? ";
	@Autowired
	private JdbcTemplate jdbc;
	
//	public void insert() {
//		
//		System.out.println("implementing class of jdbctemplate : "+ jdbc.getClass().getName());
//		jdbc.update(SQL_QUERY);
//	}
	
	
public void insert(CourseInfo info) {
		
		System.out.println("implementing class of jdbctemplate : "+ jdbc.getClass().getName());
		//debugger
		System.out.println(info.getCid()+""+info.getCname());
		//jdbc.update(SQL_QUERY,1,java) we can also give like this but am passing obj
		int rowsAffected=jdbc.update(SQL_QUERY,info.getCid(),info.getCname());
		
		System.out.println("rows affected : " + rowsAffected);
		
	}

public void  deleteById(long id) {
	int row=jdbc.update(DELETE_QUERY, id);
	System.out.println("record dekete with id : "+id+ "num of records deleted : "+row);
}

public CourseInfo findById(long id) {

	return jdbc.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(CourseInfo.class),id);
}


}
