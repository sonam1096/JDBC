package com.neebalgurukul.service;

import com.neebalgurukul.dao.LoginDAO;
import com.neebalgurukul.dao.StudentDAO;
import com.neebalgurukul.model.Login;

public class RegisterService {
    
    public boolean registerSuccess(String username,String password, String sname,String email, String course, int age) throws Exception
    {
	LoginDAO daologin = new LoginDAO();
	StudentDAO daostudent = new StudentDAO();
	boolean res = daologin.getLoginInsert(username,password);
	boolean res1 = daostudent.insertStudent(sname,email,course,age);
	
	if(res && res1)
	{
	    return true;
	}
	else
	{
	    return false;
	}
    }
}
