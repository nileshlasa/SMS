package com.lasankar.SMS.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lasankar.SMS.Repository.StudentDao;
import com.lasankar.SMS.Repository.Entity.Student;

@Service
public class StudentDataImpl implements StudentData{
	
	@Autowired
	StudentDao studentdao;
	
	
	@Override
	public void addStudent(Student student) {
		studentdao.Add(student);
	}


	@Override
	public List<Student> FindStudents() {
		// TODO Auto-generated method stub
		return studentdao.FindAll();
	}


	@Override
	public Optional<Student> findStudent(int id) {
		// TODO Auto-generated method stub
		return studentdao.findStudent(id);
	}


	public void deleteStudent(int id) {
		studentdao.deleteStudent(id);
		
	}
	
	

}
