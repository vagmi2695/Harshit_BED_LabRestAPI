package com.greatlearning.studentmgmtsys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.greatlearning.studentmgmtsys.model.Student;
import com.greatlearning.studentmgmtsys.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentService stservice;

	@RequestMapping("/list")
	public String listStudent(Model model) {
		List<Student> studentList = stservice.getAllStudents();
		model.addAttribute("Students", studentList);
		return "list_students";
	}

	@RequestMapping("/showform")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("Student", student);
		return "student_form";
	}

	@PostMapping("/save")
	public String showsave(@RequestParam("id") int id, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("course") String course,
			@RequestParam("country") String country) {
		Student student = new Student();
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setCourse(course);
		student.setCountry(country);
		stservice.insertRecords(student);
		return "redirect:/student/list";
	}

}
