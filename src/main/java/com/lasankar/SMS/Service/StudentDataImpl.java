package com.lasankar.SMS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lasankar.SMS.Repository.StudentDao;
import com.lasankar.SMS.Repository.Entity.Student;

@Service
public class StudentDataImpl implements StudentData{
	
	@Autowired
	StudentDao studentdao;
	
	
	@Override
	public int addStudent(Student student) {
		int count = studentdao.Add(student);
		return count;
	}


	@Override
	public List<Student> FindStudents() {
		// TODO Auto-generated method stub
		return studentdao.FindAll();
	}
	
	

}
