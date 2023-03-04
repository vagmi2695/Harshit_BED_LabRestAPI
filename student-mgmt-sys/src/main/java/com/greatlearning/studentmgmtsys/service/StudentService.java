package com.greatlearning.studentmgmtsys.service;

import java.util.List;

import com.greatlearning.studentmgmtsys.model.Student;

public interface StudentService {

	// INSERT NEW RECORDS
	public void insertRecords(Student student);

	// PRINT ALL RECORDS
	public List<Student> getAllStudents();

}
