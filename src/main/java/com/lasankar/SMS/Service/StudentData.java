package com.lasankar.SMS.Service;

import java.util.List;

import com.lasankar.SMS.Repository.Entity.Student;

public interface StudentData {
	
	public int addStudent(Student student);
	public List<Student> FindStudents();

}
