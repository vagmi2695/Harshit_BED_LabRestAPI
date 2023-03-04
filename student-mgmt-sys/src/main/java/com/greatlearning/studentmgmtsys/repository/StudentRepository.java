package com.greatlearning.studentmgmtsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.studentmgmtsys.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
