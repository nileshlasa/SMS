package com.lasankar.SMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lasankar.SMS.Repository.StudentDao;

import om.lasankar.SMS.Repository.Entity.Student;

@Service
public class AddStudent {
	
	@Autowired
	StudentDao studentdao;
	
	public void AddToDataBase(Student student)
	{
		int count = studentdao.Add(student);
	}

}
