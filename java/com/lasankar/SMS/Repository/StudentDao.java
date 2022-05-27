package com.lasankar.SMS.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lasankar.SMS.Repository.Entity.Student;

@Repository
public class StudentDao {

	// JdbcTemplate jdbctemplate;
	@Autowired
	SMSDataRepository jpasrepository;

	/*
	 * @Autowired public StudentDao(JdbcTemplate jdbctemplate) { super();
	 * this.jdbctemplate = jdbctemplate; }
	 */

	public void Add(Student student) {
		// String sql="insert into student (name,email,mobile) values(?,?,?)";
		// int count =
		// jdbctemplate.update(sql,student.getName(),student.getEmail(),student.getMobile());
		jpasrepository.save(student);
		// return count;
	}

	public List<Student> FindAll() {

		return jpasrepository.findAll();
		// return jdbctemplate.query("select * from student" , new
		// BeanPropertyRowMapper(Student.class));

	}

	public Optional<Student> findStudent(int id)
	{
		return jpasrepository.findById(id);
	}

	public void deleteStudent(int id) {
		jpasrepository.deleteById(id);
	}
	
}
