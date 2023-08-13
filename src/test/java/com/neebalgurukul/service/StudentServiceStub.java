package com.neebalgurukul.service;

import java.util.List;

import com.neebalgurukul.business.StudentAPI;
import com.neebalgurukul.model.Student;


public class StudentServiceStub implements StudentAPI{

    @Override
    public List<Student> getAllStudents() {
	return  List.of(new Student("Ajay", "ajay@gmail.com", "Java", 23),
		new Student("Shiv", "shiv@gmail.com", "Java", 23),
		new Student("Raj", "raj@gmail.com", "Java", 23),
		new Student("Akshay", "akshay@gmail.com", "Java", 23)
		);
    }
}