package com.lasankar.SMS.Service;

import java.util.List;
import java.util.Optional;

import com.lasankar.SMS.Repository.Entity.Student;

public interface StudentData {
	
	public void addStudent(Student student);
	public List<Student> FindStudents();
	public Optional<Student> findStudent(int id);

}
