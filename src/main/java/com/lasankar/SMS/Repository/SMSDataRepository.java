package com.lasankar.SMS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lasankar.SMS.Repository.Entity.Student;

public interface SMSDataRepository extends JpaRepository<Student, Integer> {

}
