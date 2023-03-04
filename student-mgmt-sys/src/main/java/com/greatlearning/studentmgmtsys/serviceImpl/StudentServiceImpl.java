package com.greatlearning.studentmgmtsys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatlearning.studentmgmtsys.model.Student;
import com.greatlearning.studentmgmtsys.repository.StudentRepository;
import com.greatlearning.studentmgmtsys.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentrepo;

	@Override
	public void insertRecords(Student student) {
		// TODO Auto-generated method stub
		studentrepo.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentrepo.findAll();
	}
}
