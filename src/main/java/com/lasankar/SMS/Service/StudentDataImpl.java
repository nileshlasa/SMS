package com.lasankar.SMS.Service;

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

}
