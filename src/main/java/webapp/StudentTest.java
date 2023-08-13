package webapp;

import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.dao.StudentDAO;
import com.neebalgurukul.model.Student;



public class StudentTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	StudentDAO dao = new StudentDAO();
	System.out.println("Student Test");
	List<Student> studentList = new ArrayList<>();
	
	try {
	    studentList= dao.getStudentDetails();
		for (Student obj : studentList) {
			System.out.println(obj.getId()+","+obj.getName()+","+obj.getEmail()+","+obj.getCourse()+","+obj.getAge());
		}
		
//		Student a = dao.getOneStudent(2);
//		System.out.println(a);
		
//		dao.insertStudent("krishna","krishna@gmail.com","java", 23);
		
//	    int passExists = dao.getOneStudent(2).getId();
//		if(passExists!=0)
//		{
//		    dao.deleteStudent(passExists);
//		}
//		else
//		{
//		    System.out.println("Id doesn't exists");
//		}
//	    
	    
	}catch(Exception e)
	{
	    e.printStackTrace();
	}
	
    }

}
