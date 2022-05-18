package com.lasankar.SMS.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import om.lasankar.SMS.Repository.Entity.Student;

@Repository
public class StudentDao {
	
	
	JdbcTemplate jdbctemplate;
	
	
	@Autowired
	public StudentDao(JdbcTemplate jdbctemplate) {
		super();
		this.jdbctemplate = jdbctemplate;
	}



	public int Add(Student student)
	{
		String sql="insert into student (id,name,email,mobile) values(?,?,?,?)";
		
		 int count = jdbctemplate.update(sql, student.getId(),student.getName(),student.getEmail(),student.getMobile());
		return count;
	}

}
