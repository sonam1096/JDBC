package com.neebalgurukul.business;

import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.model.Student;

public class StudentServiceImpl {
    StudentAPI studentAPI;
    public StudentServiceImpl(StudentAPI studentAPI) {
	this.studentAPI= studentAPI;
    }
    
    public List<Student> getStudentsStartingWithA() {
	List<Student> list = studentAPI.getAllStudents();
	List<Student> listA = new ArrayList<>();
	for (Student s : list) {
	    if (s.getName().startsWith("A")) {
		listA.add(s);
	    }
	}
	
	return listA;
    }
}
