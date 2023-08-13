package com.neebalgurukul.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.neebalgurukul.model.Student;
import com.neebalgurukul.service.StudentServiceStub;

public class StudentServiceImplTest {
    
    @Test
    public void testGetStudentsStartingWithA()
    {
	StudentServiceStub stub = new StudentServiceStub();
	
	int expectedOutput = 2;
	
	List<Student> studList = stub.getAllStudents();
	List<Student> listA = new ArrayList<Student>();
	
	for(Student st : studList) {
	    if(st.getName().startsWith("A")) {
		listA.add(st);
	    }	
	}
	assertEquals(expectedOutput, listA.size());
    }

    @Test
    public void testGetStudentsStartingWithA_usingAMock()
    {
	StudentAPI mockStudentAPI = mock(StudentAPI.class);
	
	int expectedOutput = 2;
	
	List<Student> students = List.of(new Student("Ajay", "ajay@gmail.com", "Java", 23),
		new Student("Shiv", "shiv@gmail.com", "Java", 23),
		new Student("Raj", "raj@gmail.com", "Java", 23),
		new Student("Akshay", "akshay@gmail.com", "Java", 23)
		);
	
	when(mockStudentAPI.getAllStudents()).thenReturn(students);
	
	StudentServiceImpl studServiceImpl = new StudentServiceImpl(mockStudentAPI);
	
	assertEquals(expectedOutput,studServiceImpl.getStudentsStartingWithA().size());
    }
}
