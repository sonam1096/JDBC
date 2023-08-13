package webapp;

import java.util.ArrayList;
import java.util.List;

import com.neebalgurukul.dao.LoginDAO;
import com.neebalgurukul.model.Login;
import com.neebalgurukul.service.LoginService;

public class LoginTest {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LoginDAO dao = new LoginDAO();
	LoginService service = new LoginService();
	System.out.println("Login Test");
	List<Login> userList = new ArrayList<>();

	try {
//	    	if(service.isValidUser("Ram", "Ram123")) {
//	    	    System.out.println("Valid");
//	    	}
//	    	else {
//	    	    System.out.println("Invalid");
//	    	}
//		userList= dao.getLoginDetails();
	    for (Login obj : userList) {
		System.out.println(obj.getUname() + "," + obj.getPswd());
	    }

	    // System.out.println("Password for username = Ram is
	    // "+dao.getLoginPassword("Ram").getPswd());
	    // dao.getLoginInsert("A","a123",true);

//		String passExists = dao.getLoginPassword("A").getPswd();
//		if(!passExists.isEmpty())
//		{
//		    dao.deleteLoginSoft("A");
//		}

	    String passExists1 = dao.getLoginPassword("Shrikant").getPswd();
	    if (!passExists1.isEmpty()) {
		dao.deleteLoginHard("Shrikant");
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
